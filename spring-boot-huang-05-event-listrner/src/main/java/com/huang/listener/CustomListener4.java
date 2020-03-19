package com.huang.listener;

import com.huang.event.CustomEvent;
import org.springframework.context.ApplicationListener;

public class CustomListener4 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("listener44444 监听到");
    }
}
