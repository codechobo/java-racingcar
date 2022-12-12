package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InputView {

    public static final String CAR_NAMES = "carNames";
    public static final String STEP = "step";

    private static final Map<Target, String> requestParam = new ConcurrentHashMap<>();
    private static final DataConvertor dataConvertor = new DataConvertor();

    public static Map<Target, String> sendParam() {
        requestCarNames();
        readGameStep();
        return requestParam;
    }

    private static void requestCarNames() {
        OutputView.printStart();
        requestParam.put(Target.create(CAR_NAMES), dataConvertor.support(Console.readLine()));
    }

    private static void readGameStep() {
        OutputView.printGameStep();
        requestParam.put(Target.create(STEP), dataConvertor.support(Console.readLine()));
    }
}
