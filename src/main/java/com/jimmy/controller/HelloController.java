package com.jimmy.controller;

import com.jimmy.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jimmy on 2017/6/21.
 */
@RestController
@RequestMapping(value = "/")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "hello")
    public String hello() {
        return helloService.hello();
    }
}
