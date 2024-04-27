package 자동차_경주_게임;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private final String carNameCsv = "pobi,crong,honux";
    private final Cars sut = Cars.fromCsv(carNameCsv);

    @Test
    void 자동차_이름은_쉼표를_기준으로_구분한다() {
        // when
        List<Car> actualCars = sut.getCars();

        // then
        assertThat(actualCars).hasSize(3);
        for (Car actualCar : actualCars) {
            assertThat(carNameCsv.contains(actualCar.getCarName())).isTrue();
            assertThat(actualCar.getPosition()).isEqualTo(0);
        }
    }

    @Test
    void random_값이_4이상일_경우_전진한다_랜덤값은_0에서9사이_이다() {
        // when
        sut.move(() -> true);

        // then
        for (Car actualCar : sut.getCars()) {
            assertThat(actualCar.getPosition()).isEqualTo(1);
        }
    }

    @Test
    void 최종_우승자의_이름을_확인할_수_있다() {
        // given
        List<Car> cars = sut.getCars();
        Car pobi = cars.get(0);
        pobi.move();

        // when
        List<String> winnerNames = sut.getWinnerNames();

        // then
        assertThat(winnerNames).hasSize(1);
        assertThat(winnerNames.get(0)).isEqualTo("pobi");
    }

    @Test
    void 최종_우승자는_한명_이상일_수_있다() {
        // given
        List<Car> cars = sut.getCars();

        Car pobi = cars.get(0);
        pobi.move();

        Car crong = cars.get(1);
        crong.move();


        // when
        List<String> winnerNames = sut.getWinnerNames();

        // then
        assertThat(winnerNames).hasSize(2);
        assertThat(winnerNames.get(0)).isEqualTo("pobi");
        assertThat(winnerNames.get(1)).isEqualTo("crong");
    }
}
