package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomizerController {
    @RequestMapping("/error404")
    public String test(){
        return "error404";
    }
    @RequestMapping("/test")
    public String error() throws Exception {
        throw new Exception("测试异常");
    }
}
