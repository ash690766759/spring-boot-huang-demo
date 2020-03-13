package com.huang.controller;

import com.huang.bean.Food;
import com.huang.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestCcontroller 返回JSON形式的字符串    而不是视图（html/jsp）
 *                  = @Controller + @Responsebody*/
@RestController

public class JSONController {
   /* *//**
     * 通过${}结构  获得配置文件中的属性值*//*
    @Value("${food.rice}")
    private String rice;
    @Value("${food.meat}")
    private String meat;*/

    @Autowired
    private FoodConfig foodConfig;

    @RequestMapping("/json")
    public Food json(){
        return new Food(foodConfig.getRice(),foodConfig.getMeat());
    }

}
