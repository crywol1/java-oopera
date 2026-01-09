public class Actor extends Person {

    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актер: " + super.toString() +
                " (рост " + height +
                "м)" ;
    }
}
