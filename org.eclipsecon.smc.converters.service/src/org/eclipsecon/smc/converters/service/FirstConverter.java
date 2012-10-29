package org.eclipsecon.smc.converters.service;

import javax.annotation.PostConstruct;

import org.eclipsecon.smc.emergency.service.IConverterService;

import firstconverter.ConvertTemp;
import firstconverter.ConvertTemperature;
import firstconverter.ConvertTemperatureSoap;
import firstconverter.TemperatureUnit;

public class FirstConverter implements IConverterService {

	private ConvertTemperatureSoap convertTemperatureSoap;

	public FirstConverter() throws Exception{
			convertTemperatureSoap = new ConvertTemperature().getConvertTemperatureSoap();
	}
	
	@Override
	public double convertToFahrenheit(double celsius) {
		System.err.println("CONVERTING FROM http://www.webserviceX.NET/");
		double convertTemp = 0;
		convertTemp = convertTemperatureSoap.convertTemp(celsius, TemperatureUnit.DEGREE_CELSIUS, TemperatureUnit.DEGREE_FAHRENHEIT);
		return convertTemp;
	}

}
