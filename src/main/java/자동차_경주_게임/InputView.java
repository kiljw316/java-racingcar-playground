package 자동차_경주_게임;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public String initCarNames() {
        return scanner.nextLine();
    }

    public int initRunCount() {
        return scanner.nextInt();
    }

}
