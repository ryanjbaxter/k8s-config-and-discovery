package org.tanzu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SensorsSensorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SensorsSensorApplication.class, args);
    }
}

@Configuration
class MyConfiguration {

    @Bean
    RestTemplate sensorsRestTemplate() {
        return new RestTemplate();
    }
}
