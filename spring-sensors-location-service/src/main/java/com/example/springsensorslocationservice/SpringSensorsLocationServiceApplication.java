package com.example.springsensorslocationservice;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSensorsLocationServiceApplication {

	public static final String[] LOCATIONS = new String[]{"A Coruna", "Salamanca", "Las Palmas", "San Sebastian", "Alicante",
			"Palma de Mallorca", "Zaragoza", "Cordoba", "Malaga", "Bilbao", "Granada", "Valencia", "Seville", "Madrid", "Barcelona"};
	private static final Random r = new Random();

	public static void main(String[] args) {
		SpringApplication.run(SpringSensorsLocationServiceApplication.class, args);
	}

	@GetMapping
	public String getLocation() {
		return LOCATIONS[r.ints(0, LOCATIONS.length).limit(1).findFirst().getAsInt()];
	}

}
