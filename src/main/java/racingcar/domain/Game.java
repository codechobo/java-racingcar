package racingcar.domain;

import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Referee referee;
    private List<Car> cars = new ArrayList<>();

    public Game(Referee referee) {
        this.referee = referee;
    }

    public void start(List<String> carNames, int step) {
        saveCarNames(carNames);
        OutputView.printRunResultMessage();

        process(step);
        OutputView.printVictoryCar(this.referee.findVictoryCarName(this.cars));
    }

    private void saveCarNames(List<String> carNames) {
        this.cars.addAll(Car.createCars(carNames));
    }

    private void process(int step) {
        while (true) {
            boolean isMoving = true;
            for (Car car : this.cars) {
                car.moving(step);
                isMoving = car.isPossibleMove();
            }

            System.out.println();
            step--;

            if (!isMoving) {
                break;
            }
        }
    }
}
