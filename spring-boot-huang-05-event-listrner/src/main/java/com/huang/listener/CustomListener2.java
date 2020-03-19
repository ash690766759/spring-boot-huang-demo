package com.huang.listener;

import com.huang.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 通过Component声明这是一个需要加载的监听器*/
@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("lisener22222 监听到");
    }
}
