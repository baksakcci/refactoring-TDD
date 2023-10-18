package testing.password.strength;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Password {

    private final HashMap<Integer, PasswordStrength> convertToStrength = new HashMap<>();

    public Password() {
        convertToStrength.put(3, PasswordStrength.STRONG);
        convertToStrength.put(2, PasswordStrength.NORMAL);
        convertToStrength.put(1, PasswordStrength.WEAK);
        convertToStrength.put(0, PasswordStrength.WEAK);
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

    public PasswordStrength verifyPassword(String password) {
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
        return convertToStrength.get(passCount);
    }
}
