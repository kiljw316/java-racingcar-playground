public class Car {

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
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
    }

    public void go() {
        this.position++;
    }

}
