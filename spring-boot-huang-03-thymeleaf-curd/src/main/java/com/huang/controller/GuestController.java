package com.huang.controller;

import com.huang.bean.Guest;
import com.huang.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业务控制类    返回视图*/
@Controller
public class GuestController {

    @Autowired
    private GuestService service;

    @RequestMapping("/guest/list")
    public String list(Model m){
        m.addAttribute("guests",service.list());
        System.out.println(service.list());
        return "list";
    }

    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/guest/add")
    public String add(Guest g){
        service.add(g);//？？？自动包装成类？？？
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/toUpdate")
    public String toUpdate(Model model,String name){
        Guest g = service.get(name);
        model.addAttribute("guest",g);
        return "update";
    }

    @RequestMapping("/guest/update")
    public String update(Guest g){
        service.update(g);//？？？自动包装成类？？？
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/delete")
    public String delete(String name){
        service.detele(name);
        return "redirect:/guest/list";
    }


}
