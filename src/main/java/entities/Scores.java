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

    // Method
    public void addScore(int score){
        Integer id = nextId.getAndDecrement(); // Get id and increment the number
        scores.put(id, new Score(score)); // Add one object to list with your id
    }







}
