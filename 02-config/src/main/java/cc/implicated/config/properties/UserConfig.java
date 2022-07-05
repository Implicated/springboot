package cc.implicated.config.properties;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * Description: [UserConverter、UserConfig] pick one of two
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/21/22 23:25
 */
@Configuration
public class UserConfig {
    
    @Bean
    @ConfigurationPropertiesBinding
    public UserConverter user() {
        return new UserConverter();
    }
}
