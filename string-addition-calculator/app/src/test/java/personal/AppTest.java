package personal;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {
    private static final String input = "1+2";
    @Test
    @DisplayName("입력 테스트")
    void input() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        Scanner scanner = new Scanner(System.in);
        Assertions.assertThat(scanner.next()).isEqualTo("1+2");
    }
}
