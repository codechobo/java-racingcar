package racingcar.controller.validation;

import org.junit.platform.commons.util.StringUtils;

public class Validation {

    public void isLength(String value) {
        String[] names = value.split(",");
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("[ERROR] Car Name Length is Exception");
            }

            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("[ERROR] Name Contains Blank is Exception");
            }
        }
    }

    public void isDigit(String step) {
        for (int index = 0; index < step.length(); index++) {
            if (!Character.isDigit(step.charAt(index))) {
                throw new IllegalArgumentException("[ERROR] Step Count Number is Exception");
            }
        }
    }
}
