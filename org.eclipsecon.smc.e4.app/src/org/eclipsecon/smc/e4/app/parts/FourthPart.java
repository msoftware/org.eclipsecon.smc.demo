package org.eclipsecon.smc.e4.app.parts;

import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.PathTransitionBuilder;
import javafx.animation.RotateTransition;
import javafx.animation.RotateTransitionBuilder;
import javafx.animation.SequentialTransition;
import javafx.animation.SequentialTransitionBuilder;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathBuilder;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipsecon.smc.emergency.service.IConverterService;
import org.eclipsecon.smc.emergency.service.IEmergencyService;

public class FourthPart {
	
	private Group root;
	private Label statusLabel;
	private Rectangle rect;
	private PathTransition pathTransition;
	private RotateTransition rotateTransition;
	private PathTransition pathTransition2;
	private SequentialTransition seqTransition;

	@PostConstruct
	public void pc(BorderPane p)
	{
		root = new Group();
		p.setCenter(root);
		p.setTop(statusLabel);
		rect = new Rectangle (0, 200, 50, 50);
		rect.setVisible(false);
        rect.setArcHeight(10);

        rect.setArcWidth(10);

        rect.setFill(Color.ORANGE);

        root.getChildren().add(rect);
        Path path = PathBuilder.create()
                .elements(
                    new MoveTo(0,200),
                    new LineTo(200, 200)
                    
                )
                .build();
        path.setStroke(Color.BLACK);
        root.getChildren().add(path);
        pathTransition = PathTransitionBuilder.create()
                .duration(Duration.seconds(0.33))
                .path(path)
                .node(rect)
                .orientation(OrientationType.ORTHOGONAL_TO_TANGENT)
                .autoReverse(true)
                .build();
        rotateTransition = RotateTransitionBuilder.create()
                .node(rect)
                .duration(Duration.seconds(0.33))
                .fromAngle(0)
                .toAngle(720)
                .autoReverse(false)
                .build();
       
	}
	
	@Inject
	public void respond(@Optional @UIEventTopic("converted") String s){
		if (s==null) return;
		int newX=400;
		int newY=0;
		Color classColor = null;
		Text text2 = new Text(IConverterService.class.getSimpleName());
		text2.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
		text2.setX(0);
		text2.setY(180);
		text2.setFill(Color.VIOLET);
		root.getChildren().add(text2);
		if (s.equals("FirstConverter")){
			newY = 100;
			classColor = Color.GREEN;
		}
		else if ((s.equals("SecondConverter"))){
			newY = 300;
			classColor = Color.RED;
		}
		else if ((s.equals("LocalConverter"))){
			newY = 200;
			classColor = Color.BLACK;
		}
		Path path2 = PathBuilder.create()
                .elements(
                	new MoveTo(200, 200),
                    new LineTo(newX, newY)
                )
                .build();
		Text text = new Text(s+".class");
		text.setFont(Font.font("Verdana", 20));
		text.setX(newX+50);
		text.setY(newY);
		text.setFill(classColor);
		root.getChildren().add(text);
		rect.setVisible(true);
        path2.setStroke(Color.GRAY);
        rect.setFill(classColor);
        root.getChildren().add(path2);
        pathTransition2 = PathTransitionBuilder.create()
                .duration(Duration.seconds(0.34))
                .path(path2)
                .node(rect)
                .orientation(OrientationType.ORTHOGONAL_TO_TANGENT)
//                .cycleCount(Timeline.INDEFINITE)
                .autoReverse(false)
                .build();
		 seqTransition = SequentialTransitionBuilder.create().children(pathTransition,rotateTransition,pathTransition2).build();
		 seqTransition.play();
	}

}
