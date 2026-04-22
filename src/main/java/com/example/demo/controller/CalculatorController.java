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

	
<<<<<<< HEAD
	@GetMapping("/sum")
	public double add(@RequestParam double a, @RequestParam double b)
=======
	@GetMapping("/add")
	public double add(@RequestParam int a, @RequestParam int b)
>>>>>>> 1ad0304 (update file)
	{
		return calculatorService.add(a,b);
	}
	
	
	
}
