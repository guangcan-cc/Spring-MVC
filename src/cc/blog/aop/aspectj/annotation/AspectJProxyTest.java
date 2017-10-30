package cc.blog.aop.aspectj.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Elvis on 2017/10/26.
 */
public class AspectJProxyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("aspectJApplicationContext.xml");

        Waiter waiter = (Waiter) context.getBean("naiveWaiter");
        waiter.greetTo("Elvis");
        waiter.serveTo("Elvis");
        waiter = (Waiter) context.getBean("naughtyWaiter");
        waiter.greetTo("Carlos");
        waiter.serveTo("Carlos");
    }
}
