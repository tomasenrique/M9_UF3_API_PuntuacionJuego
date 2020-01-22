package scoreGame.entities;

public class DeleteScore {

    private Integer id;

    // Builders
    public DeleteScore() {
    }

    public DeleteScore(Integer id) {
        this.id = id;
    }

    // Setter and Getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**IMPORTANTE
     * OJO, el nombre del atributo aqui puesto tiene que ser el mismo a la hora de realizar el metodo DELETE tal y
     * como se muestra en el ejemplo de abajo
     *
     * DELETE http://localhost:8080/game/score
     * Content-Type: application/json
     *
     * {
     *   "id": "3"
     * }
     *
     */

}
