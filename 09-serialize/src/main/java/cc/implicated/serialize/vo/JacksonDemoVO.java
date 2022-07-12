package cc.implicated.serialize.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

/**
 * <p>
 * Description:
 * Java Bean --> Json 序列化
 * Json --> Java Bean 反序列化
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/16/22 10:29
 */
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
// @JsonInclude(JsonInclude.Include.NON_NULL)
// @JsonIgnoreProperties("avgScore")
// @JsonIncludeProperties("avgScore")
public class JacksonDemoVO {

    // 为空不展示
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer id;

    // lombok getter不兼，手动写getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sId;

    // public String getsId() {
    //     return sId;
    // }

    // lombok getter不兼，手动写getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date dId;

    // 跳过序列化和反序列化
    @JsonIgnore
    private Integer ignore;

    // 改名
    @JsonProperty("property")
    private Integer hello;
}
