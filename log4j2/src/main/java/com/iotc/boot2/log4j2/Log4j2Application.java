package com.iotc.boot2.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用spring initializer ，勾选 core(lombok), web(web) 实现路由功能,
// 引入log4j2需要自己加一下pom依赖，注意去掉自动引入的spring-boot-starter-logging这个日志模块
@SpringBootApplication
public class Log4j2Application {

	private static final Logger logger = LogManager.getLogger(Log4j2Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Log4j2Application.class, args);
		logger.trace("输出trace");
		logger.debug("输出debug");
		logger.info("输出info");
		logger.warn("输出warn");
		logger.error("输出error");
	}

}
