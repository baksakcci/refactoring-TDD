package testing.password.strength;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PasswordStrengthTest {
    @Test
    @DisplayName("비밀번호가_8글자 이상이면_True를 반환한다")
    void verify_password_length() {
        Assertions.assertThat(new Password().verifyLength("12345678"))
            .isTrue();
    }
}
