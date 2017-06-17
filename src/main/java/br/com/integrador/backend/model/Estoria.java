package br.com.integrador.backend.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

/**
 * Created by simonini on 17/06/17.
 */
@Data
@Entity
public class Estoria extends PersistableEntity {

    @NotEmpty(message = "Funcionário precisa ter um cargo")
    private String nome;

    private Projeto projeto;
}
