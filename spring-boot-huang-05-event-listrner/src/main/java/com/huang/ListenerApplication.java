package com.huang;

import com.huang.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ListenerApplication {

	public static void main(String[] args) {
		//获取启动后容器	加载自定义监听器
		ConfigurableApplicationContext context =SpringApplication.run(ListenerApplication.class, args);
		context.addApplicationListener(new CustomListener1());
	}

}
