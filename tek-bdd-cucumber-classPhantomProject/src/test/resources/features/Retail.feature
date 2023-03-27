Feature: Retail Page applicaiton

  @test
  Scenario: Verify user can search a product
    When User search for 'Pokemon' item
    Then Product should be displayed
