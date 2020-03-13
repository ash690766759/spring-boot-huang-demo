package com.huang;

import com.huang.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication   声明入口类   并且生命是springboot项目
 * */
@SpringBootApplication
@EnableConfigurationProperties(FoodConfig.class)
/**
 * @EnableConfigurationProperties(FoodConfig.class)
 * 告诉主程序入口类 要自动引入配置文件
 * 配置文件对应的类作为参数*/
public class DemoApplicaion {
    /*程序入口*/
    public static void main(String[] args) {
        /*使用SpringApplication的静态方法
                参数  程序的入口类/main函数的参数*/
        SpringApplication.run(DemoApplicaion.class,args);
    }
}
