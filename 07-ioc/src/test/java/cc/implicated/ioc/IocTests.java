package cc.implicated.ioc;

import cc.implicated.ioc.init.DemoFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class IocTests {
    @Resource
    private DemoFactory factory;
    
    @Test
    void contextLoads() {
    }
    
}
