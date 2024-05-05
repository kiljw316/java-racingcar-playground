package 자동차_경주_게임;

public class Car {

    private final Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position(0);
    }

    public void move() {
        this.position = position.forward();
    }

    public String getName() {
        return name.name();
    }

    public int getPosition() {
        return position.position();
    }
}
