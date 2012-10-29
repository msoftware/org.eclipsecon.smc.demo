package org.eclipsecon.smc.e4.app.parts;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipsecon.smc.emergency.service.IEmergencyService;

public class FirstPart {

	
	private TextField t;

	private IEventBroker broker;

	private Button button;
	
	
	
	@PostConstruct
	public void pc(BorderPane p, final IEclipseContext context,IEventBroker broker){
		t = new TextField();
		t.setPromptText("Write your emergency here");
		button = new Button("DISPATCH NOW!");
		button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				context.set("emergency", t.getText());
				
			}
		});
		p.setTop(t);
		p.setCenter(button);
		this.broker = broker;
	}
	
	@Focus
	public void focus(IEmergencyService service){
		t.requestFocus();
	}
	
	@Inject
	public void callReceived(IEmergencyService service){
		if (service!=null){
		service.dispatch();
		broker.post("dispatched",service.getClass().getSimpleName());//makes the fancy FX animations
		}
	}

}


