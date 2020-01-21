package entities;

public class Score {

    private int score;

    // Builders
    public Score() {
    }

    public Score(int score) {
        this.score = score;
    }

    // Setter and Getter
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
