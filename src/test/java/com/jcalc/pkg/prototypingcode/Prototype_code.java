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
	
	/* V2 */
	
/*	
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
	}*/	
	
	/* V3 */
	
/*	package com.jcalc.pkg;

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
				boolean first = true;
				String operator = null;
				for(String s : eqTokens) {
					if (firstNum == 0.0d) {
						firstNum = Double.parseDouble(s);
					} else if (operator == null) {
						operator = s;
					} else if (secondNum == 0.0d) {
						secondNum = Double.parseDouble(s);
					}
					if(firstNum != 0.0d && secondNum != 0.0d && operator != null){
						if(first) {
							currentTotal = returnCurrentCalculation(firstNum, operator, secondNum);
						} else {
							currentTotal = returnCurrentCalc(firstNum, operator, secondNum);
						}
						first = false;
						firstNum = secondNum;
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
		
		private static double returnCurrentCalc(Double firstNum, String operator, Double secondNum) {
			double currentAnswer = 0.0d;
			if(operator.equalsIgnoreCase("*")) {
				currentAnswer *= secondNum; 
			} else if (operator.equalsIgnoreCase("-")) {
				currentAnswer -= secondNum;
			} else if (operator.equalsIgnoreCase("+")) {
				currentAnswer += secondNum;
			} else if (operator.equalsIgnoreCase("/")) {
				currentAnswer /= secondNum;
			} else {
				System.out.println("operator not recognised, please try again");
			}
			return currentAnswer;
		}
}*/
		
	// from calculator logic class
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
	
	public static int squareNumber(int firstNum) {
		return firstNum * firstNum;
	}
	
	public static int squareRootTwoIntegers(int firstNum, int secondNum) {
		// work on logic for this. Not sure how to just yet.
		return firstNum / secondNum;
	}
	
	
	
	
}
