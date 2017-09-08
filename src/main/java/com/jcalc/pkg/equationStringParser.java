package com.jcalc.pkg;

public class equationStringParser {
	private String eqString;

	public equationStringParser(String equationString) {
		this.eqString = equationString;
	}

	// this is called hacked together code. It works but it's not pretty.
	public double parseEqToDouble(String eqString) {
		double finalTotal = 0.00d;
		double currentTotal = 0.0d;
		String currentCalc = "";
		String firstNum = null;
		String operator = null;
		String secondNum = null;
		for (int i = 0; i < eqString.length(); i++) {
			boolean firstNumberFound = false;
			while (!firstNumberFound && !Character.isDigit(i)) {
				continue;
			}
			if (firstNum == null) {
				firstNum = eqString.substring(i, i + 1);
			} else if (secondNum == null) {
				secondNum = eqString.substring(i, i + 1);
			} else if (operator == null) {
				operator = eqString.substring(i,i +1);
			} else {
				currentTotal = returnCurrentCalculation(firstNum, operator, secondNum);
				firstNum = null;
				secondNum = null;
				operator = null;
			}
		}

		// for(char c : eqString.toCharArray()) {
		// while(!c.isNumeri)
		//
		// if(c == '*') {
		//
		// }
		//
		// }

		return 0.0d;
	}

	private static double returnCurrentCalculation(String firstNum, String operator, String secondNum) {
		double currentAnswer = 0.0d;
		double firstNumAsDouble = Double.parseDouble(firstNum);
		double secondNumAsDouble = Double.parseDouble(secondNum);
		if(operator.equalsIgnoreCase("*")) {
			currentAnswer = firstNumAsDouble * secondNumAsDouble; 
		} else if (operator.equalsIgnoreCase("-")) {
			currentAnswer = firstNumAsDouble - secondNumAsDouble;
		} else if (operator.equalsIgnoreCase("+")) {
			currentAnswer = firstNumAsDouble + secondNumAsDouble;
		} else if (operator.equalsIgnoreCase("/")) {
			currentAnswer = firstNumAsDouble / secondNumAsDouble;
		}
		return currentAnswer;
	}
}
