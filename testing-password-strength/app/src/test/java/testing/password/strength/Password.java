package testing.password.strength;

public class Password {

    public boolean verifyLength(String password) {
        return password.length() >= 8;
    }
}
