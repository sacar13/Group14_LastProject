$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/create_event.feature");
formatter.feature({
  "name": "As a user, I should be able to create events by clicking on Event tab under Activity Stream",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
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
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_logged_in()"
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
  "name": "Creating event with specific time and date",
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
  "name": "the user should be able to create the event",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_should_be_able_to_create_the_event()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_logged_in()"
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
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_logged_in()"
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
  "name": "Adding attendees to event message",
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
  "name": "the user selects \"Mike Smith\" and \"Sales Department\" from members",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_selects_and_from_members(java.lang.String,java.lang.String)"
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
  "name": "user should be able to create an event and see \"SalesDepartment\" has gotten the message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.user_should_be_able_to_create_an_event_and_see_has_gotten_the_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "the user logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.LoginStepDefs.the_user_logged_in()"
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
  "name": "More option details of sending an event",
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
  "name": "user clicks on More button",
  "keyword": "And "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.user_clicks_on_More_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the following options in this order:",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.azulcrm.step_definitions.CreateEventStepDefs.the_user_should_see_the_following_options_in_this_order(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});