package 자동차_경주_게임;

import org.junit.jupiter.api.Test;

public class RacingTest {

    @Test
    void racingTest01() {
        // given
        String carNames = "pobi,crong,honux";

        // when
        Racing racing = new Racing(carNames, new MovableStrategyImpl());

        // then
    }
}
