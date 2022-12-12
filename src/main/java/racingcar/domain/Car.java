package racingcar.domain;

import racingcar.domain.move.Moving;
import racingcar.domain.move.engine.Engine;
import racingcar.domain.move.Move;
import racingcar.domain.move.condition.MoveCondition;
import racingcar.domain.move.condition.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final String name; // 이름
    private Moving move; // 이동

    public Car(String name, Moving move) {
        this.name = name;
        this.move = move;
    }

    // 움직이다.
    public void moving(int step) {
        this.move.forward(step);
    }

    // 이동이 가능한가?
    public boolean isPossibleMove() {
        return move.canMove();
    }

    // 생성하다.
    public static List<Car> createCars(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            Car car = new Car(carName, new Move(new MoveCondition(new RandomNumberGenerator()), new Engine()));
            cars.add(car);
        }

        return cars;
    }

    public int currentMovePosition() {
        return move.currentPosition();
    }

    public String getName() {
        return name;
    }
}