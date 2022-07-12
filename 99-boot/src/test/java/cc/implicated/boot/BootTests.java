package cc.implicated.boot;

import cc.implicated.start.TwoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class BootTests {
    @Resource
    private TwoService twoService;

    @Test
    void contextLoads() {
        System.out.println(twoService.getMessage());
    }

}
