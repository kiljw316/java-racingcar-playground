package 자동차_경주_게임;

public class Car {

    public static final int MAXIMUM_LENGTH = 5;
    private final String carName;
    private int position = 0;

    public Car(String carName) {
        validateNameLength(carName);
        this.carName = carName;
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {
        return carName;
    }

    private void validateNameLength(String carName) {
        if (carName.length() > MAXIMUM_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }

    private String positionToString() {
        return "-".repeat(this.position);
    }

}
