package cc.implicated.config.properties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/21/22 22:30
 */
@Slf4j
@Service
public class Demo implements InitializingBean {
    @Resource
    private AppProperties appProperties;

    public void getProperties() {
        System.out.println(appProperties);
    }

    @Override
    public void afterPropertiesSet() {
        getProperties();
    }
}
