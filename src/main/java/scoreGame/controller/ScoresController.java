package scoreGame.controller;

import scoreGame.entities.DeleteScore;
import scoreGame.entities.PutScore;
import scoreGame.entities.Score;
import scoreGame.entities.Scores;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ScoresController {

    private Scores scores = new Scores();

    // Este metodo enviara los datos a la API por medio de la url 'http://localhost:8080/game/score'
    @PostMapping("/game/score")
    public void addScore(@RequestBody Score score) {
        this.scores.addScore(score.getUser(), score.getScore()); // aqui se indica la cantidad de parametros a pasar, en este caso 2
    }

    /**Este metodo obtendra los registros que tiene la API por medio de la url 'http://localhost:8080/game/score'
     * Devuelve una lista como objeto y mostrara el id de envio POST a la API  */
    /*@GetMapping("/game/score")
    public Scores getScores() {
        return this.scores;
    }*/

    // Aqui se devolvera la lista de puntuaciones como array y sin mostrar el id de envio POST a la API
    @GetMapping("/game/score")
    public List<Score> getScores() {
        return this.scores.getScoresAsArray();
    }

    // Este metodo borrara un registro de la API por medio de la url 'http://localhost:8080/game/score'
    @DeleteMapping("/game/score")
    public void deleteScore(@RequestBody DeleteScore score) {
        this.scores.delete(score.getId());
    }

    // Este metodo actualiza un registro de la API por medio de la url 'http://localhost:8080/game/score'
    @PutMapping("/game/score")
    public void actualizar(@RequestBody PutScore putScore) {
        this.scores.update(putScore.getId(), putScore.getNewUser(), putScore.getNewScore());
    }


}

