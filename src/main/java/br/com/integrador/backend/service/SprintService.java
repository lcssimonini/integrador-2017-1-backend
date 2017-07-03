package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Sprint;
import br.com.integrador.backend.repository.SprintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SprintService extends AbstractService<Sprint> {

    @Autowired
    public SprintService(SprintRepository repository) {
        super(repository);
    }
}
