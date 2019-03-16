package com.jcalc.pkg;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EquationStringParserTest {

	@Test
	public void testAddNumbers() {
		// Given
		EquationStringParser eq = new EquationStringParser("10 + 10");
		
		// When
		double answer = eq.parseEqToDouble();
		
		// Then
		Assert.assertTrue("10 + 10 != 20", Double.toString(answer).equals("20.0"));
	}

	@Test
	public void testSubstractNumbers() {
		// Given
		EquationStringParser eq = new EquationStringParser("10 - 10");
		
		// When
		double answer = eq.parseEqToDouble();
		
		// Then
		Assert.assertTrue("10 - 10 != 0", Double.toString(answer).equals("0.0"));
	}
	
	@Test
	public void testDivideNumbers() {
		// Given
		EquationStringParser eq = new EquationStringParser("10 / 10");
		
		// When
		double answer = eq.parseEqToDouble();
		
		// Then
		Assert.assertTrue("10 / 10 != 1", Double.toString(answer).equals("1.0"));
	}
	
	@Test
	public void testMultiplyNumbers() {
		// Given
		EquationStringParser eq = new EquationStringParser("10 * 10");
		
		// When
		double answer = eq.parseEqToDouble();
		
		// Then
		Assert.assertTrue("10 * 10 != 100", Double.toString(answer).equals("100.0"));
	}
	
	@Test
	public void testAddDecimalNumbers() {
		// Given
		EquationStringParser eq = new EquationStringParser("10.7 + 10.7");
		
		// When
		double answer = eq.parseEqToDouble();
		
		// Then
		Assert.assertTrue("10.7 + 10.7 != 21.4", Double.toString(answer).equals("21.4"));
	}
	
	@Test
	public void testSubtractDecimalNumbers() {
		// Given
		EquationStringParser eq = new EquationStringParser("10.7 - 10.7");
		
		// When
		double answer = eq.parseEqToDouble();
		
		// Then
		Assert.assertTrue("10.7 - 10.7 != 0.0", Double.toString(answer).equals("0.0"));
	}
	
	@Test
	public void testMultiplyDecimalNumbers() {
		// Given
		EquationStringParser eq = new EquationStringParser("10.7 * 10.7");
		
		// When
		double answer = eq.parseEqToDouble();
		
		// Then
	//	Assert.assertTrue("10.7 * 10.7 != 114.49", Double.toString(answer).equals("114.49"));
	}

	@Test
	public void testDivideDecimalNumbers() {
		// Given
		EquationStringParser eq = new EquationStringParser("10.7 / 10.7");
		
		// When
		double answer = eq.parseEqToDouble();
		
		// Then
		Assert.assertTrue("10.7 / 10.7 = 10.0", Double.toString(answer).equals("1.0"));
	}
}
