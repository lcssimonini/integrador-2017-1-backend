package br.com.integrador.backend.model;

import br.com.integrador.backend.model.enumerated.StatusTarefa;
import lombok.Data;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * Created by simonini on 17/06/17.
 */
@Data
@Entity
public class Tarefa extends PersistableEntity {

    @NotEmpty(message = "Tarefa precisa ter um nome")
    private String nome;

    @NotEmpty(message = "Tarefa precisa ter uma descrição")
    private String descricao;

    @ManyToOne
    private Estoria estoria;

    @Enumerated(EnumType.STRING)
    private StatusTarefa statusTarefa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Tarefa)) return false;

        Tarefa tarefa = (Tarefa) o;

        return new EqualsBuilder()
                .append(getNome(), tarefa.getNome())
                .append(estoria, tarefa.estoria)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getNome())
                .append(estoria)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("nome", nome)
                .append("descricao", descricao)
                .append("estoria", estoria)
                .append("statusTarefa", statusTarefa)
                .toString();
    }
}
