package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.Projeto;
import br.com.integrador.backend.model.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SprintRepository extends JpaRepository<Sprint, Long> {

    List<Sprint> findByProjeto(Projeto projeto);
}
