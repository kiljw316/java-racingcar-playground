package 자동차_경주_게임;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {

    public static final int CONDITION_NUM = 4;
    private final List<Car> carList = new ArrayList<>();
    private final RandomNumber randomNumber;
    private final ResultView resultView;


    public RacingGame(String carNames, RandomNumber randomNumber, ResultView resultView) {
        registerRacingCars(carNames);
        this.randomNumber = randomNumber;
        this.resultView = resultView;
    }

    public void run(int runCount) {
        resultView.playResultInit();
        for (int i = 0; i < runCount; i++) {
            for (Car car : carList) {
                carRunIfRandomNumberGreaterThanConditionNum(car);
            }
            resultView.playResult(carList);
        }
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    public void result() {
        List<String> carNames = this.carList
                .stream()
                .filter(
                        car -> car.getPosition() == findMaxPosition()
                ).map(Car::getCarName)
                .collect(Collectors.toList());
        resultView.finalResult(carNames);
    }

    private Integer findMaxPosition() {
         return Collections.max(
                this.carList
                        .stream()
                        .map(Car::getPosition)
                        .collect(Collectors.toList()));
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
