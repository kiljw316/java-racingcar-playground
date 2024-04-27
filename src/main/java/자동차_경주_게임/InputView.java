package 자동차_경주_게임;

public class InputView {

    public void printCarNameInput() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void printAttempts() {
        String attemptsText = "시도할 회수는 몇회인가요?";
        System.out.println(attemptsText);
    }
}
