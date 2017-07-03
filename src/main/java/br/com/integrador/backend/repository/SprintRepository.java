package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Sprint, Long> {
}
