package testing.password.strength;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PasswordStrengthTest {

    private Password password = new Password();

    @Test
    @DisplayName("비밀번호가_8글자 이상이면_True를 반환한다")
    void verify_password_length() {
        Assertions.assertThat(password.verifyLength("12345678"))
            .isTrue();
    }

    @Test
    @DisplayName("비밀번호가_0부터 9까지 숫자를 포함하면_True를 반환한다")
    void verify_password_contains_number() {
        Assertions.assertThat(password.verifyContainsNumber("1123"))
            .isTrue();
        Assertions.assertThat(password.verifyContainsNumber("a2bc"))
            .isTrue();
        Assertions.assertThat(password.verifyContainsNumber("3afdg6so9"))
            .isTrue();
    }

    @Test
    @DisplayName("비밀번호가_대문자를 포함하면_True를 반환한다")
    void verify_password_contains_uppercase() {
        Assertions.assertThat(password.verifyContainsUppercase("Ad24dfg90"))
            .isTrue();
    }
}
