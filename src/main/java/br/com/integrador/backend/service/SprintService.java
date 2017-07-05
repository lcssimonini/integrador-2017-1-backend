package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Projeto;
import br.com.integrador.backend.model.Sprint;
import br.com.integrador.backend.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprintService extends AbstractService<Sprint> {

    private SprintRepository repository;

    @Autowired
    public SprintService(SprintRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public List<Sprint> findByProjeto(Projeto projeto) {
        return repository.findByProjeto(projeto);
    }
}
