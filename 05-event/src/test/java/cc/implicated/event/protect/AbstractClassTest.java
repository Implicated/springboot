package cc.implicated.event.protect;

import cc.implicated.event.Event;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/26/22 22:38
 */
@SpringBootTest(classes = Event.class)
public class AbstractClassTest {
   
   @Test
   public void check() {
       System.out.println(ClassFactory.get(1).setParam(1, 1, 1));
       System.out.println(ClassFactory.get(1).setParam(2, 1, 1));
       System.out.println(ClassFactory.get(1).hashCode());
       System.out.println(ClassFactory.get(1).hashCode());
   }
}