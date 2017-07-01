package br.com.integrador.backend.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by simonini on 14/06/17.
 */
@Data
@Entity
public class Usuario  extends PersistableEntity  {

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
}
