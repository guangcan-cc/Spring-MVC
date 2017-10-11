package cc.blog.web.converter;

import cc.blog.po.User;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by Elvis on 2017/9/19.
 */
public class StringToUserConverterTest implements Converter<String, User> {
    @Override
    public User convert(String s) {
        return null;
    }
}
