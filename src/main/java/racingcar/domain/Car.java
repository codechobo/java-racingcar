package racingcar.domain;

import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String name;
    private int position = 0;
    private Condition condition;
    private EngineStatus engineStatus;

    public Car(String name, Condition condition) {
        this.name = name;
        this.condition = condition;
    }

    // 전진 기능
    // 시도 횟수에 감소연산자를 사용하므로 마지막 수 1 이 들어오면 멈춘다.
    public void moveForward(int step) {
        increasePosition();
        stop(step);
    }

    private void increasePosition() {
        if (condition.isCondition()) {
            this.position += 1;
        }

        OutputView.printCarMoveStatus(this.name, this.position);
    }

    // 멈춤 기능
    private void stop(int step) {
        if (step == 1) {
            this.engineStatus = EngineStatus.OFF;
            return;
        }

        this.engineStatus = EngineStatus.ON;
    }

    public static List<Car> createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            Car car = new Car(carName, new MoveCondition(new RandomNumberGenerator()));
            cars.add(car);
        }

        return cars;
    }

    public boolean isEngineOff() {
        return this.engineStatus.isOff();
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }
}
