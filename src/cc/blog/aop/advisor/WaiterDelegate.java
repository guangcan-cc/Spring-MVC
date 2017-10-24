package cc.blog.aop.advisor;

/**
 * Created by Elvis on 2017/10/24.
 */
public class WaiterDelegate {

    private Waiter waiter;

    public void service(String clientName){
        waiter.serveTo(clientName);
        waiter.greetTo(clientName);
    }

    public void setWaiter(Waiter waiter){
        this.waiter = waiter;
    }
}
