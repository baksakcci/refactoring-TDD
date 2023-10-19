import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdminBlockTest {

    private Admin admin;

    @BeforeEach
    void setUp() {
        admin = new Admin();
    }

    @Test
    @DisplayName("처음 Admin을 생성하면_차단해제 상태이다.")
    void create_admin_init_status_unblock() {
        Assertions.assertThat(admin.getStatus())
            .isEqualTo(Status.UNBLOCK);
    }
}
