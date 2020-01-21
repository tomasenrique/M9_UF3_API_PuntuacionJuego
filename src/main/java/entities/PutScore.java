package entities;

public class PutScore {

    private Integer id;

    // Builders
    public PutScore() {
    }

    public PutScore(Integer id) {
        this.id = id;
    }

    // Setter and Getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
