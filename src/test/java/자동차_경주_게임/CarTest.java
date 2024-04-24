package 자동차_경주_게임;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    String carName = "car";
    Car sut;

    @BeforeEach
    void setUp() {
        sut = new Car(carName);
    }

    @Test
    void 자동차_이름은_5자를_초과할_수_없다() {
        // given
        String carName = "carcar";

        // when - then
        assertThatThrownBy(() -> new Car(carName))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("자동차 이름은 5자를 초과할 수 없습니다.");
    }

    @Test
    void 자동차는_위치_정보를_가지고_있고_0부터_시작한다() {
        assertThat(sut.getPosition()).isEqualTo(0);
    }

    @Test
    void 자동차는_전지할_수_있다() {
        // when
        sut.move();
        sut.move();

        // then
        assertThat(sut.getPosition()).isEqualTo(2);
    }
}
