 
package org.eclipsecon.smc.e4.app.handlers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class TogglePerspective {
	
	@PostConstruct
	public void pc(){
		
	}
	
	
	
	@Execute
	@Optional
	public void execute(MWindow win, EPartService partService) {
		MPerspectiveStack ps = (MPerspectiveStack) win.getChildren().get(0);
		MPerspective selected = ps.getSelectedElement();
		List<MPerspective> children = ps.getChildren();
		for (MPerspective mPerspective : children) {
			if (!mPerspective.equals(selected)){
			partService.switchPerspective(mPerspective);
			return;
			}
		}

	}
		
}