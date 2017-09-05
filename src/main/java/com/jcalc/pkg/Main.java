package com.jcalc.pkg;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		int total = 0;
		try {
			AnchorPane root = new AnchorPane();
			Scene scene = new Scene(root, 300, 300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Text calculator = new Text("JCalc - JavaFX Calculator");
			calculator.setX(50);
			calculator.setY(50);
			root.getChildren().add(calculator);
			primaryStage.setTitle("JCalc - JavaFX calculator");
			primaryStage.setScene(scene);
			Button btn = new Button();
			btn.setText("=");
			btn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					System.out.println("The answer is: " + 1); // add as total
				}
			});
			btn.setLayoutX(250);
			btn.setLayoutY(250);
			Button btn1 = new Button();
			btn1.setLayoutX(55);
			btn1.setLayoutY(55);	
			btn1.setText("1");
			btn1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// total += 1; not able to use due to scope issues
				}
			});
			Button btn2 = new Button();
			btn2.setLayoutX(95);
			btn2.setLayoutY(55);	
			btn2.setText("2");
			btn2.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// total += 1; not able to use due to scope issues
				}
			});
			root.getChildren().add(btn);
			root.getChildren().add(btn1);
			root.getChildren().add(btn2);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
