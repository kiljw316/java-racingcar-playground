package 자동차_경주_게임;

public class RacingCarController {

    private final InputView inputView;
    private final ResultView resultView;

    public RacingCarController(InputView inputView, ResultView resultView) {
        this.inputView = inputView;
        this.resultView = resultView;
    }

    public void startAndViewRacing() {
        String carNames = inputView.viewAndInputCarNames();
        int count = inputView.viewAndInputRacingCount();

        Racing racing = new Racing(carNames, new MovableStrategyImpl());

        System.out.println("실행 결과");

        for (int i = 0; i < count; i++) {
            racing.move();
            resultView.viewRacingResult(racing);
        }

        resultView.viewWinnerResult(racing);
    }
}
