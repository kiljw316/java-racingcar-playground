package 문자열_덧셈_계산기;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {

    @ParameterizedTest
    @CsvSource(delimiterString = "$", value = {"$0", "1,2$3", "1,2,3$6", "1,2:3$6", "1$1"})
    void 쉼표_또는_콜론을_구분자로_가지는_문자열의_각_숫자의_합(String formula, Integer answer) {

        //given
        Calculator calculator = new Calculator(new Delimiter().pattern());

        //when
        Integer result = calculator.sum(formula);

        //then
        assertThat(result).isEqualTo(answer);

    }

    @ParameterizedTest
    @ValueSource(strings = "//;\n1;2;3")
    void 커스텀_구분자를_가지는_문자열의_각_숫자의_합(String formula) {

        //given
        Delimiter delimiter = new Delimiter();
        String formula2 = delimiter.addPattern(formula);

        Calculator calculator = new Calculator(delimiter.pattern());

        //when
        Integer result = calculator.sum(formula2);

        //then
        assertThat(result).isEqualTo(6);

    }

    @ParameterizedTest
    @ValueSource(strings = "-1,2,3")
    void 음수를_전달할_경우_예외처리(String formula) throws Exception {

        //given
        Calculator calculator = new Calculator(new Delimiter().pattern());

        //when
        Throwable thrown = catchThrowable(() -> calculator.sum(formula));

        //then
        assertThat(thrown)
                .isInstanceOf(RuntimeException.class);
    }
}
