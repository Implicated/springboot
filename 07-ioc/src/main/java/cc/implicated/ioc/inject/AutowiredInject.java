package cc.implicated.ioc.inject;

import org.springframework.stereotype.Service;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/18/22 02:42
 */
@Service
public class AutowiredInject {
    public AutowiredInject() {
        System.out.println(getClass().getSimpleName() + "constructor process 1");
    }
    
    public String getClassName() {
        return getClass().getSimpleName() + "autowired";
    }
}
