package com.huang.filter;

import org.springframework.context.annotation.ComponentScan;

import javax.servlet.*;
import java.io.IOException;


public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(".................CustomFilter init................");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(".................CustomFilter dofilter................");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println(".................CustomFilter destory................");
    }
}
