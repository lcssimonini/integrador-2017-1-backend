package br.com.integrador.backend.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

/**
 * Created by simonini on 17/06/17.
 */

@Data
@Entity
public class Projeto extends PersistableEntity {

    @NotEmpty(message = "Projeto precisa ter um nome")
    private String nome;
}
