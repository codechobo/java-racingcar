package racingcar.controller;

import racingcar.service.RacingGameService;
import racingcar.view.InputView;

public class RacingGameController {

    private final RacingGameService racingGameService;

    public RacingGameController(RacingGameService racingGameService) {
        this.racingGameService = racingGameService;
    }

    public void start() {
        racingGameService.racingStart(InputView.readCarNames(), InputView.readGameStep());
    }
}