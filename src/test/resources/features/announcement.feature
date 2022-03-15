  @wip
Feature: Announcement


  Background:
    Given the user logged in as "hr2@cybertekschool.com"
    And the user goes Announcement subheading from More under Activity Stream


    Scenario:
      When the user clicks "Link" icon
      And the user enters "Music" into Text field and enters "Link" into Link field, clicks "Save" button
      And the clicks "Send" button
      Then the Announcement should be published under Activity Stream page and contains "Music" and "Link"


    Scenario:
      When the user click Add Mention icon
      And the user clicks Employees and departments button from dropdown and chooses Asiya
      And the clicks "Send" button
      Then the Announcement should be published under Activity Stream page and contains Asiya with


    Scenario:
      When the user clicks Quote text icon
      And the users enters "Quote Test" to the quote text field
      And the clicks "Send" button
      Then the published announcement contains "Quote Test" quote


    Scenario:
      When the user delete the default variable in To section
      And the user clicks on Add persons, groups or department button
      And the user clicks on Employees and department button, choose and clicks Marufjon and Nick Owhadi as the target user
      Then Chosen target users must be displayed in the To field

      

