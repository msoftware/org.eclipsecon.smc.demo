package org.eclipsecon.smc.converter.service.finder;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.InjectionException;
import org.eclipsecon.smc.converters.service.FirstConverter;
import org.eclipsecon.smc.converters.service.LocalConverter;
import org.eclipsecon.smc.converters.service.SecondConverter;
import org.eclipsecon.smc.emergency.service.IConverterService;

public class ConverterFinder extends ContextFunction {

	public static int count=0;
	
	@Override
	public Object compute(IEclipseContext context) {
		Double c = (Double) context.get("celsius");
		if (++count%2==0){
			IConverterService make = null;
			try {
				make = ContextInjectionFactory.make(FirstConverter.class, context);
				return make;
			} catch (InjectionException e) {
				try {
				make = ContextInjectionFactory.make(SecondConverter.class, context);
				make.convertToFahrenheit(5.00);
				}
				catch (Exception e2){
					return ContextInjectionFactory.make(LocalConverter.class, context);
				}
			}
			
			return make;
		}
		else{
			return ContextInjectionFactory.make(SecondConverter.class, context);
		}
//		System.err.println(c.intValue());;
	}

}
