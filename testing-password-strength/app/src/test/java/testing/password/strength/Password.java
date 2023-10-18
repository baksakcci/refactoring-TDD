package testing.password.strength;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Password {

    private final HashMap<Integer, PasswordStrength> strength = new HashMap<>();

    public Password() {
        strength.put(3, PasswordStrength.STRONG);
        strength.put(2, PasswordStrength.NORMAL);
        strength.put(1, PasswordStrength.WEAK);
        strength.put(0, PasswordStrength.WEAK);
    }

    public PasswordStrength verifyPassword(String password) {
        int passCount = calculatePassCount(password);
        return strength.get(passCount);
    }

    public boolean verifyLength(String password) {
        return password.length() >= 8;
    }

    public boolean verifyContainsNumber(String password) {
        return Pattern.matches("^.*[0-9].*$", password);
    }

    public boolean verifyContainsUppercase(String password) {
        return Pattern.matches("^.*[A-Z].*$", password);
    }

    private int calculatePassCount(String password) {
        int passCount = 0;
        if (verifyLength(password)) {
            passCount++;
        }
        if (verifyContainsNumber(password)) {
            passCount++;
        }
        if (verifyContainsUppercase(password)) {
            passCount++;
        }
        return passCount;
    }
}
