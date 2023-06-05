package com.authex.redis.controller;

import com.authex.redis.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

/*    us must required three annotations
1 : @Controller : the class become a spring mvn controller class and handle the HTTP request
2 : @RequestMapping : it is used to map the incoming HTTp request
3 : @ResponseBody : it is used to convert the return type of the method into JSON format and JSON into HTTP response Object
 */
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "hello from bookController....";
    }

    @RequestMapping("/book")
    @ResponseBody
    public Book getBook(){
        Book book = new Book(1L, "java","core java");
        return book;
    }



}
