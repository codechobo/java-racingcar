package racingcar.domain;

import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Car> cars = new ArrayList<>();

    public void start(List<String> carNames, int step) {
        this.cars.addAll(Car.createCars(carNames));

        OutputView.printRunResultMessage();
        // 엔진 상태가 on 일 때 까지
        while (true) {
            boolean isOff = false;
            isOff = engineStatusByMove(this.cars, step, isOff);
            System.out.println();
            step--;

            if (isOff) {
                break;
            }
        }
    }

    private boolean engineStatusByMove(List<Car> cars, int step, boolean isOff) {
        for (Car car : cars) {
            car.moveForward(step);
            isOff = car.isEngineOff();
        }

        return isOff;
    }
}
