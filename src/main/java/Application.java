import 자동차_경주_게임.InputView;
import 자동차_경주_게임.RacingGame;
import 자동차_경주_게임.RandomNumber;
import 자동차_경주_게임.ResultView;

import java.util.Random;


public class Application {

    public static void main(String[] args) {
        ResultView resultView = new ResultView();
        InputView inputView = new InputView();

        resultView.initCarNames();
        String carNames = inputView.initCarNames();

        RacingGame racingGame = new RacingGame(carNames, new RandomNumber(new Random()), resultView);

        resultView.initRunCount();
        int runCount = inputView.initRunCount();

        racingGame.run(runCount);

        racingGame.result();
    }
}
