package cc.implicated.ioc.inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/18/22 02:48
 */
@Controller
@RequestMapping("/test")
public class UserController {
    @Resource
    private UserService user;

    @GetMapping("/resource")
    public void resource() {
        user.resource();
    }

    @GetMapping("/autowired")
    public void autowired() {
        user.autowired();
    }
}
