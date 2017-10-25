package cc.blog.listener;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Elvis on 2017/10/24.
 */
public class Demo {

    @Test
    public void fun(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:listenerApplicationContext.xml");
        /*EmailEvent event = new EmailEvent("hello","boylmx@163.com","this is a email text!");
        context.publishEvent(event);*/
        context.getBean("");
    }
}
