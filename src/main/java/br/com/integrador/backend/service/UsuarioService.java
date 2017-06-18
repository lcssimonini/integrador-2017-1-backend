package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Usuario;
import br.com.integrador.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simonini on 18/06/17.
 */
@Service
public class UsuarioService extends AbstractService<Usuario>{

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        super(repository);
    }
}
