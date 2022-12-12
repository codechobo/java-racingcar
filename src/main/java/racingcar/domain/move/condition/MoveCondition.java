package racingcar.domain.move.condition;

public class MoveCondition implements Condition {

    private final RandomNumberGenerator randomNumberGenerator;

    public MoveCondition(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    @Override
    public boolean isCondition() {
        int randomNumber = randomNumberGenerator.generate();

        if (randomNumber >= 4) {
            return true;
        }

        return false;
    }
}
