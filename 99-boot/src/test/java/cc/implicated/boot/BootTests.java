package cc.implicated.boot;

import cc.implicated.boot.start.StartDemo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BootTests {
    @Resource
    private StartDemo startDemo;
    
    @Test
    void contextLoads() {
        System.out.println(startDemo.test());
    }
    
}
