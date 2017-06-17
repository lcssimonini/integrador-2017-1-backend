package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by simonini on 17/06/17.
 */
public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
}
