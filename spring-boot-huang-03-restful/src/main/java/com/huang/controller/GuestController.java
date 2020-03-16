package com.huang.controller;

import com.huang.model.Guest;
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

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    public String add(Guest g){
        service.add(g);//？？？自动包装成类？？？
        return "redirect:/guest";
    }

    /**
     * @PathVariable("name") String name        映射到方法参数中
     *                                            从路径中获取name值*/
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest g = service.get(name);
        model.addAttribute("guest",g);
        return "update";
    }
    @PutMapping
    public String update(Guest g){
        service.update(g);//？？？自动包装成类？？？
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        service.detele(name);
        return "redirect:/guest";
    }


}
