package 자동차_경주_게임;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class RacingCarTest {

    @ParameterizedTest
    @ValueSource(strings = "pobi")
    void 단일_자동차_생성_기능(String carName) throws Exception {

        Car car = new Car(carName);

        assertThat(car.getCarName()).isEqualTo(carName);
        assertThat(car.getCarName().length()).isLessThan(6);
    }

    @ParameterizedTest
    @ValueSource(strings = "pobilll")
    void 자동차_이름_길이_초과_에러(String carName) throws Exception {

        Throwable thrown = catchThrowable(() -> new Car(carName));

        assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5자를 초과할 수 없습니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = "pobi")
    void 자동차_위치_정보_저장_기능(String carName) throws Exception {

        Car car = new Car(carName);
        car.go();
        assertThat(car.getPosition()).isEqualTo(1);

    }

    @ParameterizedTest
    @ValueSource(strings = "pobi")
    void 자동차_위치_정보_출력_기능(String carName) throws Exception {

        Car car = new Car(carName);
        car.go();
        assertThat(car.toString()).isEqualTo(carName+ " : -");

    }

}
