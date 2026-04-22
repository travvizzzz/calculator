package com.example.demo.acceptance;


import static org.junit.Assert.assertEquals;

import java.net.URI;

import org.springframework.web.client.RestTemplate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions
{
    private String server = System.getProperty("calculator.url", "http://localhost:8080"); // default
    private RestTemplate restTemplate = new RestTemplate();
    private Double a;
    private Double b;
    private String result;

    @Given("^I have two numbers: (.*) and (.*)$")
    public void i_have_two_numbers(Double a, Double b) 
    {
        this.a = a;
        this.b = b;
    }

    @When("^the calculator sums them$")
    public void the_calculator_sums_them() throws Exception 
    {
        // validate URL
        if (server == null || server.isEmpty()) {
            throw new IllegalArgumentException("System property 'calculator.url' is not set");
        }

        String urlString = String.format("%s/calculator/add?a=%s&b=%s", server, a, b);
        URI uri = new URI(urlString); // ensures URL is absolute
        result = restTemplate.getForObject(uri, String.class);
    }

    @Then("^I receive (.*) as a result$")
    public void i_receive_as_a_result(String expectedResult) 
    {
        assertEquals(expectedResult, result);
    }
}
