package cc.implicated.ioc.inject;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 4/18/22 02:30
 */
@Component
public class UserService implements InitializingBean, BeanPostProcessor {
    @Resource
    private ResourceInject resourceInject;
    @Autowired
    private AutowiredInject autowiredInject;

    public UserService() {
        System.out.println(getClass().getSimpleName() + "constructor process 1");
    }

    @PostConstruct
    public void post() {
        System.out.println(getClass().getSimpleName() + "PostConstruct process 2");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getClass().getSimpleName() + "afterPropertiesSet process 3");
    }

    // @Override
    // public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    //     System.out.println(getClass().getSimpleName() + "postProcessBeforeInitialization process");
    //     return bean;//BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    // }
    //
    // @Override
    // public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    //     System.out.println(getClass().getSimpleName() + "postProcessAfterInitialization process");
    //     return bean;//BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    // }

    public void resource() {
        System.out.println(resourceInject.getClassName());
    }

    public void autowired() {
        System.out.println(autowiredInject.getClassName());
    }
}
