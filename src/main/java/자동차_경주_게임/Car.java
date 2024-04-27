package 자동차_경주_게임;

public class Car {

    private final String carName;
    private Position position;

    public Car(String carName) {
        if (carName.length() > 5) {
            throw new RuntimeException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        this.carName = carName;
        this.position = new Position(0);
    }

    public int getPosition() {
        return position.position();
    }

    public void move() {
        this.position = position.forward();
    }

    public String getCarName() {
        return carName;
    }
}
