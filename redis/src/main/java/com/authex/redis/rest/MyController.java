package com.authex.redis.rest;

import com.authex.redis.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    private MyService myService;
    public String myName(){
        return myService.myName();
    }
}
