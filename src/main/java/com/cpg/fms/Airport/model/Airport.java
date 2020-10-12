package com.cpg.fms.Airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
@Table(name="airport")
public class Airport {
     
	
	@Column(name="airportname")
	private String airportName;
	@Id
	@Column(name="airportcode")
	private String airportCode;
	@Column(name="airportlocation")
	private String airportLocation;
	
	
	public Airport(String airportName,String airportCode,String airportLocation) {
		this.airportName=airportName;
		this.airportCode=airportCode;
		this.airportLocation=airportLocation;
	}
	public Airport() {
		super();
	}

	public String getAirportName() {
		return airportName;
	}


	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


	public String getAirportCode() {
		return airportCode;
	}


	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}


	public String getAirportLocation() {
		return airportLocation;
	}


	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
}
