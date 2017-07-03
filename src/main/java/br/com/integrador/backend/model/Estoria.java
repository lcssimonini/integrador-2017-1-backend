package br.com.integrador.backend.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by simonini on 17/06/17.
 */
@Entity
public class Estoria extends PersistableEntity {

    private static final long serialVersionUID = -4304297196981863136L;

    @NotEmpty(message = "Estória precisa ter um nome")
    private String nome;

    @ManyToOne(fetch= FetchType.LAZY, cascade={ CascadeType.MERGE })
    @JoinColumn(name="projeto_id")
    private Projeto projeto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
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
