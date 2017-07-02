package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Funcionario;
import br.com.integrador.backend.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simonini on 01/07/17.
 */
@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController extends AbstractController<Funcionario> {

    FuncionarioService service;

    @Autowired
    public FuncionarioController(FuncionarioService service) {
        super(service);
    }
}
