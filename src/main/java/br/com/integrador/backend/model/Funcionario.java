package br.com.integrador.backend.model;

import br.com.integrador.backend.model.persistence.PersistableEntity;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by simonini on 14/06/17.
 */
@Data
@Entity
public class Funcionario extends PersistableEntity {

    private Cargo cargo;

    private TimeScrum time;
}
