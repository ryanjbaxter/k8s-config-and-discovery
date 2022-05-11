package org.tanzu.demo;

import java.util.UUID;

public class SensorData {

    private final UUID id;
    private final double temperature;
    private final double pressure;
    private final String location;

    public SensorData(UUID id, double temperature, double pressure, String location) {
        this.id = id;
        this.temperature = temperature;
        this.pressure = pressure;
        this.location = location;
    }

    public static SensorData generate(UUID id, String location) {
        return new SensorData(id, generateTemperature(), generatePressure(), location);
    }

    private static double generateTemperature() {
        return Math.random() * 100;
    }

    private static double generatePressure() {
        return Math.random() * 100;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "id=" + id +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", location='" + location + '\'' +
                '}';
    }

    // The getters are required for the JSON serialization
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
}
