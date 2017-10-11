package cc.blog.web.controller;

import cc.blog.po.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * Created by Elvis on 2017/9/13.
 */
@RestController
public class UserRestController {

    @RequestMapping("/api")
    public Callable<User> api(){

        System.out.println("====hello");

        return () -> {
            Thread.sleep(10L * 1000);
            User user = new User();
            user.setUsername("root");
            user.setPassword("8023");
            return user;
        };
    }
}
