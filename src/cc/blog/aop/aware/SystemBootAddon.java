package cc.blog.aop.aware;

import org.springframework.core.Ordered;

/**
 * Created by Elvis on 2017/10/24.
 */
public interface SystemBootAddon extends Ordered {

    void onReady();
}
