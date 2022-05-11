package org.tanzu.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class SensorData {

    @Id
    private UUID id;
    private double temperature;
    private double pressure;
    private String location;

    public SensorData() {
    }

    public SensorData(UUID id, double temperature, double pressure, String location) {
        this.id = id;
        this.temperature = temperature;
        this.pressure = pressure;
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String       toString() {
        return "SensorData{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", location='" + location + '\'' +
                '}';
    }
}
