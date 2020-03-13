package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication   声明入口类   并且生命是springboot项目
 * */
@SpringBootApplication
public class DemoApplicaion {
    /*程序入口*/
    public static void main(String[] args) {
        /*使用SpringApplication的静态方法
                参数  程序的入口类/main函数的参数*/
        SpringApplication.run(DemoApplicaion.class,args);
    }
}
