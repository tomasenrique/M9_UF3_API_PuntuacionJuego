package startApp;

import entities.Score;
import entities.Scores;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ScoresController {

    private Scores scores = new Scores();

    @PostMapping("/score")
    public void addScore(@RequestBody Score score) {
        this.scores.addScore(score.getScore());
    }


    @GetMapping("/score")
    public Scores getScores() {
        return this.scores;
    }


/*    {
        "usuari":1,
        "puntuacio": 2300
    }*/


}
