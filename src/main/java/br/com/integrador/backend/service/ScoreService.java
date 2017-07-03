package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Score;
import br.com.integrador.backend.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService extends AbstractService<Score>{

    @Autowired
    public ScoreService(ScoreRepository repository) {
        super(repository);
    }
}
