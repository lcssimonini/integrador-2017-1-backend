package br.com.integrador.backend.model;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Score extends PersistableEntity {

    @ManyToMany
    private Sprint sprint;

    @ManyToMany
    private Funcionario funcionario;

    private Integer count;

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("sprint", sprint)
                .append("funcionario", funcionario)
                .append("count", count)
                .toString();
    }
}
