package 자동차_경주_게임;

public class ResultView {
    public void viewRacingResult(Racing racing) {
        racing.getCars().forEach(this::viewCarResult);
        System.out.println();
    }

    private void viewCarResult(Car car) {
        System.out.printf("%s : %s%n", car.getName(), "-".repeat(car.getPosition()));
    }

    public void viewWinnerResult(Racing racing) {
        System.out.println(racing.findWinners() + "가 최종 우승했습니다.");
    }
}
