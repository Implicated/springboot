package cc.implicated.serialize.controller;

import cc.implicated.serialize.vo.BigDecimalDemoVO;
import cc.implicated.serialize.vo.JacksonDemoVO;
import cc.implicated.serialize.vo.SerializeDemoVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 5/16/22 10:44
 */
@RestController
@RequestMapping("/")
public class TestController {
    
    @GetMapping("/s")
    public SerializeDemoVO serialize() {
        SerializeDemoVO vo = new SerializeDemoVO();
        vo.setId(1).setGender("1").setSex("1");
        return vo;
    }
    
    @GetMapping("/j")
    public JacksonDemoVO jackson() {
        return new JacksonDemoVO();
    }
    
    @GetMapping("/b")
    public BigDecimalDemoVO bigDecimal() {
        BigDecimal bd = new BigDecimal("0.1521");
        BigDecimalDemoVO vo = new BigDecimalDemoVO();
        vo.setAvgScore(bd).setAvgScore1(bd).setAvgScore２(bd).setAvgScore3(bd);
        return vo;
    }
}
