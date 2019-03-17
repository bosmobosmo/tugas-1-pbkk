package com.pbkk.drivers;

import org.springframework.stereotype.Component;

@Component("taxiDriver")
public class TaxiDriver implements Driver {
	
	private String name;

	@Override
	public void drive(String destination) {
		System.out.println("Passenger brought to " + destination);

	}
	
	public TaxiDriver() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
