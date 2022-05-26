package cc.implicated.event.protect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/26/22 23:00
 */
public class config {
    
    @Bean
    @Scope(value = "prototype")
    public ClassOne classOne() {
        return new ClassOne();
    }
}
