package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Score;
import br.com.integrador.backend.model.Tarefa;
import br.com.integrador.backend.model.enumerated.StatusTarefa;
import br.com.integrador.backend.repository.ScoreRepository;
import br.com.integrador.backend.repository.SprintRepository;
import br.com.integrador.backend.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

/**
 * Created by simonini on 18/06/17.
 */
@Service
public class TarefaService extends AbstractService<Tarefa>  {

    SprintRepository sprintRepository;

    SprintService sprintService;

    FuncionarioService funcionarioService;

    ScoreRepository scoreRepository;

    TarefaRepository tarefaRepository;

    @Autowired
    public TarefaService(
            TarefaRepository tarefaRepository,
            FuncionarioService funcionarioService,
            SprintService sprintService,
            SprintRepository sprintRepository) {

        super(tarefaRepository);
        this.tarefaRepository = tarefaRepository;
        this.funcionarioService = funcionarioService;
        this.sprintService = sprintService;
        this.sprintRepository = sprintRepository;
    }

    @Override
    public Tarefa saveOrUpdate(Tarefa tarefa, Errors errors) {
        tarefa.setStatusTarefa(StatusTarefa.PENDENTE);
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> findBySprint(Long sprintId, StatusTarefa status) {
        return tarefaRepository.findBySprint_IdAndStatusTarefa(sprintId, status);
    }

    public void saveAndScore(Long funcionarioId, Long sprintId) {

        Score score = new Score();
        score.setFuncionario(funcionarioService.findOne(funcionarioId));
        score.setSprint(sprintService.findOne(sprintId));
        score.setValue(new Integer(1));

        scoreRepository.save(score);
    }
}
