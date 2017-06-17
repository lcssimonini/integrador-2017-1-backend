package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.Estoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by simonini on 17/06/17.
 */
public interface EstoriaRepository extends JpaRepository<Estoria, Long>{
}
