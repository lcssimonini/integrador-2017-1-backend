package br.com.integrador.backend.controller;

import br.com.integrador.backend.model.Score;
import br.com.integrador.backend.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scores")
public class ScoreController extends AbstractController<Score> {

    @Autowired
    private ScoreService service;

    public ScoreController(ScoreService service) {
        super(service);
    }

    @RequestMapping(value = "/getScore", method = RequestMethod.GET)
    public Integer getScore(
            @RequestParam("funcionario_id") Long funcionario_id,
            @RequestParam("sprint_id") Long sprint_id) {

        return service.getScore(funcionario_id, sprint_id);
    }
}
