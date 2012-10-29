package org.eclipsecon.smc.converters.service;

import org.eclipsecon.smc.emergency.service.IConverterService;

public class LocalConverter implements IConverterService {

	@Override
	public double convertToFahrenheit(double celsius) {
		
		System.err.println("CONVERTING LOCALLY");
		return (celsius*9)/5 +32;
	}

}
