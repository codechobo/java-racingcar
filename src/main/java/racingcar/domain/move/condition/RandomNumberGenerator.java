package racingcar.domain.move.condition;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.move.condition.Generator;

public class RandomNumberGenerator implements Generator {

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
