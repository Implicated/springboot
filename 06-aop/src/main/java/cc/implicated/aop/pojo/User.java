package cc.implicated.aop.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/8/22 16:36
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;
    private Integer age;

    public static User getOne(Integer id, Integer age) {
        return User.builder().id(id).age(age).build();
    }

    public static List<User> getList() {
        List<User> list = new ArrayList<>();
        list.add(getOne(1, 10));
        list.add(getOne(2, 4));
        list.add(getOne(3, 6));
        list.add(getOne(4, 6));
        list.add(getOne(5, 7));
        return list;
    }
}
