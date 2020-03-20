package com.huang.config;

import com.huang.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * web.xml
 * <filter>
 *     <filter-name>struts2</filter-name>
 *     <filter-class>com.huang.filter.CustomFilter</filter-class>
 * </filter>
 *
 * <filter-mapping>
 *     <filter-name>struts2</filter-name>
 *     <url-pattern>/*</url-pattern>
 * </filter-mapping>
 * */

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<CustomFilter> filterRegistrationBean(){
        FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new CustomFilter());
        filterFilterRegistrationBean.addUrlPatterns("/*");
        //filterFilterRegistrationBean.setOrder();//决定注册的优先级
        return filterFilterRegistrationBean;
    }
}
