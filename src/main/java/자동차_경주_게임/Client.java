package 자동차_경주_게임;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        Scanner scanner = new Scanner(System.in);
        Movable randomMovable = new RandomMovable();

        inputView.printCarNameInput();

        String carNameCsv = scanner.nextLine();

        inputView.printAttempts();

        int attemptsCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Cars cars = Cars.fromCsv(carNameCsv);

        resultView.printPlay();
        for (int i = 0; i < attemptsCount; i++) {
            cars.move(randomMovable);
            resultView.printCarPosition(cars);
        }

        resultView.printRacingResult(cars);
    }
}
