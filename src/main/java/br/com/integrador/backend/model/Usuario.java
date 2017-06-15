package br.com.integrador.backend.model;

import br.com.integrador.backend.model.persistence.PersistableEntity;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

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

    private Funcionario funcionario;
}
