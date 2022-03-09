Feature: As a user, I should be able to create events by clicking on Event tab under Activity Stream


  Background:
    Given the user is logged in as "hr10@cybertekschool.com"
    And the user clicks on Event


  Scenario: Creating event with specific time and date
    When the user selects start date, ending date, time and sets the time zone
    And the user gives a name to event and clicks Send button
    Then the user should be able to create the event


  Scenario: Setting place and reminder for event
    When the user selects start date, ending date, time and sets the time zone
    And the user sets place and sets reminder for the event
    And the user gives a name to event and clicks Send button
    Then the user should be able to create the event and see its location

  @wip
  Scenario: Adding attendees to event message
    When the user selects start date, ending date, time and sets the time zone
    And the user selects "Mike Smith" and "Sales Department" from members
    And the user gives a name to event and clicks Send button
    Then the user should be able to create the event and see "SalesDepartment" has gotten the message