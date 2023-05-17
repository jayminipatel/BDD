Feature: NopCommerce Login
  Background:
  Given User able to Open browser
    And Enter an url


  Scenario: Nopcommerce Valid Login Test

    When User click on Login Link
    And User on Login Page and Verify Login page Title
    Then User enter Email and password and click on login button
    And User Close the browser
