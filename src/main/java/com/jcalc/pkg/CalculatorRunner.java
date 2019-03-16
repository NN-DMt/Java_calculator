package com.jcalc.pkg;

import java.util.Scanner;

public class CalculatorRunner {

	public static int total = 0;

	public static void main(String[] args) {
		// simple console based main for testing calculator logic
		String inputEquation = "";		
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("Please enter an equation to calculate in the console below: ");
			inputEquation = scan.nextLine();
		} catch (Exception ie) {
			System.out.println("not able to get user input. Restart and try again.");
			return;
		}
		EquationStringParser eq = new EquationStringParser(inputEquation);
		System.out.println("the answer is: " + eq.parseEqToDouble());
	}
}
