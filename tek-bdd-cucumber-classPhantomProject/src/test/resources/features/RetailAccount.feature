Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phan1.caphg3@tekschool.us' and password 'Tek@12345678'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @TestTest @Regration
  Scenario: Verify User can update Profile Information
    And User update Name 'fawa' and Phone '9266659371'
    And User click on Update button
    Then user profile information should be updated

  # @UpdatePass
  # Scenario: Verify User can Update password
  # And User enter below information
  #  | previousPassword | newPassword  | confirmPassword |
  #   | Tek@1234567      | Tek@12345678 | Tek@12345678    |
  #And User click on Change Password button
  #Then a message Will be displayed 'Password Updated Successfully'
  @AddPayment @Regration
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 6611341158041779 | Waris      |               5 |           2025 |          835 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @EdidtCard @Regration
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1187657711033345 | Mola       |              11 |           2029 |          977 |
    And user click on Update Your Card button
    Then a message will be displayed 'Payment Method updated Successfully'

  @RemovingtheCard @Regration
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress @Regration
  Scenario: Verify User can add an Address
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress    | apt | city       | state      | zipCode |
      | United States | Harraasw |  9162345886 | 4168 Marconi Ave |  10 | Sacramento | California |   95821 |
    And User click Add Your Address button
    Then a message will is be displayed 'Address Added Successfully'

  @EditAddress @Regration
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress    | apt | city  | state | zipCode |
      | Afghanistan | Ashra    |  2792049955 | 3219 marconi Ave |   8 | Kabul | Kabul |   95823 |
    And User click update Your Address button
    Then a message will should be displayed 'Address Updated Successfully'

  @RemoveAddress @Regration
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
