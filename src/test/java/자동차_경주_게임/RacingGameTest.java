package 자동차_경주_게임;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.*;

public class RacingGameTest {

    @ParameterizedTest
    @ValueSource(strings = "pobi,crong,honux")
    void 여러_대의_자동차_등록(String carNames) throws Exception {
        RacingGame racingGame = new RacingGame(carNames, new RandomNumber(new Random()), new ResultView());
        List<Car> carList = racingGame.getCarList();

        assertThat(carList.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @CsvSource(delimiterString = ":", value = "5:pobi,crong,honux")
    void 일정_숫자만큼_자동차_경주_실행(int runCount, String carNames) throws Exception {
        RacingGame racingGame = new RacingGame(carNames, new RandomNumber(new Random()), new ResultView());
        racingGame.run(runCount);
    }

}
