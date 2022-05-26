package cc.implicated.aop.cache;

import cc.implicated.aop.pojo.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/23/22 20:19
 */
@Service
public class CacheServiceImpl implements CacheService {
    private final Map<Integer, User> map = new HashMap<>();
    
    @Override
    @Cacheable(value = "cache", key = "#id")
    public User select(Integer id) {
        return map.get(id);
    }
    
    @Override
    public void insert(User user) {
        map.put(user.getId(), user);
    }
    
    @Override
    public void update(User user) {
        map.put(user.getId(), user);
    }
    
    @Override
    public void delete(Integer id) {
        map.remove(id);
    }
    
    @Override
    public List<User> all() {
        return new ArrayList<>(map.values());
    }
}
