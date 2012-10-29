package org.eclipsecon.smc.emergency.service.finder;

import implementors.AmbulanceEmergencyService;
import implementors.FirefighterEmergencyService;
import implementors.PoliceEmergencyService;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class ServiceFinder extends ContextFunction{

	@Override
	public Object compute(IEclipseContext context) {
		
		String emergencyString = (String) context.get("emergency");
		if (emergencyString==null) return null;
		
		if (emergencyString.contains("robbery")){
			System.err.println("Calling PoliceEmergencyService.dispatch()");
		return ContextInjectionFactory.make(PoliceEmergencyService.class, context);
		}
		else if (emergencyString.contains("fire")){
			System.err.println("Calling FirefighterEmergencyService.dispatch().");
		return ContextInjectionFactory.make(FirefighterEmergencyService.class, context);
		}
		else if (emergencyString.contains("accident")){
			System.err.println("Calling AmbulanceEmergencyService.dispatch()");
		return ContextInjectionFactory.make(AmbulanceEmergencyService.class, context);
		}
		
		System.err.println("Not understood. Sending a police car to check!");
		return ContextInjectionFactory.make(PoliceEmergencyService.class, context);
	}

}
