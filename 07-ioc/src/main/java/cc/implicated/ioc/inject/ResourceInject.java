package cc.implicated.ioc.inject;

import org.springframework.stereotype.Component;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/18/22 02:40
 */
@Component
public class ResourceInject {
    public ResourceInject() {
        System.out.println(getClass().getSimpleName() + "constructor process 1");
    }
    
    public String getClassName() {
        return getClass().getSimpleName() + "resource";
    }
}
