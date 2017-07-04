package br.com.integrador.backend.service;

import br.com.integrador.backend.model.Funcionario;
import br.com.integrador.backend.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by simonini on 04/07/17.
 */
@Component
public class LoginService {

    FuncionarioRepository repository;

    @Autowired
    public LoginService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    private Funcionario logado;

    public Funcionario doLogin(String usuario, String senha) {
        List<Funcionario> funcionarios = repository.findByLoginAndSenha(usuario, senha);

        if (funcionarios.isEmpty()) {
            throw new RuntimeException("funcionario nao existe");
        }

        this.logado = funcionarios.get(0);

        return logado;
    }

    public Funcionario getLogado() {
        return logado;
    }
}
