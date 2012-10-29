package org.eclipsecon.smc.e4.app.parts;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipsecon.smc.emergency.service.IConverterService;

public class ThirdPart {
	
	private TextField textField;
	private Button translateButton;

	@PostConstruct
	public void pc(BorderPane p, final IEclipseContext context){
		textField = new TextField();
		textField.setPromptText("Enter celsius here");
		translateButton = new Button("Convert to Fahrenheit");
		translateButton.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				context.set("celsius", Double.valueOf(textField.getText()));
				
			}
		});
		
		p.setTop(textField);
		p.setCenter(translateButton);
	}
	
	@Inject
	public void convert(IConverterService service, IEclipseContext context, IEventBroker broker){
		if (service!=null) {
			Double double1 = (Double)context.get("celsius");
			if (double1!=null){
			System.out.println(service.convertToFahrenheit(double1.doubleValue())+" degrees fahrenheit");
			broker.send("converted", service.getClass().getSimpleName());
			}
			
		}
	}

}
