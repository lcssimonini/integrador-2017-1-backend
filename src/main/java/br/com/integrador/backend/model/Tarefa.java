package br.com.integrador.backend.model;

import br.com.integrador.backend.model.enumerated.StatusTarefa;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Created by simonini on 17/06/17.
 */
@Data
@Entity
public class Tarefa extends PersistableEntity {

    private String nome;
    private String descricao;
    private Estoria estoria;

    @Enumerated(EnumType.STRING)
    private StatusTarefa statusTarefa;
}
