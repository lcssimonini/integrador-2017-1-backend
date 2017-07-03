package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long>{
}
