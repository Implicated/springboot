package cc.implicated.aop.aspectj;

import org.springframework.stereotype.Service;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/14/22 23:01
 */
@Service
public class AspectService {
    
    @Log
    public int before() {
        return 1;
    }
    
    @Log
    public String after() {
        return null;
    }
    
    @Log
    public int around() {
        return 1;
    }
}
