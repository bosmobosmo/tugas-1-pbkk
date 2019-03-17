package com.pbkk.drivers;

public class TaxiDriver implements Driver {
	
	private String name;

	@Override
	public void drive(String destination) {
		System.out.println("Passenger brought to " + destination);

	}
	
	public void Taxidriver() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
