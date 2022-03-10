package com.azulcrm.step_definitions;

import com.azulcrm.pages.AddNewsPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AddNewsStepDefs {

    AddNewsPage addNewsPage = new AddNewsPage();

    @And("the user lands on AddNews page")
    public void the_user_lands_on_AddNews_page() {
       addNewsPage.companyTab.click();
       addNewsPage.addNewsTab.click();
    }

    @When("the user clicks on Preview text tab")
    public void the_user_clicks_on_Preview_text_tab() {
        addNewsPage.previewTextTab.click();
    }

    @Then("the user should be able to select type of information")
    public void the_user_should_be_able_to_select_type_of_information() {
        Select select = new Select(addNewsPage.typeOfInfoSelectButton);
        select.selectByIndex(6);
        Assert.assertTrue(addNewsPage.selectOptions.get(6).getText().contains("Portal News"));
        select.selectByIndex(3);
        Assert.assertTrue(addNewsPage.selectOptions.get(3).getText().contains("News"));
    }

    @When("the user clicks on calender icon inside the Date input box")
    public void the_user_clicks_on_calender_icon_inside_the_Date_input_box() {
       addNewsPage.calendarIcon.click();
    }

    @And("the user selects any date from the calendar")
    public void theUserSelectsAnyDateFromTheCalendar() {
        addNewsPage.daysOfWeek.get(4).click();
    }

    @When("the user clicks Set time tap and set the time {string} as hour and {string} as minute")
    public void the_user_clicks_Set_time_tap_and_set_the_time_as_hour_and_as_minute(String hour, String minute) {
        addNewsPage.setTimeTab.click();
        addNewsPage.setTimeHourInput.sendKeys(hour);
        addNewsPage.setTimeMinuteInput.sendKeys(minute);
        addNewsPage.calendarSelectButton.click();
    }

    @Then("the user should be able to see the date selected and the time set")
    public void the_user_should_be_able_to_see_the_date_selected_and_the_time_set() {
        String expectedInput = "03/23/2022 11:45:00 pm";
        BrowserUtils.waitFor(2.0);
        System.out.println("addNewsPage.dateInputBox.getText() = " + addNewsPage.dateInputBox.getText());


    }



}
