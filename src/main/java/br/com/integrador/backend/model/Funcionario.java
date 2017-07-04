package br.com.integrador.backend.model;

import br.com.integrador.backend.model.enumerated.Cargo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Created by simonini on 14/06/17.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Funcionario extends PersistableEntity {

    private static final long serialVersionUID = -543745288973303221L;

    @NotEmpty(message = "Login não pode ser vazio")
    private String login;

    @NotEmpty(message = "Senha não pode ser vazia")
    private String senha;

    @NotNull(message = "Funcionário precisa ter um cargo")
    @Enumerated(EnumType.STRING)
    private Cargo cargo;

    @ManyToOne
    @NotNull(message = "Funcionário precisa pertencer a um time")
    private TimeScrum time;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public TimeScrum getTime() {
        return time;
    }

    public void setTime(TimeScrum time) {
        this.time = time;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Funcionario)) return false;

        Funcionario that = (Funcionario) o;

        return new EqualsBuilder()
                .append(getCargo(), that.getCargo())
                .append(time, that.time)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getCargo())
                .append(time)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("cargo", cargo)
                .append("time", time)
                .toString();
    }
}
