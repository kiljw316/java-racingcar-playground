package 자동차_경주_게임;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public static Cars fromCsv(String csvText) {
        List<Car> cars = Arrays.stream(csvText.split(","))
                .map(Car::new)
                .toList();
        return new Cars(cars);
    }

    private Cars(List<Car> cars) {
        this.cars.addAll(cars);
    }


    public List<Car> getCars() {
        return cars;
    }

    public void move(Movable strategyToMove) {
        for (Car car : cars) {
            if (strategyToMove.isMovable()) {
                car.move();
            }
        }
    }

    public List<String> getWinnerNames() {
        int maxPosition = cars.stream().mapToInt(Car::getPosition)
                .max()
                .orElseThrow();

        return cars.stream()
                .filter(car -> car.getPosition() >= maxPosition)
                .map(Car::getCarName)
                .toList();
    }
}
