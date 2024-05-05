package 자동차_경주_게임;

public class RacingCarClient {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        RacingCarController controller = new RacingCarController(inputView, resultView);

        controller.startAndViewRacing();
    }
}
