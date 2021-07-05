package com.example.springjenkinsdemo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringJenkinsdemo1ApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsdemo1ApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test case is executed......");
		assertEquals(true,true);
	}

}
