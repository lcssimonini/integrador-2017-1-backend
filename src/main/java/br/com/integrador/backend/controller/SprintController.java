package br.com.integrador.backend.controller;


import br.com.integrador.backend.model.Sprint;
import br.com.integrador.backend.service.SprintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sprints")
public class SprintController extends AbstractController<Sprint> {

    private SprintService service;

    @Autowired
    public SprintController(SprintService service) {
        super(service);
    }
}
