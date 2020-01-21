package startApp;

import entities.DeleteScore;
import entities.Score;
import entities.Scores;
import org.springframework.web.bind.annotation.*;


@RestController
public class ScoresController {

    private Scores scores = new Scores();

    // Este metodo enviara los datos a la API por medio de la url 'http://localhost:8080/game/score'
    @PostMapping("/game/score")
    public void addScore(@RequestBody Score score) {
        this.scores.addScore(score.getUser(), score.getScore()); // aqui se indica la cantidad de parametros a pasar, en este caso 2
    }

    // Este metodo obtendra los registros que tiene la API por medio de la url 'http://localhost:8080/game/score'
    @GetMapping("/game/score")
    public Scores getScores() {
        return this.scores;
    }


    // Este metodo borrara un registro de la API por medio de la url 'http://localhost:8080/game/score'
    @DeleteMapping("/game/score")
    public void deleteScore(@RequestBody DeleteScore score) {
        this.scores.delete(score.getId());
    }


}

