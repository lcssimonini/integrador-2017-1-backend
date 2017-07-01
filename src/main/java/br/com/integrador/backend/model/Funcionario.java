package br.com.integrador.backend.model;

import br.com.integrador.backend.model.enumerated.Cargo;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * Created by simonini on 14/06/17.
 */
@Entity
public class Funcionario extends PersistableEntity {

    @NotEmpty(message = "Funcionário precisa ter um cargo")
    @Enumerated(EnumType.STRING)
    private Cargo cargo;

    @ManyToOne
    @NotEmpty(message = "Funcionário precisa pertencer a um time")
    private TimeScrum time;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
