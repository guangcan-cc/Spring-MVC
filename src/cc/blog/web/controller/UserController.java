package cc.blog.web.controller;

import cc.blog.po.User;
import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.Map;

/**
 * Created by Elvis on 2017/9/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping("/handle41")
    public String handle41(@RequestBody String requestBody,String username,String password,String age){
        System.out.println(requestBody);

        return "success";
    }

    @ResponseBody
    @RequestMapping("/handle42/{imageId}")
    public byte[] handler42(@PathVariable("imageId") String imageId) throws IOException {

        System.out.println("load image of " + imageId);
        Resource res = new ClassPathResource("/4120002-8bb71a01b012531c.png");
        return FileCopyUtils.copyToByteArray(res.getInputStream());
    }

    @RequestMapping("/handle43")
    public String handle43(HttpEntity<String> httpEntity){
        return "/register";
    }

    @RequestMapping("/handle51")
    public ResponseEntity<User> handle51(HttpEntity<User> requestEntity){
        User user = requestEntity.getBody();
        user.setUsername("xxxx");
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    @RequestMapping("/handle81")
    public void handle81(User user, ModelMap modelMap, Date date){

        modelMap.put("user",user);
        System.out.println(user.getBirthday());
        System.out.println(date);
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(Map<String,Object> map,User user){

        logger.info("fdsfs的防守打法的方式佛挡杀佛的我开始注册了，正式开启了日志信息记录.......");

        System.out.println(map.size()+"dsadsadas多撒大所大所大所多少时诵诗书所所所");
        map.put("username","root");
        map.put("user",user);


        logger.info("我注册完毕。。。。。.....");
        return "/register";
    }
}
