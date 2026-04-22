package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService 
{
	@Cacheable(value = "add")
	public int add(int a, int b)
	{
		try {
			System.out.println("loading...");
			Thread.sleep(3000);
			System.out.println("...end..");
		}
		
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		return a + b;
	}
	
	
}
