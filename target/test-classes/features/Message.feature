@781
Feature:  to send messages by clicking on the Message tab under Active Stream

  Background:
    Given the user logged in
    When the user clicks on Message tab

  Scenario: User should be able to upload files and pictures
    When the user clicks on upload files
    And the user chooses file or picture from local disks
    Then the user should be able to see attachment text

  Scenario: User should be able to add contacts from Employees and Departments
    When the user clicks on add more button
    And the user clicks on Employees and Departments tab
    And the user clicks on Sales Department
    And the user checks All department and subdepartment employees
    Then the user verifies added employees


  Scenario: User should be able to attach a link by clicking on link icon
    When the user clicks on link icon
    And the user fills link text and link URL
    And the user clicks on save button
    Then the user sees written text on text frame

  Scenario: User should be able to send a message
    When the user types on frame text "Last project"
    And the user clicks on send button
    Then the user should see the sent message "Last project"