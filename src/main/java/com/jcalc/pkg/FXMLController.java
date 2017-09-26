package com.jcalc.pkg;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

// needs refactoring to use MVC (right now it's (MC)V)
public class FXMLController {

	@FXML
	private TextField output;
	static String eqString = "";

	@FXML
	protected void addValueToEqString(MouseEvent button) {
		if (String
				.valueOf(button.getSource().toString()
						.substring(button.getSource().toString().length() - 2,
								button.getSource().toString().length() - 1)
						.toCharArray()[0])
				.equals(".") && !eqString.endsWith(".")) {
			FXMLController.eqString += ".";
		} else {
			FXMLController.eqString += Character
					.isDigit((Character) button.getSource().toString()
							.substring(button.getSource().toString().length() - 2,
									button.getSource().toString().length() - 1)
							.toCharArray()[0])
									? button.getSource().toString().substring(
											button.getSource().toString().length() - 2,
											button.getSource().toString().length() - 1)
									: " " + button.getSource().toString().substring(
											button.getSource().toString().length() - 2,
											button.getSource().toString().length() - 1) + " ";
		}
		output.setText(
				Character.isDigit((Character) button.getSource().toString()
						.substring(button.getSource().toString().length() - 2,
								button.getSource().toString().length() - 1)
						.toCharArray()[0]) ? output.getText()
								+ button.getSource().toString().substring(button.getSource().toString().length() - 2,
										button.getSource().toString().length() - 1)
								: output.getText() + " "
										+ button.getSource().toString().substring(
												button.getSource().toString().length() - 2,
												button.getSource().toString().length() - 1)
										+ " ");
	}

	@FXML
	protected String calculateTotal() {
		EquationStringParser eSP = new EquationStringParser(eqString);
		Double answer = eSP.parseEqToDouble();
		System.out.println("\nThe total is: " + answer);
		output.setText(answer.toString());
		eqString = "";
		return answer.toString();
	}

	@FXML
	protected void clearDisplay() {
		output.setText("");
		eqString = "";
	}

	public void initalize(URL arg0, ResourceBundle arg1) {

	}
}