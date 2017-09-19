package com.jcalc.pkg.prototypingcode;

import com.jcalc.pkg.FXMLController;

public class JavaFXPrototype {

	/* v1 */
	/*package com.jcalc.pkg;

	import javafx.application.Application;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.layout.AnchorPane;
	import javafx.scene.shape.Box;
	import javafx.scene.text.Text;
	import javafx.stage.Stage;

	public class Main extends Application {
		static int total = 0;
		static String equationString = "";
		@Override
		public void start(Stage primaryStage) {
			try {
				AnchorPane root = new AnchorPane();
				Scene scene = new Scene(root, 300, 300);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("JCalc - JavaFX calculator");
				primaryStage.setScene(scene);
				Button btn = new Button();
				btn.setText("=");
				btn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						System.out.println("The answer is: " + total); // add as total
					}
				});
				btn.setLayoutX(250);
				btn.setLayoutY(250);
				Button btn1 = new Button();
				btn1.setLayoutX(85);
				btn1.setLayoutY(85);	
				btn1.setText("1");
				btn1.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 1;
					}
				});
				Button btn2 = new Button();
				btn2.setLayoutX(115);
				btn2.setLayoutY(85);
				btn2.setText("2");
				btn2.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 2; 
					}
				});
				Button btn3 = new Button();
				btn3.setLayoutX(145);
				btn3.setLayoutY(85);
				btn3.setText("3");
				btn3.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 3;
					}
				});
				Button btn4 = new Button();
				btn4.setLayoutX(85);
				btn4.setLayoutY(115);
				btn4.setText("4");
				btn4.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 4;
					}
				});
				Button btn5 = new Button();
				btn5.setLayoutX(115);
				btn5.setLayoutY(115);
				btn5.setText("5");
				btn5.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 5;
					}
				});
				Button btn6 = new Button();
				btn6.setLayoutX(145);
				btn6.setLayoutY(115);
				btn6.setText("6");
				btn6.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 6;
					}
				});
				Button btn7 = new Button();
				btn7.setLayoutX(85);
				btn7.setLayoutY(145);
				btn7.setText("7");
				btn7.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 7;
					}
				});
				Button btn8 = new Button();
				btn8.setLayoutX(115);
				btn8.setLayoutY(145);
				btn8.setText("8");
				btn8.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 8;
					}
				});
				Button btn9 = new Button();
				btn9.setLayoutX(145);
				btn9.setLayoutY(145);
				btn9.setText("9");
				btn9.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						total += 9;
					}
				});
				Button addBtn = new Button();
				addBtn.setLayoutX(175);
				addBtn.setLayoutY(85);
				addBtn.setText("+");
				addBtn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						equationString += "+";
					}
				});
				Button minusBtn = new Button();
				minusBtn.setLayoutX(175);
				minusBtn.setLayoutY(115);
				minusBtn.setText("-");
				minusBtn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						equationString += "-";
					}
				});
				Button divideBtn = new Button();
				divideBtn.setLayoutX(175);
				divideBtn.setLayoutY(145);
				divideBtn.setText("/");
				divideBtn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						equationString += "/";
					}
				});
				Button multiplyBtn = new Button();
				multiplyBtn.setLayoutX(175);
				multiplyBtn.setLayoutY(175);
				multiplyBtn.setText("*");
				multiplyBtn.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						equationString += "*";
					}
				});
				Text calculator = new Text("JCalc - JavaFX Calculator");
				calculator.setX(50);
				calculator.setY(20);
				Box outputBox = new Box(200.0,50.0,0.0);
				outputBox.setLayoutY(50);
				outputBox.setLayoutX(100);
				root.getChildren().add(outputBox);
				root.getChildren().add(calculator);
				root.getChildren().add(btn);
				root.getChildren().add(btn1);
				root.getChildren().add(btn2);
				root.getChildren().add(btn3);
				root.getChildren().add(btn4);
				root.getChildren().add(btn5);
				root.getChildren().add(btn6);
				root.getChildren().add(btn7);
				root.getChildren().add(btn8);
				root.getChildren().add(btn9);
				root.getChildren().add(addBtn);
				root.getChildren().add(minusBtn);
				root.getChildren().add(divideBtn);
				root.getChildren().add(multiplyBtn);
				root.setStyle("-fx-background-color: #00b359");
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			launch(args);
		}
	}*/

	/*FXMLLoader loader = new FXMLLoader();
	URL locationURL = new URL("http://javafx.com/fxml/1");
	loader.setLocation(locationURL);
	loader.setController(fxmlController);
	AnchorPane root = loader.load();*/
	
	//FXMLController fxmlController = new FXMLController();
	//root.setStyle("-fx-background-color: #00b359");
	
	
}
