package com.huang.controller;

import com.huang.bean.Food;
import com.huang.bean.Vegetables;
import com.huang.config.FoodConfig;
import com.huang.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 返回JSON形式的字符串    而不是视图（html/jsp）
 *                  = @Controller + @Responsebody*/
@RestController

public class JSONController {
   /* *//**
     * 通过${}结构  获得配置文件中的属性值*//*
    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;*/

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/jasypt")
    public String jasypt(){
        return username+"\t"+password;
    }


    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json(){
        return new Food(foodConfig.getRice(),foodConfig.getMeat());
    }

    @Autowired
    public VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vege(){
        return new Vegetables(vegetablesConfig.getPotato(),vegetablesConfig.getEggplant(),vegetablesConfig.getGreenpeper());
    }

}
