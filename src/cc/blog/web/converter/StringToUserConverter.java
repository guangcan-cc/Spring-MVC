package cc.blog.web.converter;

import cc.blog.po.User;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by Elvis on 2017/9/18.
 */
public class StringToUserConverter implements Converter<String, User> {

    @Override
    public User convert(String s) {
        if(s != null){
            String[] item = s.split(":");
            if(item.length == 0){
                User user = new User();
                user.setUsername(item[0]);
                user.setPassword(item[1]);
                user.setAddress(item[2]);
            }
        }
        return null;
    }
}
