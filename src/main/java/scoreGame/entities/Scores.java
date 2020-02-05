package scoreGame.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Scores {

    private Map<Integer, Score> scores; // este sera el nombre que aparecera en el JSON
    private AtomicInteger nextId;

    // Builder
    public Scores() {
        scores = new ConcurrentHashMap<>(); // List Key: Object
        nextId =  new AtomicInteger(1); // initializing to 1
    }

    // Setter and Getter
    public Map<Integer, Score> getScores() {
        return scores;
    }


    public void setScores(Map<Integer, Score> scores) {
        this.scores = scores;
    }

    // Methods
    public void addScore(int user, int score){
        Integer id = nextId.getAndIncrement(); // Get id and increment the number
        scores.put(id, new Score(user, score)); // Add one object to list with your id
    }

    public void delete(Integer id){
        scores.remove(id);
    }


    public void update(Integer id, int newUser, int newScore){
        if (scores.containsKey(id)) { // Verify to exists the key
            scores.put(id, new Score(newUser, newScore)); // it update the object
        }else {
            System.out.println("The key not exists");
        }
    }

    // Este metodo devolvera las puntuaciones como un array y no mostrara el id de envio a la API
    public List<Score> getScoresAsArray() {
        return new ArrayList<>(scores.values());
    }





}
