package cc.blog.web.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * Created by Elvis on 2017/9/18.
 */
public class ConverterDemo2 implements ConverterFactory<String, Number>{

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> aClass) {
        return null;
    }
}
