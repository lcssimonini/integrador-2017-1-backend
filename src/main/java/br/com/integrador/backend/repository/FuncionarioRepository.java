package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by simonini on 17/06/17.
 */
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
