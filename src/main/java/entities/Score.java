package entities;

public class Score {

    private int user;
    private int score;

    // Builders
    public Score() {
    }

    public Score(int score) {
        this.score = score;
    }

    public Score(int user, int score) {
        this.user = user;
        this.score = score;
    }

    // Setter and Getter
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }
}
