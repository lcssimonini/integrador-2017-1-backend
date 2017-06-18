package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Estoria;
import br.com.integrador.backend.repository.EstoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simonini on 17/06/17.
 */
@Service
public class EstoriaService extends AbstractService<Estoria> {

    @Autowired
    public EstoriaService(EstoriaRepository repository) {
        super(repository);
    }
}
