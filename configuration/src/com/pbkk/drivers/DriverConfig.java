package com.pbkk.drivers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DriverConfig {
	
	@Bean
	public Driver truckDriver() {
		TruckDriver driver1 = new TruckDriver();
		
		return driver1;
	}
	
	@Bean
	public Driver taxiDriver() {
		TaxiDriver driver2 = new TaxiDriver();
		
		return driver2;
	}

}
