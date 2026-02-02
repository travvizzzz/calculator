package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.demo.service.CalculatorService;

public class CalculatorServiceTest 
{
	private final CalculatorService calculatorService = new CalculatorService();
	
	@Test
	void testAdd()
	{
		assertEquals(8, calculatorService.add(3,5));
	}
}
