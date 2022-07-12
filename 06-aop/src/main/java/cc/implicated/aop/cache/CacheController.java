package cc.implicated.aop.cache;

import cc.implicated.aop.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/23/22 20:35
 */
@RestController
@RequestMapping("/")
public class CacheController {
    private Integer id = 1;
    @Resource
    private CacheService cacheService;

    @GetMapping("/get")
    public User select() {
        return cacheService.select(1);
    }

    @GetMapping("/upd")
    public User update() {
        User user = select();
        user.setAge(user.getAge() + 1);
        cacheService.update(user);
        return user;
    }

    @GetMapping("/ins")
    public User insert() {
        User u = User.getOne(id++, 1);
        cacheService.insert(u);
        return u;
    }

    @GetMapping("/del")
    public User delete() {
        User u = cacheService.select(1);
        cacheService.delete(u.getId());
        return u;
    }

    @GetMapping("/all")
    public List<User> all() {
        return cacheService.all();
    }
}
