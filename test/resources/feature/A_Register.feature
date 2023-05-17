Feature: NopCommerce Registration Page
 Background:
   Given User able to open Browser
   And Enter an Url


    Scenario:Register Link


      When User click on Register link
      And User on Register Page and Verify Register page Title
      Then User enter Firstname and Lastname and Email and Password and ConfirmPassword and click on Register button
      Then User is on Home Page and Verify Home page Title
      And User close the browse
