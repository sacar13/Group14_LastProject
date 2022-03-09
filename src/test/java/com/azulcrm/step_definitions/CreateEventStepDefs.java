package com.azulcrm.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateEventStepDefs {

    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String userName) {
        LoginStepDefs loginStepDefs = new LoginStepDefs();
        loginStepDefs.the_user_logged_in_as(userName);
    }


    @Given("the user clicks on Event")
    public void the_user_clicks_on_Event() {

    }

    @When("the user selects start date, ending date, time and sets the time zone")
    public void the_user_selects_start_date_ending_date_time_and_sets_the_time_zone() {

    }

    @When("the user gives a name to event and clicks Send button")
    public void the_user_gives_a_name_to_event_and_clicks_Send_button() {

    }

    @Then("the user should be able to create the event")
    public void the_user_should_be_able_to_create_the_event() {

    }


}
