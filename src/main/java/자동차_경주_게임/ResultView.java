package 자동차_경주_게임;

import java.util.List;

public class ResultView {

    private static final String CAR_POSITION_CHARACTER = "-";
    private static final String CURRENT_CAR_POSITION_TEXT = "%s : %s";

    public void printCarPosition(Cars cars) {
        for (Car car : cars.getCars()) {
            printCarPosition(car);
        }
        System.out.println();
    }

    public void printCarPosition(Car car) {
        System.out.println(CURRENT_CAR_POSITION_TEXT.formatted(car.getCarName(), CAR_POSITION_CHARACTER.repeat(car.getPosition())));
    }


    public void printPlay() {
        System.out.println("실행결과");
    }

    public void printRacingResult(Cars cars) {
        System.out.println(String.join(",", cars.getWinnerNames()) + "가 최종 우승했습니다.");
    }
}
