package br.com.integrador.backend.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by simonini on 14/06/17.
 */
@Entity
public class Usuario  extends PersistableEntity  {

    private static final long serialVersionUID = 639512744700722605L;

    @NotEmpty(message = "Login não pode ser vazio")
    private String login;

    @NotEmpty(message = "Senha não pode ser vazia")
    private String senha;

    @OneToOne
    private Funcionario funcionario;

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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        return new EqualsBuilder()
                .append(getLogin(), usuario.getLogin())
                .append(funcionario, usuario.funcionario)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(getLogin())
                .append(funcionario)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("login", login)
                .append("senha", senha)
                .append("funcionario", funcionario)
                .toString();
    }
}
