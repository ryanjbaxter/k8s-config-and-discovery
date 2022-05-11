package org.tanzu.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ryan Baxter
 */
@Service
public class LocationService {

	private final RestTemplate rest;

	public LocationService(RestTemplate restTemplate) {
		this.rest = restTemplate;
	}

	public String getLocation() {
		return rest.getForObject("http://spring-sensors-location-service", String.class);
	}
}
