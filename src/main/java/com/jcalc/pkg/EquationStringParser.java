package com.jcalc.pkg;

public class EquationStringParser {
	private String eqString;

	public EquationStringParser(String equationString) {
		this.eqString = equationString.trim();
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
	        /*while (!firstNumberFound && Character.isDigit(eqString.charAt(i))) {
				continue;
			}*/
			if (firstNum == null) {
				firstNumberFound = true;
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
			finalTotal += currentTotal;
		}
		return finalTotal;
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
