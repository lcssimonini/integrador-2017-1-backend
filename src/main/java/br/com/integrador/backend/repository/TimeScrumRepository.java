package br.com.integrador.backend.repository;

import br.com.integrador.backend.model.TimeScrum;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by simonini on 18/06/17.
 */
public interface TimeScrumRepository extends JpaRepository<TimeScrum, Long> {
}
