package racingcar.service;

import racingcar.domain.Game;
import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGameService {

    private Game game;

    public RacingGameService(Game game) {
        this.game = game;
    }

    public void racingStart(String readCarNames, String step) {
        this.game.start(toList(readCarNames), Integer.parseInt(step));
    }

    private List<String> toList(String readCarNames) {
        return Arrays.stream(readCarNames.split(","))
                .collect(Collectors.toList());
    }
}
