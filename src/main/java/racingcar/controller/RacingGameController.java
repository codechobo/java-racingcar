package racingcar.controller;

import racingcar.controller.validation.Validation;
import racingcar.service.RacingGameService;
import racingcar.view.Target;

import java.util.Map;

import static racingcar.view.InputView.CAR_NAMES;
import static racingcar.view.InputView.STEP;

public class RacingGameController {

    private final RacingGameService racingGameService;
    private final Validation validation;

    public RacingGameController(RacingGameService racingGameService, Validation validation) {
        this.racingGameService = racingGameService;
        this.validation = validation;
    }

    public void start(Map<Target, String> requestParam) {
        String carNames = requestParam.get(Target.create(CAR_NAMES));
        String step = requestParam.get(Target.create(STEP));

        validation.isLength(carNames);
        validation.isDigit(step);

        racingGameService.racingStart(carNames, step);
    }
}