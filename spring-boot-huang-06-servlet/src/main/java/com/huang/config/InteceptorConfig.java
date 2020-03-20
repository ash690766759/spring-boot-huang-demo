package com.huang.config;

import com.huang.inteceptor.CustomInteceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InteceptorConfig implements WebMvcConfigurer {
    @Autowired
    private CustomInteceptor inteceptor;
    /**
     * 注册自定义的拦截器，并定义拦截规则*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(inteceptor).addPathPatterns("/**");
    }
}
