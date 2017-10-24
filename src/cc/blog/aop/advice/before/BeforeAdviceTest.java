package cc.blog.aop.advice.before;

import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created by Elvis on 2017/10/9.
 */
public class BeforeAdviceTest {

    @Test
    public void before(){
        Waiter target = new NaiveWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();

        //Spring提供的代理工厂
        ProxyFactory pf = new ProxyFactory();
        //设置代理目标
        pf.setTarget(target);
        //为代理目标增强
        pf.addAdvice(advice);
        //生成代理实例
        Waiter proxy = (Waiter) pf.getProxy();

        proxy.greetTo("张三");
        proxy.serveTo("李四");

    }

    @Test
    public void applicationBefore(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Waiter proxy = (Waiter) context.getBean("waiter");
        proxy.greetTo("张三");
        proxy.serveTo("李四");
    }
}
