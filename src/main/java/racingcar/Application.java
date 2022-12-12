package racingcar;

import racingcar.controller.RacingGameController;
import racingcar.domain.Game;
import racingcar.domain.Referee;
import racingcar.service.RacingGameService;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        RacingGameController racingGameController = new RacingGameController(new RacingGameService(new Game(new Referee())));
        racingGameController.start(InputView.sendParam());
    }
}
