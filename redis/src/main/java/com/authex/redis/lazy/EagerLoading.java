package com.authex.redis.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoading {
    public EagerLoading()
    {
        System.out.println("EagerLoading class is loaded......");
    }
}
