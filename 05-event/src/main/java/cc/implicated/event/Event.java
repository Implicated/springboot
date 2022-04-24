package cc.implicated.event;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class Event implements ApplicationContextAware {
    public static ApplicationContext AC;
    
    public static void main(String[] args) {
        SpringApplication.run(Event.class, args);
    }
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AC = applicationContext;
    }
}
