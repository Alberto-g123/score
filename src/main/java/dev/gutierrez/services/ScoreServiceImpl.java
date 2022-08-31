package dev.gutierrez.services;

import dev.gutierrez.entities.Score;
import dev.gutierrez.repos.ScoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService{

    @Autowired
    ScoreRepo scoreRepo;

    @Override
    public List<Score> getAllScores() {
        return scoreRepo.findAll();
    }
}
