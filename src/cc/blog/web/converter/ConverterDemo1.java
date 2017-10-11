package cc.blog.web.converter;

import org.springframework.core.convert.converter.Converter;

import java.util.Date;

/**
 * Created by Elvis on 2017/9/18.
 */
public class ConverterDemo1 implements Converter<String, Date>{
    @Override
    public Date convert(String s) {
        return null;
    }
}
