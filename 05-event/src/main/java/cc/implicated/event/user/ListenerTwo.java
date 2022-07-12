package cc.implicated.event.user;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Component
public class ListenerTwo {

    @EventListener
    public void notify(UserEvent userEvent) {
        log.info("zylog#notify ==> two threadId:{{}}", Thread.currentThread().getId());
        User user = userEvent.getUser();
        System.out.println(getClass().getSimpleName());
    }
}
