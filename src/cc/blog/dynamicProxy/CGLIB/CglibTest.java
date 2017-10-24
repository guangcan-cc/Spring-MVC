package cc.blog.dynamicProxy.CGLIB;

import cc.blog.service.FormService;
import cc.blog.service.impl.FormServiceImpl;
import org.junit.Test;

/**
 * Created by Elvis on 2017/10/24.
 */
public class CglibTest {

    @Test
    public void proxyTest(){
        CglibProxy proxy = new CglibProxy();

        FormService formService = (FormService) proxy.getProxy(FormServiceImpl.class);

        formService.removeForm(1);
        formService.removeTopic(1);

    }
}
