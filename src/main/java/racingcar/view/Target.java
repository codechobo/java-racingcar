package racingcar.view;

import java.util.Objects;

public class Target {

    private String keyName;

    public Target(String keyName) {
        this.keyName = keyName;
    }

    public static Target create(String keyName) {
        return new Target(keyName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Target target = (Target) o;
        return Objects.equals(keyName, target.keyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyName);
    }
}
