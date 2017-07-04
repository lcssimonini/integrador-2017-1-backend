package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Funcionario;
import br.com.integrador.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by simonini on 04/07/17.
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    LoginService service;

    @Autowired
    LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping
    public Funcionario doLogin(
            @RequestParam("usuario") String usuario, @RequestParam("senha") String senha) {

        return service.doLogin(usuario, senha);
    }

    @GetMapping
    public Funcionario getLogado() {
        return service.getLogado();
    }
}
