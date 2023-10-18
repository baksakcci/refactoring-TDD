package testing.password.strength;

import java.util.regex.Pattern;

public class Password {
    public boolean verifyLength(String password) {
        return password.length() >= 8;
    }

    public boolean verifyContainsNumber(String password) {
        return Pattern.matches("^.*[0-9].*$", password);
    }

    public boolean verifyContainsUppercase(String password) {
        return Pattern.matches("^.*[A-Z].*$", password);
    }

    public int verifyPassword(String password) {
        int strength = 0;
        if (verifyLength(password)) {
            strength++;
        }
        if (verifyContainsNumber(password)) {
            strength++;
        }
        if (verifyContainsUppercase(password)) {
            strength++;
        }
        return strength;
    }
}
