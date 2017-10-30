package cc.blog.aop.aspectj.annotation.schema;

import cc.blog.aop.aspectj.annotation.Waiter;

/**
 * Created by Elvis on 2017/10/27.
 */
public class NaughtyWaiter implements Waiter{
    @Override
    public void greetTo(String name) {
        System.out.println("greet to " + name);
    }

    @Override
    public void serveTo(String name) {
        System.out.println("serve to " + name);
    }
}
