package com.huang.controller;

import com.huang.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 业务控制类    返回视图
 * @RequestMapping("/guest")    代表整个类里面的方法是以此开头的
 * */

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService service;

    /**
     *@GetMapping ==
     * @RequestMapping(method = RequestMethod.GET)
     *  */
    @GetMapping
    public String list(Model m){
        m.addAttribute("guests",service.list());
        System.out.println(service.list());
        return "list";
    }
}
