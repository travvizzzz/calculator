package com.example.demo.acceptance;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.demo.CalculatorProjectApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = CalculatorProjectApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CucumberSpringConfiguration 
{
	
}