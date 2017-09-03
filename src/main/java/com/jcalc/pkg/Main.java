package com.jcalc.pkg;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Pair;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Text calculator = new Text("Write a calculator here");
			calculator.setX(50);
			calculator.setY(50);
			root.getChildren().add(calculator);
			primaryStage.setTitle("JCalc - Java FX calculator");
			primaryStage.setScene(scene);
			Button equalsButton = new Button();			
			equalsButton.setLayoutY(200);
			equalsButton.setLayoutY(200);
			root.getChildren().add(equalsButton);
			
			  Button btn = new Button();
			    btn.setText("'Hello World'");
			    btn.setOnAction(new EventHandler<ActionEvent>() {

			        @Override
			        public void handle(ActionEvent event) {
			            System.out.println("Hello World!");
			        }
			    });
			
			    btn.setLayoutX(250);
			    btn.setLayoutY(220);
			    root.getChildren().add(btn);
			  //  primaryStage.setScene(new Scene(root, 300, 250));
			    primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
