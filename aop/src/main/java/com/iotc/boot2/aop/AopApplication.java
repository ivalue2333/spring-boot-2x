package com.iotc.boot2.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

// 使用spring initializer ，勾选 core(lombok, aspects), web(web) 实现路由功能,
// aop功能在config中实现
@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

}
