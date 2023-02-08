package magazinOnline;

public class Pigeon {
    private String colour;
    private String birthPlace;

    Pigeon(String colour, String birthPlace) {
        this.colour = colour;
        this.birthPlace = birthPlace;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getColour() {
        return colour;
    }

    public String getBirthPlace() {
        return birthPlace;
    }
}
