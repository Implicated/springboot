package cc.implicated.event.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static cc.implicated.event.Event.AC;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 3/11/22 15:48
 */
@Slf4j
@Service
public class UserService {
    
    public void register(User user) {
        log.info("zylog#register ==> register:{{}}", user);
        AC.publishEvent(new UserEvent(user));
    }
}
