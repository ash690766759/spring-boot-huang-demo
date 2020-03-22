package com.huang.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealth implements HealthIndicator {
    @Override
    public Health health() {
        int errorCode = 1;
        if (errorCode != 0){
            //返回不健康指标——code值
            return Health.down().withDetail("ErrorCode",errorCode).build();
        }
        //返回健康指标
        return Health.up().build();
    }
}
