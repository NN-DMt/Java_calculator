package com.jcalc.pkg.prototypingcode;

import java.util.Scanner;

// this class exists to show the iterations of work that were completed. in writing and rewriting this calculator.
// it exists for illustrative and reference purposes.
public class Prototype_code { 
	
	private String eqString;
	
	/*
	 * public EquationStringParser(String equationString) { this.eqString =
	 * equationString.trim(); }
	 */
	public double parseEqToDouble(String eqString) {
		double finalTotal = 0.00d;
		double currentTotal = 0.0d;
		String currentCalc = "";
		String firstNum = null;
		String operator = null;
		String secondNum = null;
		for (int i = 0; i < eqString.length(); i++) {
			// boolean firstNumberFound = false;
			/*
			 * while (!firstNumberFound && Character.isDigit(eqString.charAt(i))) {
			 * continue; }
			 */
			if (firstNum == null) {
				// firstNumberFound = true;
				firstNum = eqString.substring(i, i + 1);
			} else if (secondNum == null) {
				secondNum = eqString.substring(i, i + 1);
			} else if (operator == null) {
				operator = eqString.substring(i, i + 1);
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
		if (operator.equalsIgnoreCase("*")) {
			currentAnswer = firstNumAsDouble * secondNumAsDouble;
		} else if (operator.equalsIgnoreCase("-")) {
			currentAnswer = firstNumAsDouble - secondNumAsDouble;
		} else if (operator.equalsIgnoreCase("+")) {
			currentAnswer = firstNumAsDouble + secondNumAsDouble;
		} else if (operator.equalsIgnoreCase("/")) {
			currentAnswer = firstNumAsDouble / secondNumAsDouble;
		} else {
			System.out.println("operator not recognised, please try again");
		}
		return currentAnswer;
	}
	
/*	
	public class CalculatorLogic {

		public static int total = 0;

		// feel free to change anything written in this program,
		// I'm mostly writing template code so would change it myself anyway
		public static void main(String[] args) {
			// simple console based main for testing calculator logic
			int firstNum = 0;
			int secondNum = 0;
			try (Scanner scan = new Scanner(System.in);) {
				System.out.println("Please enter two numbers to add in the console below: ");
				firstNum = scan.nextInt();
				secondNum = scan.nextInt();
			} catch (Exception ie) {
				System.out.println("not able to get user input as int");
				return;
			}
			EquationStringParser eq = new EquationStringParser(firstNum + "+" + secondNum);
			System.out.println("the answer is: " + eq.parseEqToDouble(firstNum + "+" + secondNum));
			//System.out.println("the answer is: " + addTwoIntegers(firstNum, secondNum));
		}

		public static int addTwoIntegers(int firstNum, int secondNum) {
			return firstNum + secondNum;
		}

		public static int subtractTwoIntegers(int firstNum, int secondNum) {
			return firstNum - secondNum;
		}
		
		public static int divideTwoIntegers(int firstNum, int secondNum) {
			return firstNum / secondNum;
		}
		
		public static int multiplyTwoIntegers(int firstNum, int secondNum) {
			return firstNum * secondNum;
		}
	}*/

}
