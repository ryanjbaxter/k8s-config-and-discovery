package org.tanzu.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.cloud.kubernetes.enabled=false"})
class SensorsSensorApplicationTests {

	@Test
	void contextLoads() {
	}

}
