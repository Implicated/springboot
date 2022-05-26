package cc.implicated.event.protect;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/26/22 22:30
 */
@Service
public class ClassOne extends AbstractClass implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        ClassFactory.put(1, this);
    }
}
