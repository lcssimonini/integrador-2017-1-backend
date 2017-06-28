package br.com.integrador.backend.model;

import br.com.integrador.backend.model.enumerated.StatusTarefa;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * Created by simonini on 17/06/17.
 */
@Data
@Entity
public class Tarefa extends PersistableEntity {

    @NotEmpty(message = "Tarefa precisa ter um nome")
    private String nome;

    @NotEmpty(message = "Tarefa precisa ter uma descrição")
    private String descricao;

    @ManyToOne
    private Estoria estoria;

    @Enumerated(EnumType.STRING)
    private StatusTarefa statusTarefa;
}
