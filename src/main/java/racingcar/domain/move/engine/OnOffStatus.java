package racingcar.domain.move.engine;

public enum OnOffStatus {

    ON, OFF;

    public boolean isOn() {
        return OnOffStatus.ON.equals(this);
    }
}
