package 자동차_경주_게임;

import java.util.Random;

public class RandomNumber {

    public static final int BOUND = 10;
    private final Random random;

    public RandomNumber(Random random) {
        this.random = random;
    }

    public Boolean isGreaterThan(int conditionNum) {
        int randomNum = random.nextInt(BOUND);
        return conditionNum <= randomNum;
    }
}
