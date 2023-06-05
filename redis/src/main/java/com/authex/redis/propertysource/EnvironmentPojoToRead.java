package com.authex.redis.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentPojoToRead {
    @Autowired
    private Environment environment;
    private String host;
    private String email;
    private String password;
    private String appName;
    private String appDescription;

    public String getHost() {
        return environment.getProperty("gmail.host");
    }

    public String getEmail() {
        return environment.getProperty("gmail.email");
    }

    public String getPassword() {
        return environment.getProperty("gmail.password");
    }

    public String getAppName() {
        return environment.getProperty("app.name");
    }

    public String getAppDescription() {
        return environment.getProperty("app.description");
    }
}
