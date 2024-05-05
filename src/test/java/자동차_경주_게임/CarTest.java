package 자동차_경주_게임;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @DisplayName("자동차 이름은 5자를 초과할 수 없다.")
    @Test
    void carTest01() {
        // given
        String sixLengthName = "gabeen";

        // when - then
        assertThatThrownBy(() -> new Car(sixLengthName))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
