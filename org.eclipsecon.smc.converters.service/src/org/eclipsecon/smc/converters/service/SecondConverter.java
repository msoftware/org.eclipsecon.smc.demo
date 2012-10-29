package org.eclipsecon.smc.converters.service;

import java.math.BigDecimal;

import org.eclipsecon.smc.emergency.service.IConverterService;

import secondconverter.TemperatureConversions;
import secondconverter.TemperatureConversionsSoapType;

public class SecondConverter implements IConverterService{

	private TemperatureConversionsSoapType soap;
	
	public SecondConverter(){
		soap = new TemperatureConversions().getTemperatureConversionsSoap();
//		soap.fahrenheitToCelcius(new BigDecimal(32));
	}
	
	@Override
	public double convertToFahrenheit(double celsius) {
		System.err.println("CONVERTING FROM http://daehosting.com");
		return soap.celciusToFahrenheit(new BigDecimal(celsius)).doubleValue();
	}
	
	

}
