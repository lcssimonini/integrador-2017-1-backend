package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.Tarefa;
import br.com.integrador.backend.model.enumerated.StatusTarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by simonini on 17/06/17.
 */
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

    List<Tarefa> findBySprint_IdAndStatusTarefa(Long sprintId, StatusTarefa status);
}
