package com.hbadri.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hbadri.dto.LocationDto;
import com.hbadri.services.LocationService;

@RestController
@RequestMapping("/api")
public class LocationsResource {

	@Autowired
	private LocationService locationService;
	
	
	@GetMapping("/locations")
	public ResponseEntity<List<LocationDto>> getLocations() {
		return ResponseEntity.ok(locationService.getLocations());
	}
	
	@PostMapping("/locations")
	public void saveLocations(@RequestBody List<LocationDto> locations) {
		locationService.save(locations);
	}
}
