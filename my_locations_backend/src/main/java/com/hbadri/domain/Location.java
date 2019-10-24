package com.hbadri.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.vividsolutions.jts.geom.Geometry;


@Entity
@Table
public class Location {

	@Id
	@GeneratedValue
	private Long locationId;
	
	@NotNull
	private String alias;
	
	@NotNull
	@Column(columnDefinition = "Geometry")
	private Geometry position;

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Geometry getPosition() {
		return position;
	}

	public void setPosition(Geometry position) {
		this.position = position;
	}
		
}
