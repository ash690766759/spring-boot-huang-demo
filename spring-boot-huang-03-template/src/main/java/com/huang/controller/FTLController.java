package com.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


/**
 * @Controller  视图层使用的注解
 * @RestController  返回JSON数据时使用的注解*/
@Controller
public class FTLController {
    @RequestMapping("/index")
    public String index(Model m){
        m.addAttribute("now",new Date().toString());
        return "/freemarker/index";
    }

    @RequestMapping("/")
    public String inde(){
        return "in";
    }

}
