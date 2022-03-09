package com.azulcrm.step_definitions;

import com.azulcrm.pages.EventPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreateEventStepDefs {

    EventPage eventPage = new EventPage();

    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String userName) {
        LoginStepDefs loginStepDefs = new LoginStepDefs();
        loginStepDefs.the_user_logged_in_as(userName);
    }

    @Given("the user clicks on Event")
    public void the_user_clicks_on_Event() {
        eventPage.eventButton.click();
    }

    @When("the user selects start date, ending date, time and sets the time zone")
    public void the_user_selects_start_date_ending_date_time_and_sets_the_time_zone() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String tomorrowAsString = dateFormat.format(tomorrow);

        eventPage.eventStartDate.clear();
        eventPage.eventStartDate.sendKeys(tomorrowAsString);
        eventPage.eventStartHour.clear();
        eventPage.eventStartHour.sendKeys("10:00 am");
        eventPage.eventEndingHour.clear();
        eventPage.eventEndingHour.sendKeys("11:00 am");

        eventPage.specifyTimeZone.click();
        Select selectStart = new Select(eventPage.eventStartTimeZoneDropdown);
        selectStart.selectByVisibleText("(UTC +01:00) Europe/Amsterdam");
        Select selectEnding = new Select(eventPage.eventStartTimeZoneDropdown);
        selectEnding.selectByVisibleText("(UTC +01:00) Europe/Amsterdam");

    }

    @When("the user gives a name to event and clicks Send button")
    public void the_user_gives_a_name_to_event_and_clicks_Send_button() {
        eventPage.membersInbox.click();
        BrowserUtils.scrollToElement(eventPage.membersInbox);
        eventPage.employeesAndDepartments.click();
        eventPage.mikeSmith.click();
        eventPage.eventNameInbox.sendKeys("EventTest");
        BrowserUtils.scrollToElement(eventPage.eventSendButton);
        eventPage.eventSendButton.click();
        BrowserUtils.waitFor(2.0);

    }

    @Then("the user should be able to create the event")
    public void the_user_should_be_able_to_create_the_event() {
        String expectedMessage = "EventTest";
        String actualMessage = eventPage.lastCreatedEventName.getText();
        Assert.assertEquals("Event wasn't created",expectedMessage,actualMessage);
    }

    @When("the user sets place and sets reminder for the event")
    public void the_user_sets_place_and_sets_reminder_for_the_event() {
        eventPage.eventLocationDropdown.click();
        eventPage.centralMeetingRoom.click();

        Assert.assertTrue(eventPage.setReminderButton.isEnabled());

        if (!eventPage.setReminderButton.isSelected()) {
            eventPage.setReminderButton.click();
        }
        eventPage.setReminderInbox.sendKeys("1");
        new Select(eventPage.setReminderTimeUnitDropdown).selectByVisibleText("hours");
    }

    @Then("the user should be able to create the event and see its location")
    public void the_user_should_be_able_to_create_the_event_and_see_its_location() {
        String expectedMessage = "EventTest";
        String actualMessage = eventPage.lastCreatedEventName.getText();
        Assert.assertEquals("Event wasn't created",expectedMessage,actualMessage);

        String expectedLocation = "Central Meeting Room";
        String actualLocation = eventPage.lastCreatedEventLocation.getText();
        Assert.assertEquals("Event location is wrong",expectedLocation,actualLocation);
    }

}
