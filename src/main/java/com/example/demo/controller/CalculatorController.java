package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CalculatorService;

@RestController
@RequestMapping("/api")
public class CalculatorController 
{
	@Autowired
	private CalculatorService calculatorService;

	
	@GetMapping("/add")
	public double add(@RequestParam int a, @RequestParam int b)
	{
		return calculatorService.add(a,b);
	}
	
	
	
}
