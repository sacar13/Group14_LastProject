Feature: As a user, I should be able to add news under Company


  Background:
    Given the user logged in
    And the user lands on AddNews page


  Scenario: User should be able to select the type of information under preview text
    When the user clicks on Preview text tab
    Then the user should be able to select type of information

  Scenario:  User should be able to select a date and set a time under preview text
    When the user clicks on calender icon inside the Date input box
    And the user selects any date from the calendar
    And the user clicks Set time tap and set the time "11" as hour and "45" as minute
    Then the user should be able to see the date selected and the time set

  Scenario:  User should be able to send news
    When the user writes "Breaking News" on Title input box
    And the user writes "Last 3 weeks" on the textArea input box
    And the user clicks Save button
    Then hen the user should be able to see the new is sent
  @wip
  #Scenario:  User should be able to select Text, HTML, and Visual Editor
   # When user clicks on Text,HTML and Visual Editor
    #Then user should be able to select Text,HTML and Visual Editor







