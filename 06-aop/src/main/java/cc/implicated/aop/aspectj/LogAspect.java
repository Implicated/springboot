package cc.implicated.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author zhang.yu@qhlt.com.cn
 * @version 1.0
 * @since 6/14/22 21:06
 */
@Aspect
@Component
public class LogAspect {
    
    /**
     * <a href="https://zhuanlan.zhihu.com/p/63001123">spring aop中pointcut表达式完整版</a>
     */
    @Pointcut("within(cc.implicated.aop.aspectj..*)")
    public void withinPointcut() {
    }
    
    @Pointcut("@within(cc.implicated.aop.aspectj.Log)")
    public void atWithinPointcut() {
    }
    
    @Pointcut("@annotation(cc.implicated.aop.aspectj.Log)")
    public void annotationPointcut() {
    }
    
    /**
     * execution(modifiers-pattern? ret-type-pattern declaring-type-pattern? name-pattern(param-pattern)throws-pattern?)
     * <ul>
     * <li>修饰符匹配（modifier-pattern?）</li>
     * <li>返回值匹配（ret-type-pattern）可以为*表示任何返回值,全路径的类名等</li>
     * <li>类路径匹配（declaring-type-pattern?）</li>
     * <li>方法名匹配（name-pattern）可以指定方法名 或者 *代表所有, set* 代表以set开头的所有方法</li>
     * <li>参数匹配（(param-pattern)）可以指定具体的参数类型，多个参数间用“,”隔开，各个参数也可以用“*”来表示匹配任意类型的参数，如(String)表示匹配一个String参数的方法；(*,String) 表示匹配有两个参数的方法，第一个参数可以是任意类型，而第二个参数是String类型；可以用(..)表示零个或多个任意参数</li>
     * <li>异常类型匹配（throws-pattern?）</li>
     * <li>其中后面跟着“?”的是可选项</li>
     * </ul>
     */
    @Pointcut("execution(public * cc.implicated.aop.aspectj.AspectService.*(..))")
    public void executionPointcut() {
    }
    
    // @Before("execution(public * cc.implicated.learnjava.service.UserService.*(..))")
    @Before("annotationPointcut()")
    public String before() {
        System.out.println("before start");
        return "before";
    }
    
    // @After("annotationPointcut()")
    public String after() {
        System.out.println("after start");
        return "after";
    }
    
    /**
     * 返回原方法的值
     */
    @Around("annotationPointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around start");
        Object proceed = pjp.proceed();
        System.out.println("around end");
        return proceed;
    }
    
}
