package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.TimeScrum;
import br.com.integrador.backend.service.TimeScrumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simonini on 01/07/17.
 */
@RestController
@RequestMapping("/times")
public class TimeScrumController extends AbstractController<TimeScrum> {

    TimeScrumService service;

    @Autowired
    public TimeScrumController(TimeScrumService service) {
        super(service);
    }
}
