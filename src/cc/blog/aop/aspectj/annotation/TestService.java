package cc.blog.aop.aspectj.annotation;

/**
 * Created by Elvis on 2017/10/26.
 */
public class TestService {

    @NeedTest(value = true)
    public int deleteForm(){
        System.out.println("删除模块");
        return 0;
    }
}
