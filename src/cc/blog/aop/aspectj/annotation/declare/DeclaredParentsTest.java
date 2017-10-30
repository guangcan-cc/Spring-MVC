package cc.blog.aop.aspectj.annotation.declare;

import cc.blog.aop.aspectj.annotation.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Elvis on 2017/10/27.
 */
public class DeclaredParentsTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspectJApplicationContext.xml");

        Waiter waiter = (Waiter) context.getBean("waiter");
        waiter.greetTo("Elvis");
        waiter.serveTo("Elvis");

        Seller seller = (Seller) waiter;
        seller.greetTo("Carlos");
    }
}
