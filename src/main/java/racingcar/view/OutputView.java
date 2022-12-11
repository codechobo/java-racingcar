package racingcar.view;

public class OutputView {

    public static final String CAR_NAMES_READ_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String TRY_COUNT_READ_MESSAGE = "시도할 회수는 몇회인가요?";
    public static final String RUN_RESULT_MESSAGE = "실행 결과";
    public static final String MOVE_STATUS_SYMBOL = "-";

    public static void printStart() {
        System.out.println(CAR_NAMES_READ_MESSAGE);
    }

    public static void printGameStep() {
        System.out.println(TRY_COUNT_READ_MESSAGE);
    }

    public static void printRunResultMessage() {
        System.out.println(RUN_RESULT_MESSAGE);
    }

    public static void printCarMoveStatus(String carName, int position) {
        String moveStatus = "";
        for (int status = 0; status < position; status++) {
            moveStatus += MOVE_STATUS_SYMBOL;
        }

        System.out.printf("%s : %s\n", carName, moveStatus);
    }
}
