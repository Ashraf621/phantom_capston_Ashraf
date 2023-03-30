Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @smokeTest @Regration
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'phan1.caphg3@tekschool.us' and password 'Tek@12345678'
    And User click on login button
    Then User should be logged in into Account

  @dryRun1 @Regration
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                      | password   | confrimPassword |
      | phanton | phos12.caphg3@tekschool.us | Tek@123455 | Tek@123455      |
    And User click on SignUp button
    Then User should be logged into account page
