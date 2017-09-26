package com.jcalc.pkg;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


// separate model from controller using this class. Currently contains duplicated code form FXMLController.
public class CalculatorLogic {

	private static String eqString = "";
	private TextField output;
	
	public String addValuesToEqString(MouseEvent button) {
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
		return "";
	}
	
}
