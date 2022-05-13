package 자동차_경주_게임;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {

    @Test
    void isGreaterThan() throws Exception {
        RandomNumber randomNumber = new RandomNumber(new Random());
        Boolean isGreaterThan = randomNumber.isGreaterThan(4);
        assertThat(isGreaterThan).isInstanceOf(Boolean.class);
    }
}