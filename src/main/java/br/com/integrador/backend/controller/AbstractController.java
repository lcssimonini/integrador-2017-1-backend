package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.PersistableEntity;
import br.com.integrador.backend.service.AbstractService;
import org.springframework.validation.Errors;

import java.util.List;

public abstract class AbstractController<T extends PersistableEntity> implements RestCallable<T> {

    private AbstractService<T> service;

    public AbstractController(AbstractService<T> service) {
        this.service = service;
    }

    @Override
    public T saveOrUpdate(T entity, Errors errors) {
        return service.saveOrUpdate(entity, errors);
    }

    @Override
    public T findOne(Long id) {
        return service.findOne(id);
    }

    @Override
    public List<T> findAll() {
        return service.findAll();
    }

    @Override
    public void delete(Long id) {
        service.deleteOne(id);
    }
}
