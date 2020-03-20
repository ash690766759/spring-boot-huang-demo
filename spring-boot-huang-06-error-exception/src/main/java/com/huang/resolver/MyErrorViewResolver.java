package com.huang.resolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
//需要是一个bean spring能处理   才能生效
@Component
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        if (status.equals(HttpStatus.NOT_FOUND)) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("/resolver404");
        }
        return null;
    }
}
