package implementors;

import org.eclipsecon.smc.emergency.service.IEmergencyService;

public class PoliceEmergencyService implements IEmergencyService {

	@Override
	public void dispatch() {
		System.out.println("Dispatching police car");
	}

}
