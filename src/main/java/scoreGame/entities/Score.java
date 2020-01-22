package scoreGame.entities;

public class Score {

    private int user;
    private int score;

    // Builders
    public Score() {
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

    /**
     * IMPORTANTE: los nombres de los atributos aqui puestos tienen que ser los mismo a la hora de realizar un metodo POST
     * si lo que queremos es enviar datos a la API tal y como se muestra en el ejemplo
     *
     * POST http://localhost:8080/game/score
     * Content-Type: application/json
     *
     * {
     *   "user":5,
     *   "score": 50
     * }
     */
}
