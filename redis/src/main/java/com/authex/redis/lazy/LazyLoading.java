package com.authex.redis.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoading {
    public LazyLoading(){
        System.out.println("LazyLoading class is loaded ....");
    }
}
