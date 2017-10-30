package cc.blog.aop.aspectj.annotation;

/**
 * Created by Elvis on 2017/10/26.
 */
public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greet to " + name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }
}
