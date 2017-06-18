package br.com.integrador.backend.service;

import br.com.integrador.backend.model.TimeScrum;
import br.com.integrador.backend.repository.TimeScrumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by simonini on 18/06/17.
 */
@Service
public class TimeScrumService extends AbstractService<TimeScrum> {

    @Autowired
    public TimeScrumService(TimeScrumRepository repository) {
        super(repository);
    }
}
