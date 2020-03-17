package com.huang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.huang.tkmapper")
public class TkMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TkMyBatisApplication.class, args);
	}

}
