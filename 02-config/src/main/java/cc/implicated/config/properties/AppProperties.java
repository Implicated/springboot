package cc.implicated.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/21/22 22:15
 */
@Data
@Component
@Validated
@ConfigurationProperties(value = "app", ignoreInvalidFields = true, ignoreUnknownFields = true)
// @PropertySource("classpath:/config/application.properties")
@PropertySource("classpath:/application.yml")
@Profile("test")
public class AppProperties {
    private Integer port;
    private String name;
    private String msg;
    @NotEmpty
    private String info;
    private List<String> address;
    private User user;
}
