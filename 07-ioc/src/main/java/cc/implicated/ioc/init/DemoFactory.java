package cc.implicated.ioc.init;

import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/24/22 01:49
 */
@NoArgsConstructor
public class DemoFactory {
    
    private static final Map<Integer, DemoService> map = new LinkedHashMap<>();
    
    public static DemoService getInstance(Integer code) {
        return map.get(code);
    }
    
    public static void registerInstance(Integer code, DemoService s) {
        map.put(code, s);
    }
}
