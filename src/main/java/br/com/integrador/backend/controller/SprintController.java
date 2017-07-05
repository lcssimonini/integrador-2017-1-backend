package br.com.integrador.backend.controller;


import br.com.integrador.backend.model.Projeto;
import br.com.integrador.backend.model.Sprint;
import br.com.integrador.backend.service.ProjetoService;
import br.com.integrador.backend.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sprints")
public class SprintController extends AbstractController<Sprint> {

    private SprintService service;
    private ProjetoService projetoService;

    @Autowired
    public SprintController(SprintService service, ProjetoService projetoService) {
        super(service);
        this.service = service;
        this.projetoService = projetoService;
    }

    @GetMapping(value = "byProjeto")
    public List<Sprint> byProjeto(@RequestParam("projeto_id") Long projetoId) {
        Projeto projeto = projetoService.findOne(projetoId);

        return service.findByProjeto(projeto);
    }
}
