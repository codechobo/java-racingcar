package racingcar.controller;

import racingcar.service.RacingGameService;

import java.util.Map;

import static racingcar.view.InputView.CAR_NAMES;

public class RacingGameController {

    private final RacingGameService racingGameService;

    public RacingGameController(RacingGameService racingGameService) {
        this.racingGameService = racingGameService;
    }

    public void start(Map<Target, String> requestParam) {
        racingGameService.racingStart(requestParam.get(CAR_NAMES), requestParam.get(CAR_NAMES));
    }
}