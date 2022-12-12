package racingcar.domain.move;

import racingcar.domain.move.condition.Condition;
import racingcar.domain.move.engine.Engine;

public class Move implements Moving {

    private Condition condition; // 조건
    private Engine engine; // 엔진
    private int position = 0; // 거리

    public Move(Condition condition, Engine engine) {
        this.condition = condition;
        this.engine = engine;
    }

    // 초기 시동 상태는 off 상태다.
    @Override
    public void forward(int step) {
        this.engine.on(); // 시동 키다.
        incrementPosition();
        stop(step);
    }

    private void incrementPosition() {
        if (this.engine.isOn() && this.condition.isCondition()) {
            this.position += 1;
        }
    }

    protected void stop(int step) {
        if (step == 1) {
            this.engine.off();
        }
    }

    @Override
    public boolean canMove() {
        return this.engine.isOn();
    }

    @Override
    public int currentPosition() {
        return this.position;
    }
}
