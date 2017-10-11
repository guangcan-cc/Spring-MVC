package cc.blog.aop.advice.before;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Elvis on 2017/10/9.
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String clientName = (String) objects[0];

        System.out.println("how are you! Mr ." + clientName + ".");
    }
}
