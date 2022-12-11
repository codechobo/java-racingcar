package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String readCarNames() {
        OutputView.printStart();
        return Console.readLine();
    }

    public static int readGameStep() {
        OutputView.printGameStep();
        return Integer.parseInt(Console.readLine());
    }
}
