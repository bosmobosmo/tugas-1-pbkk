package com.pbkk.drivers;

import org.springframework.stereotype.Component;

@Component("truckDriver")
public class TruckDriver implements Driver{
	
	private String name;
	
	
	public void drive(String destination) {
		System.out.println("Load delivered to " + destination);
	}

	public TruckDriver() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
