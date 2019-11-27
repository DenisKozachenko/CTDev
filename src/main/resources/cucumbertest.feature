Feature: ManageLogin

  Scenario: Login existing user
    Given  I am on the login page
    And  I fillout Login field
    And  I fillout password field
    And  I press Register button
    Given I am on the new page

