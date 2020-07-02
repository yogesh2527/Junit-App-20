package com.myproject;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd_01()
	{
		Calculator c = new Calculator();
		Integer actualResult = c.add(10, 20);
		Integer expectedResult = 30;
		
		assertEquals(expectedResult, actualResult);
	}
}
