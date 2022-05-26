package cc.implicated.serialize.vo;

import cc.implicated.serialize.annotation.Gender;
import cc.implicated.serialize.config.SerializerGender;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/16/22 10:29
 */
@Data
@Accessors(chain = true)
// @JsonInclude(JsonInclude.Include.NON_NULL)
// @JsonIgnoreProperties("avgScore")
// @JsonIncludeProperties("avgScore")
public class SerializeDemoVO {
    
    // 相同范型才能使用，不同类型会报转换异常
    // @JsonSerialize(using = SerializerGender.class)
    private Integer id;
    
    @JsonSerialize(using = SerializerGender.class)
    private String gender;
    
    @Gender
    private String sex;
}
