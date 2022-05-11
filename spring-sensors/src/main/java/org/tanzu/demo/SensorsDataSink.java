package org.tanzu.demo;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SensorsDataSink {

    private final Logger log = LoggerFactory.getLogger(SensorsDataSink.class);

    private final SensorRepository sensorRepository;

    public SensorsDataSink(final SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @Bean
    public Consumer<SensorData> receiveSensorData() {
        return sensorData -> {
            log.info("Received sensor data: {}", sensorData);
            sensorRepository.save(sensorData);
        };
    }

}
