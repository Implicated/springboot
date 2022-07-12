package cc.implicated.start;

import org.springframework.beans.factory.InitializingBean;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/15/22 16:22
 */
public class TwoServiceImpl implements TwoService, InitializingBean {

    public String getMessage() {
        return "hello two";
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("after two");
    }
}
