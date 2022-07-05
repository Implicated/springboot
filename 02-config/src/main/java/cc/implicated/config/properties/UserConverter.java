package cc.implicated.config.properties;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Description: [UserConverter、UserConfig] pick one of two
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/21/22 23:14
 */
@Component
@ConfigurationPropertiesBinding
public class UserConverter implements Converter<String, User> {
    @Override
    public User convert(String yml) {
        System.out.println("yml: " + yml);
        return new User(yml, 18);
    }
}
