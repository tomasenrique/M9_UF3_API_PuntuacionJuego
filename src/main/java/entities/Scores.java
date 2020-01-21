package entities;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Scores {

    private Map<Integer, Score> scores;
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
    public void addScore(int score){
        Integer id = nextId.getAndIncrement(); // Get id and increment the number
        scores.put(id, new Score(score)); // Add one object to list with your id
    }


    public void addScore(int user, int score){
        Integer id = nextId.getAndIncrement(); // Get id and increment the number
        scores.put(id, new Score(user, score)); // Add one object to list with your id
    }

    public void delete(Integer id){
        scores.remove(id);
    }







}
