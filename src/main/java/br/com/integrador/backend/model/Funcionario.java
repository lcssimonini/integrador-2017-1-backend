package br.com.integrador.backend.model;

import br.com.integrador.backend.model.enumerated.Cargo;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by simonini on 14/06/17.
 */
@Data
@Entity
public class Funcionario extends PersistableEntity {

    @NotEmpty(message = "Funcionário precisa ter um cargo")
    @Enumerated(EnumType.STRING)
    private Cargo cargo;

    @ManyToOne
    @NotEmpty(message = "Funcionário precisa pertencer a um time")
    private TimeScrum time;
}
