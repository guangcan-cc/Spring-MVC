package cc.blog.aop.aspectj.annotation.declare;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by Elvis on 2017/10/27.
 */
@Aspect
public class EnableSellerAspect {
    @DeclareParents(value = "cc.blog.aop.aspectj.annotation.NaiveWaiter",defaultImpl = SellerImpl.class)
    public Seller seller;
}
