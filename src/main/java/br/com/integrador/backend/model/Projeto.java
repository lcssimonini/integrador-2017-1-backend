package br.com.integrador.backend.model;

import lombok.Data;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

/**
 * Created by simonini on 17/06/17.
 */

@Data
@Entity
public class Projeto extends PersistableEntity {

    private static final long serialVersionUID = -9081849604597137756L;

    @NotEmpty(message = "Projeto precisa ter um nome")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Projeto)) return false;

        Projeto projeto = (Projeto) o;

        return new EqualsBuilder()
                .append(getNome(), projeto.getNome())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getNome())
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("nome", nome)
                .toString();
    }
}
