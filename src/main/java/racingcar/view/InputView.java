package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.controller.Target;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InputView {

    public static final String CAR_NAMES = "carNames";
    public static final String STEP = "step";

    private static final Map<Target, String> requestParam = new ConcurrentHashMap<>();

    public static Map<Target, String> sendParam() {
        requestCarNames();
        requestCarNames();
        return requestParam;
    }

    private static void requestCarNames() {
        OutputView.printStart();

        String readLine = Console.readLine();


        requestParam.put(Target.create(CAR_NAMES), Console.readLine());
    }

    private static void readGameStep() {
        OutputView.printGameStep();
        requestParam.put(Target.create(STEP), Console.readLine());
    }
}
