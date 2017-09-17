package com.jcalc.pkg;

public class EquationStringParser {
	private String eqString;
	private String[] eqTokens;
	
	public EquationStringParser(String equationString) {
		this.eqString = equationString.trim();
		this.eqTokens = eqString.split(" ");
	}
	
	public EquationStringParser(String[] equationTokens) {
		this.eqTokens = equationTokens;
	}

	public double parseEqToDouble() {
			double firstNum = 0.0d;
			double secondNum = 0.0d;
			double finalTotal = 0.0d;
			double currentTotal = 0.0d;
			String operator = null;
			for(String s : eqTokens) {
				if (firstNum == 0.0d) {
					firstNum = Double.parseDouble(s);
				} else if (operator == null) {
					operator = s;
				} else if (secondNum == 0.0d) {
					secondNum = Double.parseDouble(s);
				} else {
					currentTotal = returnCurrentCalculation(firstNum, operator, secondNum);
					firstNum = 0.0d;
					secondNum = 0.0d;
					operator = null;
					finalTotal += currentTotal;
				}
			}
		return finalTotal;
	}

	private static double returnCurrentCalculation(Double firstNum, String operator, Double secondNum) {
		double currentAnswer = 0.0d;
		if(operator.equalsIgnoreCase("*")) {
			currentAnswer = firstNum * secondNum; 
		} else if (operator.equalsIgnoreCase("-")) {
			currentAnswer = firstNum - secondNum;
		} else if (operator.equalsIgnoreCase("+")) {
			currentAnswer = firstNum + secondNum;
		} else if (operator.equalsIgnoreCase("/")) {
			currentAnswer = firstNum / secondNum;
		} else {
			System.out.println("operator not recognised, please try again");
		}
		return currentAnswer;
	}
}
