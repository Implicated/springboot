package cc.implicated.aop.aspectj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/14/22 23:00
 */
@RestController
@RequestMapping("/aspect")
public class AspectController {
    @Resource
    private AspectService aspectService;
    
    @GetMapping("/before")
    public String before() {
        return aspectService.before();
    }
    
    @GetMapping("/after")
    public String after() {
        return aspectService.after();
    }
    
    @GetMapping("/around")
    public String around() {
        return aspectService.around();
    }
}
