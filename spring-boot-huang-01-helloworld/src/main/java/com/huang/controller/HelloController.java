package com.huang.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller  控制类 业务逻辑    请求分发/响应*/
@Controller
public class HelloController {
    /**
     * @RequestMapping  指定方法和请求之间的关系*/
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
