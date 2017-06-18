package br.com.integrador.backend.service;

import br.com.integrador.backend.model.PersistableEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by simonini on 18/06/17.
 */
@Component
public abstract class AbstractService<T extends PersistableEntity> {

    private JpaRepository<T, Long> repository;

    @Autowired
    public AbstractService(JpaRepository<T, Long> repository){
        this.repository = repository;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public T findOne(Long id) {
        return repository.findOne(id);
    }

    public T saveOrUpdate(T entity){
        return repository.save(entity);
    }

    public void deleteOne(Long id) {
        repository.delete(id);
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}
