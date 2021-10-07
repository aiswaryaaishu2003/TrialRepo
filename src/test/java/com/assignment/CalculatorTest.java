package com.assignment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.assigment.Calculator;
import com.assigment.StringManipulation;
public class CalculatorTest {
	//@Before
	Calculator calculate = new Calculator();
	StringManipulation manipulate = new StringManipulation();
	
	@Test
	public void testaddSum() {
		Assert.assertEquals(10,calculate.addSum(7,3));
	}
	
	@Test
	public void testisEven() {
		Assert.assertTrue(calculate.isEven(4));
	}
	
	
	@Test
	
	public void vowelCount() {
	Assert.assertEquals(2, manipulate.vowelCount("vowel"));
		
	}
	@Test
	public void testcharacterCount() {
		Assert.assertEquals(14, manipulate.characterCount("It should be good"));
	}


}