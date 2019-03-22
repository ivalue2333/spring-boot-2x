package com.iotc.boot2.logback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LogbackApplicationTests {
	Logger logger = LoggerFactory.getLogger(getClass());


	@Test
	public void contextLoads() {
		logger.trace("打印 trace");
		logger.debug("打印 debug");
		logger.info("打印 info");
		logger.warn("打印 warn");
		logger.error("打印 error");
	}

}
