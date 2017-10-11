package cc.blog.test;

import cc.blog.po.User;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.junit.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.*;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Elvis on 2017/9/13.
 */
public class UserControllerTest {

    @Test
    public void testHandle41(){

        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        form.add("username","tom");
        form.add("password","0000");
        form.add("age","45");
        restTemplate.postForLocation("http://localhost:8080/spring-mvc/user/handle41.do",form);
    }

    @Test
    public void testHandle42() throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        byte[] response = restTemplate.postForObject("http://localhost:8080/spring-mvc/user/handle42/{itemId}.do",
                null,byte[].class,"5555");
        Resource outFile = new FileSystemResource("d:/image_copy.jpg");
        FileCopyUtils.copy(response,outFile.getFile());

    }

    @Test
    public void testHandle43() throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> form = new LinkedMultiValueMap<>();
        form.add("username","tom");
        form.add("password","0000");
        form.add("age","45");
        URI uri = restTemplate.postForLocation("http://localhost:8080/spring-mvc/user/handle43.do",form);

        System.out.println(uri);

    }

    @Test
    public void testHandle51(){

        RestTemplate restTemplate = buildRestTemplate();

        User user = new User();
        user.setUsername("tom");
        user.setPassword("0000");
        user.setAddress("xxx");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf("application/xml;UTF-8"));
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_XML));
        HttpEntity<User> requestEntity = new HttpEntity<>(user,headers);
        ResponseEntity<User> responseEntity = restTemplate.exchange("http://localhost:8080/spring-mvc/user/handle51.do",
                HttpMethod.POST,requestEntity,User.class);
        User responseUser = responseEntity.getBody();

        System.out.println(user);

    }

    private RestTemplate buildRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        XStreamMarshaller xmlMars = new XStreamMarshaller();
        xmlMars.setStreamDriver(new StaxDriver());
        xmlMars.setAnnotatedClasses(User.class);
        MarshallingHttpMessageConverter xmlConverter = new MarshallingHttpMessageConverter();
        xmlConverter.setMarshaller(xmlMars);
        xmlConverter.setUnmarshaller(xmlMars);
        restTemplate.getMessageConverters().add(xmlConverter);
        return restTemplate;
    }
}















