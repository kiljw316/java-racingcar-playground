package 자동차_경주_게임;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PositionTest {

    @DisplayName("포지션은 음수가 될 수 없다.")
    @Test
    void positionTest01() {
        // given
        int position = -1;

        // then - when
        assertThatThrownBy(() -> new Position(position))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("동등 비교")
    @Test
    void positionTest02() {
        Position pos1 = new Position(1);
        Position pos2 = new Position(1);

        // then
        assertThat(pos1).isEqualTo(pos2);
    }

    @DisplayName("forward test")
    @Test
    void positionTest03() {
        // given
        Position position = new Position(1);

        // when
        Position actual = position.forward();

        // then
        assertThat(actual).isEqualTo(new Position(2));
    }
}
