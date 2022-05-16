package 자동차_경주_게임;

import java.util.List;

public class ResultView {

    public void playResultInit() {
        System.out.println("\n실행 결과");
    }

    public void playResult(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println();
    }

    public void finalResult(List<String> carNames) {
        StringBuilder finalResult = new StringBuilder();
        for (String carName : carNames.subList(0, carNames.size() - 1)) {
            finalResult.append(carName);
            finalResult.append(", ");
        }

        finalResult.append(carNames.get(carNames.size() - 1));
        finalResult.append("가 최종 우승했습니다.");

        System.out.println(finalResult);
    }
}
