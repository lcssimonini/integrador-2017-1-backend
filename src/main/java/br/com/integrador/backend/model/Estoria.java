package br.com.integrador.backend.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by simonini on 17/06/17.
 */
@Entity
public class Estoria extends PersistableEntity {

    @NotEmpty(message = "Funcionário precisa ter um cargo")
    private String nome;

    @ManyToOne
    private Projeto projeto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Estoria)) return false;

        Estoria estoria = (Estoria) o;

        return new EqualsBuilder()
                .append(getNome(), estoria.getNome())
                .append(projeto, estoria.projeto)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getNome())
                .append(projeto)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("nome", nome)
                .append("projeto", projeto)
                .toString();
    }
}
