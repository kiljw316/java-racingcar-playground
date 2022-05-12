package 자동차_경주_게임;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    public static final int CONDITION_NUM = 4;
    private final List<Car> carList = new ArrayList<>();
    private final RandomNumber randomNumber;


    public RacingGame(String carNames, RandomNumber randomNumber) {
        registerRacingCars(carNames);
        this.randomNumber = randomNumber;
    }

    public void run() {
        for (Car car : carList) {
            carRunIfRandomNumberGreaterThanConditionNum(car);
        }
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    private void carRunIfRandomNumberGreaterThanConditionNum(Car car) {
        if (randomNumber.isGreaterThan(CONDITION_NUM)) {
            car.go();
        }
    }

    private void registerRacingCars(String carNames) {
        for (String name : carNames.split(",")) {
            carList.add(new Car(name));
        }
    }
}
