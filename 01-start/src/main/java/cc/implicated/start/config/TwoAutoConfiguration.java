package cc.implicated.start.config;

import cc.implicated.start.TwoService;
import cc.implicated.start.TwoServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
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
public class TwoAutoConfiguration {
    
    @Bean
    @ConditionalOnMissingBean(TwoService.class)
    @ConditionalOnProperty(prefix = "ark.external", value = "two", havingValue = "enable")
    public TwoService demoService() {
        return new TwoServiceImpl();
    }
}
