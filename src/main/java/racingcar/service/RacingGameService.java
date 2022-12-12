package racingcar.service;

import racingcar.domain.Game;
import racingcar.domain.Referee;
import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGameService {

    private Game game;

    public RacingGameService(Game game) {
        this.game = game;
    }

    public void racingStart(String readCarNames, int step) {
        List<String> carNames = Arrays.stream(
                        readCarNames.split(","))
                .collect(Collectors.toList());

        this.game.start(carNames, step);
    }
}
