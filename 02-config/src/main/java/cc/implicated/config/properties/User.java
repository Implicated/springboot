package cc.implicated.config.properties;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/21/22 23:12
 */
@Data
@AllArgsConstructor
public class User {
    private String name;

    private Integer age;
}
