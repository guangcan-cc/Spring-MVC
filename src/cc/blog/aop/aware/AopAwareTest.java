package cc.blog.aop.aware;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Elvis on 2017/10/24.
 */
public class AopAwareTest {

    @Test
    public void fun(){
        ApplicationContext context = new ClassPathXmlApplicationContext("awareApplicationContext.xml");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("Elvis");
    }
}
