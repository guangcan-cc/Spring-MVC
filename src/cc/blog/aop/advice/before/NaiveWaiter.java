package cc.blog.aop.advice.before;

/**
 * Created by Elvis on 2017/10/9.
 */
public class NaiveWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("greet to " + name + "...");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serving to " + name + "...");
    }
}
