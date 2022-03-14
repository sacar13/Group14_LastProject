@AZUL-805
Feature: Default

  #@AZUL-800
  Background:
    Given the user logged in
    And the user clicks on Event
		

	#User Story: As a user, I should be able to create events by clicking on Event tab under Activity Stream
	#
	#{color:red}Acceptance Criteria:{color}
	#
	## *User should be able to add Event start and ending date and time and specify the time zone.*
	## User should be able to set a reminder.
	## User should be able to select event location from the dropdown.
	## User should be able to add attendees by selecting contacts individually or adding groups and departments.
	## User should be able to click on More to see the event details.
	## User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance
	## User should be able to send messages.
  @AZUL-801
  Scenario: Creating event with specific time and date
    When the user selects start date, ending date, time and sets the time zone
    And the user gives a name to event and clicks Send button
    Then the user should be able to create the event

	#User Story: As a user, I should be able to create events by clicking on Event tab under Activity Stream
	#
	#{color:red}Acceptance Criteria:{color}
	#
	## User should be able to add Event start and ending date and time and specify the time zone.
	##* User should be able to set a reminder.*
	## *User should be able to select event location from the dropdown.*
	## User should be able to add attendees by selecting contacts individually or adding groups and departments.
	## User should be able to click on More to see the event details.
	## User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance
	## User should be able to send messages.
  @AZUL-802
  Scenario: Setting place and reminder for event
    When the user selects start date, ending date, time and sets the time zone
    And the user sets reminder and sets place for the event
    And the user gives a name to event and clicks Send button
    Then the user should be able to create the event and see its location

	#User Story: As a user, I should be able to create events by clicking on Event tab under Activity Stream
	#
	#{color:red}Acceptance Criteria:{color}
	#
	## User should be able to add Event start and ending date and time and specify the time zone.
	## User should be able to set a reminder.
	## User should be able to select event location from the dropdown.
	## *User should be able to add attendees by selecting contacts individually or adding groups and departments.*
	## User should be able to click on More to see the event details.
	## User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance
	## User should be able to send messages.
  @AZUL-803

  Scenario: Adding attendees to event message
    When the user selects start date, ending date, time and sets the time zone
    And the user selects "hr20@cybertekschool.com" and "Sales Department" from members
    And the user gives a name to event and clicks Send button
    Then user should see "hr20@cybertekschool.com" and "SalesDepartment" has gotten the message

	#User Story: As a user, I should be able to create events by clicking on Event tab under Activity Stream
	#
	#{color:red}Acceptance Criteria:{color}
	#
	## User should be able to add Event start and ending date and time and specify the time zone.
	## User should be able to set a reminder.
	## User should be able to select event location from the dropdown.
	## User should be able to add attendees by selecting contacts individually or adding groups and departments.
	## *User should be able to click on More to see the event details.
	## User should be able to see event details parameters as "Availability, Repeat, Calendar, Importance*
	## User should be able to send messages.
  @AZUL-804
  Scenario: More option details of sending an event
    When the user selects start date, ending date, time and sets the time zone
    And user clicks on More button
    Then the user should see the following options in this order:
      | Availability |
      | Repeat       |
      | Calendar     |
      | Importance   |