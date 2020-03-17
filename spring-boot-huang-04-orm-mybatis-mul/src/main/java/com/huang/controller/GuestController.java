package com.huang.controller;

import com.huang.model.Guest;
import com.huang.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.beans.Transient;

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

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @Transactional
    @PostMapping
    public String add(Guest g){
        service.add(g);
        int a=1/0;
        return "redirect:/guest";
    }
}
