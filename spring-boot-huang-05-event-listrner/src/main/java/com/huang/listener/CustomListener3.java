package com.huang.listener;

import com.huang.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 不需要实现接口
 * 先声明Component，需要被加载
 * 方法上增加EventListener注解 声明这是一个监听组件  监听的事件是参数
 * */
@Component
public class CustomListener3 {
    @EventListener
    public void eventListener(CustomEvent customEvent){
        customEvent.printMessage("listener33333 监听到了");
    }
}
