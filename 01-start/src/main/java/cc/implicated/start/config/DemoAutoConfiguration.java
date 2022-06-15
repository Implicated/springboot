package cc.implicated.start.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/15/22 16:23
 */
@Configuration
public class DemoAutoConfiguration {
    
    @Bean
    @ConditionalOnMissingBean(DemoService.class)
    public DemoService demoService(){
        return new DemoService();
    }
}
