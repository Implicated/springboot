package cc.implicated.event.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 15:37
 */
@Getter
@Setter
public class UserEvent extends ApplicationEvent {
    private User user;
    
    public UserEvent(User user) {
        super(user);
        this.user = user;
    }
}
