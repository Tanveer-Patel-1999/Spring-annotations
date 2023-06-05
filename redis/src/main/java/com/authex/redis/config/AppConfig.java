package com.authex.redis.config;

import com.authex.redis.service.NonVegPizza;
import com.authex.redis.service.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
// using configuration class we can create bean for a class using @Bean at method level
    @Bean
    public Pizza getNonVegPizza(){
        return new NonVegPizza();
    }
}
