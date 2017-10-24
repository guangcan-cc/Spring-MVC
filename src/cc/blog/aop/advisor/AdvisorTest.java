package cc.blog.aop.advisor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Elvis on 2017/10/24.
 */
public class AdvisorTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("advisorApplicationContext.xml");
        Seller seller = (Seller) context.getBean("seller");
        seller.greetTo("张三");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("张三");
        waiter.serveTo("李四");
    }

    @Test
    public void fun(){
        ApplicationContext context = new ClassPathXmlApplicationContext("advisorApplicationContext.xml");
        Waiter waiter = (Waiter) context.getBean("waiter1");
        waiter.greetTo("张三");
        waiter.serveTo("李四");
        Seller seller = (Seller) context.getBean("seller1");
        seller.greetTo("张三");
    }

    @Test
    public void testFlowAdvisor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("advisorApplicationContext.xml");
        Waiter waiter = (Waiter) context.getBean("waiter3");
        waiter.greetTo("Elvis");
        waiter.serveTo("Elvis");
        WaiterDelegate wd = new WaiterDelegate();
        wd.setWaiter(waiter);
        wd.service("Elvis");
    }

    @Test
    public void testAutoAdvisor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autoApplicationContext.xml");
        Seller seller = (Seller) context.getBean("seller");
        seller.greetTo("张三");
        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("张三");
        waiter.serveTo("李四");

        WaiterDelegate wd = new WaiterDelegate();
        wd.setWaiter(waiter);
        wd.service("Elvis");
    }
}
