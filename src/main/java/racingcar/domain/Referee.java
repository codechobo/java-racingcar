package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Referee {

    public List<String> findVictoryCarName(List<Car> cars) {
        return findVictoryCar(cars).stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private List<Car> findVictoryCar(List<Car> cars) {
        return cars.stream()
                .filter(car -> car.getPosition() == findMaxPosition(cars))
                .collect(Collectors.toList());
    }

    private int findMaxPosition(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }
}
