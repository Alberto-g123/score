package dev.gutierrez.controllers;

import dev.gutierrez.entities.Score;
import dev.gutierrez.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ScoreController {

    @Autowired
    ScoreService scoreService;
    @GetMapping("/scores")
    @ResponseBody
    public List<Score> allScores(){
        return scoreService.getAllScores();
    }
}
