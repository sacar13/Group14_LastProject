Feature: As a user, I should be able to add news under Company


  Background:
    Given the user logged in
    And the user lands on AddNews page


  Scenario: User should be able to select the type of information under preview text
    When the user clicks on Preview text tab
    Then the user should be able to select type of information
  @wip
  Scenario:  User should be able to select a date and set a time under preview text
    When the user clicks on calender icon inside the Date input box




