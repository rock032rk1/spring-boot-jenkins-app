package com.springboot.jenkins.testing.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsTestingAppApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(SpringBootJenkinsTestingAppApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case execution.....");
		assertEquals(true, true);
	}

}
