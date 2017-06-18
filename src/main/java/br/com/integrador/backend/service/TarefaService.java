package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Tarefa;
import br.com.integrador.backend.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simonini on 18/06/17.
 */
@Service
public class TarefaService extends AbstractService<Tarefa>  {

    @Autowired
    public TarefaService(TarefaRepository repository) {
        super(repository);
    }
}
