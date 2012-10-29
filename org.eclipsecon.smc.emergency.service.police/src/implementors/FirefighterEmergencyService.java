package implementors;

import org.eclipsecon.smc.emergency.service.IEmergencyService;

public class FirefighterEmergencyService implements IEmergencyService {

	@Override
	public void dispatch() {
		System.out.println("Firefighters dispatched");
	}

}
