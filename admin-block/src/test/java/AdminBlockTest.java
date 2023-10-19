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

//    @Test
//    @DisplayName("차단하면_차단 상태로 바뀐다.")
//    void change_block_status() {
//        Assertions.assertThat(admin.blocking())
//            .isEqualTo(Status.BLOCK);
//    }

    @Test
    @DisplayName("차단할 때_이미 차단된 상태라면_예외 발생")
    void name() {
        Assertions.assertThatThrownBy(() -> admin.blocking())
            .isInstanceOf(IllegalAccessException.class)
            .hasMessageContaining("이미 차단");
    }
}
