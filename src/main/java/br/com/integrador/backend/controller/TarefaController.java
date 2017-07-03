package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Tarefa;
import br.com.integrador.backend.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    }
}
