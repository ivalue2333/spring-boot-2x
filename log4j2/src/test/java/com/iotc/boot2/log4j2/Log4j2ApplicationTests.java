package com.iotc.boot2.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Log4j2ApplicationTests {

	private static final Logger logger = LogManager.getLogger(Log4j2ApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.trace("输出trace");
		logger.debug("输出debug");
		logger.info("输出info");
		logger.warn("输出warn");
		logger.error("输出error");
	}

}
