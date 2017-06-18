package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Funcionario;
import br.com.integrador.backend.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simonini on 18/06/17.
 */
@Service
public class FuncionarioService extends AbstractService<Funcionario> {

    @Autowired
    public FuncionarioService(FuncionarioRepository repository) {
        super(repository);
    }
}
