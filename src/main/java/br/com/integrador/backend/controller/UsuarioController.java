package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Usuario;
import br.com.integrador.backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simonini on 01/07/17.
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends AbstractController<Usuario> {

    UsuarioService service;

    @Autowired
    public UsuarioController(UsuarioService service) {
        super(service);
    }
}
