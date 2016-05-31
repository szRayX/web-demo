package com.ray.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created on 2016/5/31.
 *
 * @author 薛磊
 * @since 1.0.0
 */
@Controller
@RequestMapping("/springmvc")
public class HelloWorldController {
    @RequestMapping("/helloworld")
    public String sayHello(){
        System.out.println("Hello World!");
        return "springmvc/helloworld";
    }
}
