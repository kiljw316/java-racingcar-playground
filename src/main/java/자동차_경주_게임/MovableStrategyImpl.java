package 자동차_경주_게임;

import java.security.SecureRandom;

public class MovableStrategyImpl implements MovableStrategy {

    private static final int BOUND = 10;
    private static final int GREATER_THAN_OR_EQUAL_TO_FORWARD = 4;

    @Override
    public boolean isMovable() {
        int randomInt = new SecureRandom().nextInt(BOUND);
        return randomInt >= GREATER_THAN_OR_EQUAL_TO_FORWARD;
    }
}
