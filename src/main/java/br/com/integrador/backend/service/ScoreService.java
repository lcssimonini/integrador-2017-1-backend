package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Score;
import br.com.integrador.backend.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService extends AbstractService<Score> {

    @Autowired
    private ScoreRepository repository;

    public ScoreService(ScoreRepository repository) {
        super(repository);
    }

    public Integer getScore(Long funcionario_id, Long sprint_id) {
        return repository.getScore(funcionario_id, sprint_id);
    }
}
