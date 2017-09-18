package com.jcalc.pkg;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	static int total = 0;
	static String equationString = "";
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLController fxmlController = new FXMLController();
			/*FXMLLoader loader = new FXMLLoader();
			URL locationURL = new URL("http://javafx.com/fxml/1");
			loader.setLocation(locationURL);
			loader.setController(fxmlController);
			AnchorPane root = loader.load();*/
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("JCalc.fxml"));
			Scene scene = new Scene(root, 330, 350);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("JCalc - JavaFX calculator");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			//root.setStyle("-fx-background-color: #00b359");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
