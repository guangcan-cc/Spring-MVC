package cc.blog.aop.advisor;

/**
 * Created by Elvis on 2017/10/24.
 */
public class Waiter {
    public void greetTo(String name) {
        System.out.println("greet to " + name + "...");
    }

    public void serveTo(String name) {
        System.out.println("serving to " + name + "...");
    }
}
