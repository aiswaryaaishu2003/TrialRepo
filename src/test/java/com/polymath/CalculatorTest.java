package com.polymath;
import static org.junit.Assert.*;
import  org.junit.Assert;
import  org.junit.Before;
import  org.junit.Test;

import com.ploymath.Calculator;

public class CalculatorTest {
	Calculator calservice;
	
	@Before
	public void setup() {
		calservice=new Calculator();
	}
	@Test
	public void testAdd() {
		Assert.assertEquals(10,calservice.add(7,3));
	}
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		calservice.divide(10,0);
	}
}
