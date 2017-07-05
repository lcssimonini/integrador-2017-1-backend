package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Tarefa;
import br.com.integrador.backend.model.enumerated.StatusTarefa;
import br.com.integrador.backend.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by simonini on 01/07/17.
 */
@RestController
@RequestMapping("/tarefas")
public class TarefaController extends AbstractController<Tarefa>{

    private TarefaService service;

    @Autowired
    public TarefaController(TarefaService service) {
        super(service);
        this.service = service;
    }

    @PostMapping(value = "/score")
    public void saveAndScore(
            @RequestParam("funcionario_id") Long funcionario_id,
            @RequestParam("sprint_id") Long sprint_id) {

        this.service.saveAndScore(funcionario_id, sprint_id);
    }

    @GetMapping(value = "/tarefasSprint")
    public List<Tarefa> findBySprint(@RequestParam("sprint_id") Long sprint_id,
                                     @RequestParam("status") StatusTarefa status) {

        return this.service.findBySprint(sprint_id, status);
    }

}
