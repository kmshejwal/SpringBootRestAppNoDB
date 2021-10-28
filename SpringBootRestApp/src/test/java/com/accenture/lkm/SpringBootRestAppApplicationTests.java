package com.accenture.lkm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.logging.Logger;

@SpringBootTest
class SpringBootRestAppApplicationTests {

	Logger logger= Logger.getLogger("SpringBootRestAppApplicationTests");
	
	@Test
	void contextLoads() {
		logger.info("in contextLoads() test method");
	}

}
