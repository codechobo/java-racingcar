package racingcar.domain.move.engine;


public class Engine {

    private OnOffStatus onOffStatus;

    public Engine() {
        this.onOffStatus = OnOffStatus.OFF;
    }

    public void on() {
        this.onOffStatus = OnOffStatus.ON;
    }

    public void off() {
        this.onOffStatus = OnOffStatus.OFF;
    }

    public boolean isOn() {
        return this.onOffStatus.isOn();
    }
}
