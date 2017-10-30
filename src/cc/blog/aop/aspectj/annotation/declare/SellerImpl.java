package cc.blog.aop.aspectj.annotation.declare;

/**
 * Created by Elvis on 2017/10/24.
 */
public class SellerImpl implements Seller{

    public void greetTo(String name) {
        System.out.println("seller greet to " + name + "...");
    }
}
