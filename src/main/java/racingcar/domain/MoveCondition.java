package racingcar.domain;

public class MoveCondition implements Condition {

    private RandomNumberGenerator randomNumberGenerator;

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
