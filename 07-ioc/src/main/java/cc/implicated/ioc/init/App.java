package cc.implicated.ioc.init;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/24/22 02:00
 */
@RestController
@RequestMapping("/")
public class App {

    @GetMapping
    public String test() {
        return DemoFactory.getInstance(2).getName();
    }

}
