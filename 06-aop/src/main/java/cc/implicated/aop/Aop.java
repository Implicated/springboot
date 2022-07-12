package cc.implicated.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Aop {

    public static void main(String[] args) {
        SpringApplication.run(Aop.class, args);
    }

}
