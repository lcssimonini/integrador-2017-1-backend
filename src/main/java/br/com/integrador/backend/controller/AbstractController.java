package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.PersistableEntity;
import br.com.integrador.backend.service.AbstractService;

public abstract class AbstractController<T extends PersistableEntity> {

    private AbstractService<T> service;

    AbstractController(AbstractService<T> service) {
        this.service = service;
    }


}
