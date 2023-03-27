Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phan1.caphg3@tekschool.us' and password 'Tek@123444'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @TestTest
  Scenario: Verify User can update Profile Information
    And User update Name 'fawadis' and Phone '9166659371'
    And User click on Update button
    Then user profile information should be updated

  @UpdatePass
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Tek@12345        | Tek@123444  | Tek@123444      |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @PaymentAdd
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1245678901244688 | Warisi     |               5 |           2029 |          865 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @EdidtCard
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0987654321014445 | Mola       |              11 |           2029 |          977 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @RemovingtheCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And User fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress    | apt | city       | state      | zipCode |
      | United States | Harris   |  9162345885 | 4449 Marconi Ave |  10 | Sacramento | California |   95821 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress    | apt | city  | state | zipCode |
      | Afghanistan | Ashraf   |  2792049955 | 3939 marconi Ave |   8 | Kabul | Kabul |   95823 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
