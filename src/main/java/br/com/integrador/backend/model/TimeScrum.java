package br.com.integrador.backend.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

/**
 * Created by simonini on 14/06/17.
 */
@Data
@Entity
public class TimeScrum extends PersistableEntity {

    @NotEmpty(message = "Time precisa ter um nome")
    private String nome;
}
