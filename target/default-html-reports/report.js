$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/create_event.feature");
formatter.feature({
  "name": "As a user, I should be able to create events by clicking on Event tab under Activity Stream",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in as \"hr10@cybertekschool.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_is_logged_in_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Event",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_clicks_on_Event()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Setting place and reminder for event",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user selects start date, ending date, time and sets the time zone",
  "keyword": "When "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_selects_start_date_ending_date_time_and_sets_the_time_zone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sets place and sets reminder for the event",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_sets_place_and_sets_reminder_for_the_event()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user gives a name to event and clicks Send button",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_gives_a_name_to_event_and_clicks_Send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to create the event and see its location",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_should_be_able_to_create_the_event_and_see_its_location()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});