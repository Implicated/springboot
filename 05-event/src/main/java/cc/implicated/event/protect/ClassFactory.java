package cc.implicated.event.protect;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/26/22 22:34
 */
public class ClassFactory {
    private static final Map<Integer, AbstractClass> MAP = new LinkedHashMap<>();
    
    public static AbstractClass get(Integer key) {
        return MAP.get(key);
    }
    
    public static void put(Integer key, AbstractClass clazz) {
        MAP.put(key, clazz);
    }
}
