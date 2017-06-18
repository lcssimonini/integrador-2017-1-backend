package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Projeto;
import br.com.integrador.backend.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simonini on 18/06/17.
 */
@Service
public class ProjetoService extends AbstractService<Projeto> {

    @Autowired
    public ProjetoService(ProjetoRepository repository) {
        super(repository);
    }
}
