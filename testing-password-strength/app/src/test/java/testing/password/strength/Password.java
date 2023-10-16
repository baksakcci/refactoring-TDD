package testing.password.strength;

import java.util.regex.Pattern;

public class Password {
    public boolean verifyLength(String password) {
        return password.length() >= 8;
    }

    public boolean verifyContainsNumber(String password) {
        return Pattern.matches("^.*[0-9].*$", password);
    }
}
