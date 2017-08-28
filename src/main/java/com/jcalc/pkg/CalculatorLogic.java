package com.jcalc.pkg;

import java.util.Scanner;

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
		System.out.println("the answer is: " + addTwoIntegers(firstNum, secondNum));
	}

	public static int addTwoIntegers(int firstNum, int secondNum) {
		return firstNum + secondNum;
	}

}
