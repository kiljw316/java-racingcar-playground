import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private final List<Car> carList = new ArrayList<>();


    public RacingGame(String carNames) {
        registerRacingCars(carNames);
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    private void registerRacingCars(String carNames) {
        for (String name : carNames.split(",")) {
            carList.add(new Car(name));
        }
    }
}
