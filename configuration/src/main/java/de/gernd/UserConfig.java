package de.gernd;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "user")
@Component
public class UserConfig {
    public String nick;
    public String password;

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    @Override
    public String toString() {
        return "Name: " + nick + " password: " + password;
    }
}
