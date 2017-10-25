package cc.blog.aop.aware;

/**
 * Created by Elvis on 2017/10/24.
 */
public class Waiter implements BeanSelfProxyAware{

    private Waiter waiter;

    @Override
    public void setSelfProxy(Object object) {
        waiter = (Waiter) object;
    }

    public void greetTo(String name) {
        System.out.println("greet to " + name + "...");
        waiter.serveTo(name);
    }

    public void serveTo(String name) {
        System.out.println("serving to " + name + "...");
    }
}
