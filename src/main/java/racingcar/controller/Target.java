package racingcar.controller;

public class Target {

    private String keyName;

    public Target(String keyName) {
        this.keyName = keyName;
    }

    public static Target create(String keyName) {
        return new Target(keyName);
    }
}
