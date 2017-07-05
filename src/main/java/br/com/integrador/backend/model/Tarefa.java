package br.com.integrador.backend.model;

import br.com.integrador.backend.model.enumerated.StatusTarefa;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by simonini on 17/06/17.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tarefa extends PersistableEntity {

    private static final long serialVersionUID = 1860581446842413481L;

    @NotEmpty(message = "Tarefa precisa ter um nome")
    private String nome;

    @NotEmpty(message = "Tarefa precisa ter uma descrição")
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusTarefa statusTarefa;

    @ManyToOne(fetch= FetchType.LAZY, cascade={ CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name="sprint_id", referencedColumnName="id")
    private Sprint sprint;

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusTarefa getStatusTarefa() {
        return statusTarefa;
    }

    public void setStatusTarefa(StatusTarefa statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Tarefa)) return false;

        Tarefa tarefa = (Tarefa) o;

        return new EqualsBuilder()
                .append(getNome(), tarefa.getNome())
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
                .append("descricao", descricao)
                .append("statusTarefa", statusTarefa)
                .toString();
    }
}
