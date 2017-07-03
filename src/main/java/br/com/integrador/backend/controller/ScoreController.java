package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Score;
import br.com.integrador.backend.service.ScoreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scores")
public class ScoreController extends AbstractController<Score> {

    private ScoreService service;

    public ScoreController(ScoreService service) {
        super(service);
    }
}
