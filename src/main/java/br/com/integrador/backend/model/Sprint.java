package br.com.integrador.backend.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
public class Sprint extends PersistableEntity {

    private static final long serialVersionUID = -8633248191001332824L;

    @NotEmpty(message = "Sprint precisa ter um nome")
    private String nome;

    @ManyToOne(fetch= FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name="projeto_id", referencedColumnName="id")
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

        if (!(o instanceof Sprint)) return false;

        Sprint sprint = (Sprint) o;

        return new EqualsBuilder()
                .append(getNome(), sprint.getNome())
                .append(projeto, sprint.projeto)
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
