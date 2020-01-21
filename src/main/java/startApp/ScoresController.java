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

    // Este metodo enviara los datos a la API por medio de la url 'http://localhost:8080/game/score'
    @PostMapping("/game/score")
    public void addScore(@RequestBody Score score) {
        this.scores.addScore(score.getUser(), score.getScore());
    }
    /* EJM del POST
    POST http://localhost:8080/game/score
    Content-Type: application/json

    {
        "user":152,
        "score": 25
    }
    */


    // Este metodo obtendra los registros que tiene la API por medio de la url 'http://localhost:8080/game/score'
    @GetMapping("/game/score")
    public Scores getScores() {
        return this.scores;
    }

    /* EJM del GET
    GET http://localhost:8080/game/score

   {
      "scores": {
        "1": {
          "user": 152,
          "score": 25
        },
        "2": {
          "user": 2,
          "score": 258
        }
      }
    }
    */


}

