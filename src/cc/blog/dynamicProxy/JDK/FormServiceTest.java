package cc.blog.dynamicProxy.JDK;

import cc.blog.service.FormService;
import cc.blog.service.impl.FormServiceImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by Elvis on 2017/10/9.
 */
public class FormServiceTest {

    @Test
    public void proxy() {
        FormService target = new FormServiceImpl();
        PerformanceHandler handler = new PerformanceHandler(target);

        Class<?>[] interfaces = target.getClass().getInterfaces();
        FormService proxy = (FormService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);

        proxy.removeTopic(1);
        proxy.removeForm(2);
    }
}
