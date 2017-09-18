package com.jcalc.pkg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class FXMLController {

	@FXML
	private TextField output;

	// ActionEvent event
	@FXML
	protected void addValueToEqString() {
		output.setText("1");
		System.out.println("1");
	}

	public FXMLController() {

	}
}