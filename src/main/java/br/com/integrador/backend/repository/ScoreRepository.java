package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ScoreRepository extends JpaRepository<Score, Long>{

    @Query("select sum(s.value) from Score s where funcionario_id = ?1 and sprint_id = ?2")
    Integer getScore(Long funcionario_id, Long sprint_id);
}
