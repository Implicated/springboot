package cc.implicated.serialize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Java Bean(getter) --> Json 序列化
 * Json --> Java Bean(setter) 反序列化
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 2022/05/16 16:11
 */
@SpringBootApplication
public class Serialize {
    
    public static void main(String[] args) {
        SpringApplication.run(Serialize.class, args);
    }
    
}
