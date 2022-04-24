package cc.implicated.event;

import cc.implicated.event.user.User;
import cc.implicated.event.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 15:54
 */
@SpringBootTest()
public class UserTest {
    @Resource
    private UserService userService;
    
    @Test
    public void register() {
        User z3 = User.builder().name("z3").age(17).build();
        userService.register(z3);
        User l4 = User.builder().name("l4").age(17).build();
        userService.register(l4);
    }
    
    @Test
    public void assertTest() {
        User u = new User();
        // Assert.isNull(u,"is null");
    }
}
