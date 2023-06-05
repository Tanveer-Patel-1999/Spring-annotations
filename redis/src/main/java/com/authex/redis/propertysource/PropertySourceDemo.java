package com.authex.redis.propertysource;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Getter
public class PropertySourceDemo {

    @Value("${gmail.host}")
    private String host;
    @Value("${gmail.email}")
    private String email;
    @Value("${gmail.password}")
    private String password;
    @Value("${app.name}")
    private String appName;
    @Value("${app.description}")
    private String appDescription;


}
