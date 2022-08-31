package dev.gutierrez.score;


import dev.gutierrez.entities.Score;
import dev.gutierrez.repos.ScoreRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional // any CRUD operations will not persist outside the test all statements are rolled back
public class ScoreRepoTests {

    @Autowired
    ScoreRepo scoreRepo;
    @Test
    void add_score(){
        Score score = new Score(0, "BBB", 1000);
        Score savedScore = scoreRepo.save(score);
        Assertions.assertNotEquals(0, savedScore.getId());
    }

    @Test
    void all_scores(){
        Score score1 = new Score(0, "BBB", 1000);
        Score savedScore1 = scoreRepo.save(score1);
        Score score2 = new Score(0, "BBB", 1000);
        Score savedScore2 = scoreRepo.save(score2);
        Score score3 = new Score(0, "BBB", 1000);
        Score savedScore3 = scoreRepo.save(score3);
        List<Score> scores = scoreRepo.findAll();
        System.out.println(scores);
        Assertions.assertEquals(3, scores.size());
    }
}
