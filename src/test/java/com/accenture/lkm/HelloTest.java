package com.accenture.lkm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class HelloTest {

	Logger logger= Logger.getLogger("HelloTest..");
	
	@BeforeEach
	void setUp() throws Exception {
		logger.info("start test method...");
	}

	@AfterEach
	void tearDown() throws Exception {
		logger.info("end test method..");
	}

	@Test
	void test() {
		logger.info("inside test() test method..");
		assertTrue(true);
	}

	@Test
	void test2() {
		logger.info("inside test2() test method..");
		assertFalse(false);
	}
}
