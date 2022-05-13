package 자동차_경주_게임;

import java.util.List;

public class ResultView {

    public void initCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void initRunCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public void lineBreak() {
        System.out.println();
    }

    public void playResultInit() {
        System.out.println("실행 결과");
    }

    public void playResult(List<Car> carList) {
        for (Car car : carList) {
            System.out.println(car);
        }
        lineBreak();
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
