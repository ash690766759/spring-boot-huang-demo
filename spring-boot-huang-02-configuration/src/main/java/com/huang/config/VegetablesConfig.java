package com.huang.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * vegetables.potato=土豆
 * vegetables.eggplant=茄子
 * vegetables.greenpeper=青椒
 *
 * @Configuration
 *  声明一个配置类 =》可替代xml文件（spring中）
 * @ConfigurationProperties(prefix = "vegetables")
 *  声明这个配置文件类   并声明前缀
 * @PropertySource("classpath:vegetables.properties")
 *  声明文件对应地址
 * */
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;

    public String getPotato() {
        return potato;
    }

    public void setPotato(String potato) {
        this.potato = potato;
    }

    public String getEggplant() {
        return eggplant;
    }

    public void setEggplant(String eggplant) {
        this.eggplant = eggplant;
    }

    public String getGreenpeper() {
        return greenpeper;
    }

    public void setGreenpeper(String greenpeper) {
        this.greenpeper = greenpeper;
    }
}
