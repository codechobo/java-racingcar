package racingcar;

import racingcar.domain.Game;
import racingcar.domain.Referee;
import racingcar.view.InputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = Arrays.stream(
                        InputView.readCarNames().split(","))
                .collect(Collectors.toList());

        int step = InputView.readGameStep();

        Game game = new Game(new Referee());
        game.start(carNames, step);


    }
}
