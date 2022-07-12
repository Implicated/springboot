package cc.implicated.aop.cache;

import cc.implicated.aop.pojo.User;

import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/23/22 20:18
 */
public interface CacheService {

    User select(Integer id);

    void insert(User user);

    void update(User user);

    void delete(Integer id);

    List<User> all();
}
