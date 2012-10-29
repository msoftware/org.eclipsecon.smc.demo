package implementors;

import org.eclipsecon.smc.emergency.service.IEmergencyService;

public class AmbulanceEmergencyService implements IEmergencyService{

	@Override
	public void dispatch() {
		System.out.println("Ambulance dispatched");
		
	}

}
