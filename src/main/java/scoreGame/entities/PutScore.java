package scoreGame.entities;

public class PutScore {

    private Integer id;
    private int newUser;
    private int newScore;

    // Builders
    public PutScore() {
    }

    public PutScore(Integer id, int newUser, int newScore) {
        this.id = id;
        this.newUser = newUser;
        this.newScore = newScore;
    }

    // Setter and Getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNewUser() {
        return newUser;
    }

    public void setNewUser(int newUser) {
        this.newUser = newUser;
    }

    public int getNewScore() {
        return newScore;
    }

    public void setNewScore(int newScore) {
        this.newScore = newScore;
    }

    /**NOTA IMPORTANTE
     * OJO, los nombres de los atributos aqui puestos tiene que ser los mismos a la hora de realizar el metodo PUT tal y
     * como se muestra en el ejemplo de abajo
     *
     * PUT http://localhost:8080/game/score
     * Content-Type: application/json
     *
     * {
     *   "id": "3",
     *   "newUser":500,
     *   "newScore":2000
     * }
     */
}
