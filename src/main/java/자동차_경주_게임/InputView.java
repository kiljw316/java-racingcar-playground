package 자동차_경주_게임;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public String viewAndInputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.nextLine();
    }

    public int viewAndInputRacingCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return count;
    }
}
