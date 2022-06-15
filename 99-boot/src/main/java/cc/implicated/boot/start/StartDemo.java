package cc.implicated.boot.start;

import cc.implicated.start.config.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/15/22 16:53
 */
@Service
public class StartDemo {
    
    @Resource
    private DemoService demoService;
    
    public String test() {
        return demoService.getMessage();
    }
}
