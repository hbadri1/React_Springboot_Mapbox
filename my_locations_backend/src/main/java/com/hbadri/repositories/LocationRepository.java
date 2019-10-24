package com.hbadri.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hbadri.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{
	
}
