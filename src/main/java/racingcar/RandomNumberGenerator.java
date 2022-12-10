package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements Generator {

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
