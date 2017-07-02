package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Projeto;
import br.com.integrador.backend.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simonini on 01/07/17.
 */
@RestController
@RequestMapping("/projetos")
public class ProjetoController extends AbstractController<Projeto> {

    ProjetoService service;

    @Autowired
    public ProjetoController(ProjetoService service) {
        super(service);
    }
}
