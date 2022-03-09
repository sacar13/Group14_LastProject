Feature: As a user, I should be able to create events by clicking on Event tab under Activity Stream


  Background:
    Given the user is logged in as "hr10@cybertekschool.com"
    And the user clicks on Event

  @wip
  Scenario: Creating event with specific time and date
    When the user selects start date, ending date, time and sets the time zone
    And the user gives a name to event and clicks Send button
    Then the user should be able to create the event