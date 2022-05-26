package cc.implicated.serialize.vo;

import cc.implicated.serialize.config.SerializerBigDecimal;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

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
public class BigDecimalDemoVO {
    //原类型
    private BigDecimal avgScore;
    
    // 精确二位小数，四舍五入
    @JsonSerialize(using = SerializerBigDecimal.class)
    private BigDecimal avgScore1;
    
    // 保留两位整数和三位小数，四舍五入
    @JsonFormat(pattern = "00.000", shape = JsonFormat.Shape.STRING)
    @JsonSerialize(using = SerializerBigDecimal.class)
    private BigDecimal avgScore２;
    
    // 化为百分比且精确两位小数，四舍五入
    @JsonFormat(pattern = "#.##%", shape = JsonFormat.Shape.STRING)
    @JsonSerialize(using = SerializerBigDecimal.class)
    private BigDecimal avgScore3;
}
