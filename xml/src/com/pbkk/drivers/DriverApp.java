package com.pbkk.drivers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Driver.xml");
		Driver driver1 = context.getBean("truckDriver", Driver.class);
		Driver driver2 = context.getBean("taxiDriver", Driver.class);
		
		driver1.drive("Surabaya");
		driver2.drive("Tunjungan");
		
		context.close();
	}

	
}
