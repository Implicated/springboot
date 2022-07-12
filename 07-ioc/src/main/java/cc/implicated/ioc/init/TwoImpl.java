package cc.implicated.ioc.init;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/24/22 01:52
 */
@Service
public class TwoImpl implements DemoService, InitializingBean {
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        DemoFactory.registerInstance(2, this);
    }
}
