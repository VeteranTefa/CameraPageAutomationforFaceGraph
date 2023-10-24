Feature: Test the login functionality
  Scenario: Validate with valid username and password
    Given user should exist in website and registered
    When user fill username and password
    Then Login is successfully and navigate to home page










