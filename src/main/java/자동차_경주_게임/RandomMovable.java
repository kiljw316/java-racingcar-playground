package 자동차_경주_게임;

import java.security.SecureRandom;

public class RandomMovable implements Movable {

    public static final int RANDOM_NUMBER_MIN_VALUE = 0;
    public static final int RANDOM_NUMBER_MAX_VALUE = 9;
    public static final int MINIMUM_NUMBER_OF_moves = 4;


    @Override
    public boolean isMovable() {
        int randomInt = new SecureRandom().nextInt(RANDOM_NUMBER_MIN_VALUE, RANDOM_NUMBER_MAX_VALUE + 1);
        return movable(randomInt);
    }

    private boolean movable(int randomInt) {
        return randomInt >= MINIMUM_NUMBER_OF_moves;
    }
}
