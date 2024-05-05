package 자동차_경주_게임;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Racing {

    private final List<Car> cars = new ArrayList<>();
    private final MovableStrategy movableStrategy;

    public Racing(String carNames, MovableStrategy movableStrategy) {
        List<Car> cars = Arrays.stream(carNames.split(","))
                .map(Car::new)
                .toList();
        this.cars.addAll(cars);
        this.movableStrategy = movableStrategy;
    }

    public void move() {
        for (Car car : cars) {
            if (movableStrategy.isMovable()) {
                car.move();
            }
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public String findWinners() {
        int maxPosition = cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);

        return cars.stream()
                .filter(car -> car.getPosition() >= maxPosition)
                .map(Car::getName)
                .collect(Collectors.joining(","));
    }
}
