package com.authex.redis.value;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ValueAnnotationDemo {

//    assign default value to the variable
    @Value("Tanveer")
    private String defaultName;

//    read the value from properties files using @Value
    @Value("${mail.host}")
    private String host;
    @Value("${mail.email}")
    private String email;
    @Value("${mail.password}")
    private Integer password;




}
