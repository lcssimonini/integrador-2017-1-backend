package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Score;
import br.com.integrador.backend.model.Tarefa;
import br.com.integrador.backend.model.enumerated.StatusTarefa;
import br.com.integrador.backend.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simonini on 01/07/17.
 */
@RestController
@RequestMapping("/tarefas")
public class TarefaController extends AbstractController<Tarefa>{

    @Autowired
    private TarefaService service;

    public TarefaController(TarefaService service) {
        super(service);
    }

    @RequestMapping(value = "/score", method = RequestMethod.POST)
    public void saveAndScore(
            @RequestParam("funcionario_id") Long funcionario_id,
            @RequestParam("sprint_id") Long sprint_id) {

        service.saveAndScore(funcionario_id, sprint_id);
    }
}
