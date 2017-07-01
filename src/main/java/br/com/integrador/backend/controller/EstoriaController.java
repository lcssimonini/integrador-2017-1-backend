package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Estoria;
import br.com.integrador.backend.service.AbstractService;
import br.com.integrador.backend.service.EstoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simonini on 17/06/17.
 */
@RestController
@RequestMapping("/estorias")
public class EstoriaController extends AbstractController<Estoria>{

    @Autowired
    private EstoriaService service;

    public EstoriaController(EstoriaService service) {
        super(service);
    }
}
