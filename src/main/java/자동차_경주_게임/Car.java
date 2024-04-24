package 자동차_경주_게임;

public class Car {

    private final String carName;
    private int position;

    public Car(String carName) {
        if (carName.length() > 5) {
            throw new RuntimeException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        this.carName = carName;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        position++;
    }
}
