package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.PersistableEntity;
import br.com.integrador.backend.service.AbstractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;
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
        T found = service.findOne(id);
        if (found == null) throw new EntityNotFoundException();

        return found;
    }

    @Override
    public List<T> findAll() {
        return service.findAll();
    }

    @Override
    public void delete(Long id) {
        service.deleteOne(id);
    }


    @ExceptionHandler(EntityNotFoundException.class)
    ResponseEntity<String> handleNotFoundErrors(Exception e) {
        return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}
