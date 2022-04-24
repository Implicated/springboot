package cc.implicated.event.user;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 15:41
 */
@Component
public class UserListener {
    
    @EventListener
    public void notify(UserEvent userEvent) {
        User user = userEvent.getUser();
        System.out.println(user);
    }
}
