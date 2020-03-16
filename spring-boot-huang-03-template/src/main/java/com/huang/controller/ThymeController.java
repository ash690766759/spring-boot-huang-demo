package com.huang.controller;

import com.huang.model.Reataurant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {
    @RequestMapping("/thy")
    public  String index(Model m){
        Reataurant r = new Reataurant();
        r.setBoss("黄");
        r.setChef("张大厨");
        m.addAttribute("name","Thymeleaf");
        m.addAttribute("r",r);
        return "/thymeleaf/index";
    }

    @RequestMapping("/wel")
    public String wel(){
        return "/thymeleaf/wel";
    }
}
