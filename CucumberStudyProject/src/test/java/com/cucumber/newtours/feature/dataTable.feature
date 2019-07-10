@FunctionalTest
Feature: Data Table Learning

  @done4 @RegressionTest
  Scenario: User Registration
    Given User is on registration pagess
    When I entered invalid data on the page
    |Fields|Values|
    |FirstName|Tom|
    |LastName|Kenny|
    |EmailAddress|someone@someone.com|
    |Re-enter EmailAddress|someone@someone.com|
    |password|Password1|
    |Birthdate|01|
    Then user registration should be unsuccessful