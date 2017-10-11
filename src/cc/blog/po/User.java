package cc.blog.po;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by Elvis on 2017/9/12.
 */
@XStreamAlias("USER")
public class User {

    private Date birthday;

    @XStreamAlias("USERNAME")
    private String username;

    @XStreamAlias("PASSWORD")
    private String password;

    @XStreamAlias("ADDRESS")
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
