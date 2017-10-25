package cc.blog.aop.aware;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.OrderComparator;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;

/**
 * Created by Elvis on 2017/10/24.
 */
@Component
public class SystemBootManager implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger logger = Logger.getLogger(SystemBootManager.class);

    private List<SystemBootAddon> systemBootAddons = Collections.EMPTY_LIST;

    private boolean hasRunOnce = false;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println(contextRefreshedEvent.getApplicationContext().getParent());
        if(!hasRunOnce){
            for(SystemBootAddon systemBootAddon : systemBootAddons){
                systemBootAddon.onReady();
                if(logger.isDebugEnabled()){
                    logger.debug("执行插件：" + systemBootAddon.getClass().getCanonicalName());
                }
            }
            hasRunOnce = true;
        } else {
            if(logger.isDebugEnabled()){
                logger.debug("已经执行过容器启动插件集。。。");
            }
        }
    }

    @Autowired(required = false)
    public void setSystemBootAddons(List<SystemBootAddon> systemBootAddons){
        Assert.notEmpty(systemBootAddons);
        OrderComparator.sort(systemBootAddons);
        this.systemBootAddons = systemBootAddons;
    }
}
