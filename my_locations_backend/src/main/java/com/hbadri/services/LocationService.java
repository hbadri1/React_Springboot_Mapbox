package com.hbadri.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbadri.domain.Location;
import com.hbadri.dto.LocationDto;
import com.hbadri.repositories.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepo;
	
	private ModelMapper mapper = new ModelMapper();
	
	/**
	 * Get all locations in db
	 * @return list of LocationDto
	 */
	public List<LocationDto> getLocations(){
		return locationRepo.findAll()
				.stream().map(location -> mapper.map(location, LocationDto.class)).collect(Collectors.toList());
				
	}

	/**
	 * Save list of locations in db
	 * @param locations list to be saved
	 * @throws ParseException 
	 */
	public void save(List<LocationDto> locationDtos) {
		//This is just an approch to manage all my location together. Business requirements may change
		//to edit, save or delete one by one of locations
		locationRepo.deleteAll();
		
		List<Location> locations = locationDtos.stream()
				.map(locationDto -> mapper.map(locationDto, Location.class))
				.collect(Collectors.toList());
		
		locationRepo.saveAll(locations);
	}
}
