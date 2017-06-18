package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Estoria;
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
public class EstoriaController {

    @Autowired
    private EstoriaService service;

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<Estoria> save(@Validated Estoria estoria, Errors errors) {
//        Estoria saved = service.save(estoria, errors);
//
//        HttpStatus status = null;
//
//        if (saved.hasErrors()) {
//            status = HttpStatus.CONFLICT;
//        } else {
//            status = HttpStatus.CREATED;
//        }
//
//        ResponseEntity<PointOfInterest> responseEntity = new ResponseEntity<PointOfInterest>(saved, status);
//        return responseEntity;
//    }
}
