package com.iotc.boot2.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用spring initializer ，勾选 core(lombok), web(web) 实现路由功能,
// logback是默认使用的
@SpringBootApplication
public class LogbackApplication {


	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LogbackApplication.class);
		SpringApplication.run(LogbackApplication.class, args);
		logger.trace("打印 trace");
		logger.debug("打印 debug");
		logger.info("打印 info");
		logger.warn("打印 warn");
		logger.error("打印 error");
	}

}
