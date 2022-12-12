package racingcar.domain.move;

public interface Moving {

    void forward(int step); // 전진
    boolean canMove(); // 이동이 가능 한가?

    int currentPosition(); // 이동거리
}
