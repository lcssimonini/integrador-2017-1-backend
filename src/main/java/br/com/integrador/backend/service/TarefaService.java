package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Score;
import br.com.integrador.backend.model.Tarefa;
import br.com.integrador.backend.repository.ScoreRepository;
import br.com.integrador.backend.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simonini on 18/06/17.
 */
@Service
public class TarefaService extends AbstractService<Tarefa>  {

    @Autowired
    SprintService sprintService;

    @Autowired
    FuncionarioService funcionarioService;

    @Autowired
    ScoreRepository scoreRepository;

    @Autowired
    public TarefaService(TarefaRepository repository) {
        super(repository);
    }

    public void saveAndScore(Long funcionarioId,  Long sprintId) {

        Score score = new Score();
        score.setFuncionario(funcionarioService.findOne(funcionarioId));
        score.setSprint(sprintService.findOne(sprintId));
        score.setValue(new Integer(1));

        scoreRepository.save(score);
    }
}
