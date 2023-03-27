Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @smokeTest
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'phan1.caphg3@tekschool.us' and password 'Tek@123444'
    And User click on login button
    Then User should be logged in into Account
    
      @tc001
  Scenario: Verify user can sign in into Retail Application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account
    
    Examples: 
    | email                         | password|
    | phantom.test@gmail.com        |Tek@12345|
    | ashraf1@gmail.com             |Tek@9999|
    | ashraf2@gmail.com             |Tek@8888|
    | ashraf3@gmail.com             |Tek@7777|
   

  @dryRun1 @Regression @registerAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                        | password  | confrimPassword |
      | phantom | phan322.caphg3@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
