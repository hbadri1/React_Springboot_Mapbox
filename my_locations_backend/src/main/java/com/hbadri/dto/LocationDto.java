package com.hbadri.dto;

import javax.validation.constraints.NotNull;

import com.bedatadriven.jackson.datatype.jts.serialization.GeometryDeserializer;
import com.bedatadriven.jackson.datatype.jts.serialization.GeometrySerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vividsolutions.jts.geom.Geometry;


public class LocationDto {
	@NotNull
	private String alias;
	
	@NotNull
	@JsonSerialize(using = GeometrySerializer.class)
	@JsonDeserialize(contentUsing = GeometryDeserializer.class)
	private Geometry position;

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
