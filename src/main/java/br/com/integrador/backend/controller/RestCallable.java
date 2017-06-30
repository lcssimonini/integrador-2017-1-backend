package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.PersistableEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RestCallable<T extends PersistableEntity> {

    @RequestMapping(method = RequestMethod.POST)
    T saveOrUpdate(T entity, Errors errors);

    @RequestMapping(value = "/findOne", method = RequestMethod.GET)
    T findOne(@RequestParam("id") Long id);

    @RequestMapping(method = RequestMethod.GET)
    List<T> findAll();

    @RequestMapping(method = RequestMethod.DELETE)
    void delete(@RequestParam("id")Long id);
}
