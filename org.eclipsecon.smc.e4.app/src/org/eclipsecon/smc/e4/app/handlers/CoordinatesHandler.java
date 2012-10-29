 
package org.eclipsecon.smc.e4.app.handlers;

import javax.swing.JOptionPane;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

public class CoordinatesHandler {
	@Execute
	public void execute(MWindow w) {
		String s = "X: "+w.getX() +" Y: "+w.getY()+" W:"+w.getWidth()+ " H: "+w.getHeight();
		JOptionPane.showMessageDialog(null, s);
	}
	
	@CanExecute
	public boolean canExecute(MWindow win){
		if (win!=null) return true;
		return false;
	}
		
}