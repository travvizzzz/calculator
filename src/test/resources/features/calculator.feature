Feature: Calculator
  Scenario: Sum two numbers
    Given I have two numbers: 1.0 and 2.0
    When the calculator sums them
    Then I receive 3.0 as a result