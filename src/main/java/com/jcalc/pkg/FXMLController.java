package com.jcalc.pkg;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class FXMLController {

	@FXML
	private TextField output;
	static String eqString = "";
	
	// Add a FXML object here, to use as a reference to the display, then print the value of
	// eqString to it.

	@FXML
	protected void addValueToEqString(MouseEvent button) {
		System.out.print(button.getSource().toString().substring(button.getSource().toString().length() - 2,
				button.getSource().toString().length() - 1));
		this.eqString += Character
				.isDigit((Character) button.getSource().toString()
						.substring(button.getSource().toString().length() - 2,
								button.getSource().toString().length() - 1)
						.toCharArray()[0])
								? button.getSource().toString().substring(button.getSource().toString().length() - 2,
										button.getSource().toString().length() - 1)
								: " " + button.getSource().toString().substring(button.getSource().toString().length() - 2,
										button.getSource().toString().length() - 1) + " ";
								
	}
	
	@FXML
	protected void addEqStringToScreen() {
	
		
	}
	
	@FXML
	protected String calculateTotal() {
		EquationStringParser eSP = new EquationStringParser(eqString);
		Double answer = eSP.parseEqToDouble();
		System.out.println("\nThe total is: " + answer);
		return "total";
	}

	@FXML
	protected void btnClicked(ActionEvent event) {
		// String s = event.getSource();
		output.setText("1");
		System.out.println("1");
	}

	public FXMLController() {

	}

	public void initalize(URL arg0, ResourceBundle arg1) {

	}
}