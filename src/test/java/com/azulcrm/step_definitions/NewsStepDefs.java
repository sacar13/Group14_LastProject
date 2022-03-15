package com.azulcrm.step_definitions;

import com.azulcrm.pages.NewsPage;
import com.azulcrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class NewsStepDefs {

    NewsPage newsPage = new NewsPage();

    @And("the user lands on AddNews page")
    public void the_user_lands_on_AddNews_page() {
       //newsPage.companyTab.click();
       newsPage.addNewsTab.click();
    }

    @When("the user clicks on Preview text tab")
    public void the_user_clicks_on_Preview_text_tab() {
        newsPage.previewTextTab.click();
    }

    @Then("the user should be able to select type of information")
    public void the_user_should_be_able_to_select_type_of_information() {
        Select select = new Select(newsPage.typeOfInfoSelectButton);
        select.selectByIndex(6);
        Assert.assertTrue(newsPage.selectOptions.get(6).getText().contains("Portal News"));
        select.selectByIndex(3);
        Assert.assertTrue(newsPage.selectOptions.get(3).getText().contains("News"));
    }

    @When("the user clicks on calender icon inside the Date input box")
    public void the_user_clicks_on_calender_icon_inside_the_Date_input_box() {
       newsPage.calendarIcon.click();
    }

    @And("the user selects any date from the calendar")
    public void theUserSelectsAnyDateFromTheCalendar() {
        newsPage.daysOfWeek.get(3).click();
    }

    @When("the user clicks Set time tap and set the time {string} as hour and {string} as minute")
    public void the_user_clicks_Set_time_tap_and_set_the_time_as_hour_and_as_minute(String hour, String minute) {
        newsPage.setTimeTab.click();
        newsPage.setTimeHourInput.sendKeys(hour);
        newsPage.setTimeMinuteInput.sendKeys(minute);
        newsPage.calendarSelectButton.click();
    }

    @Then("the user should be able to see the date selected and the time set")
    public void the_user_should_be_able_to_see_the_date_selected_and_the_time_set() {
        String expectedInput = "03/23/2022 11:45:00 pm";
        String actualInput = newsPage.dateInputBox.getAttribute("value");

        Assert.assertEquals("the date and time is NOT as expected",expectedInput,actualInput);
    }

    @When("the user writes {string} on Title input box")
    public void the_user_writes_on_Title_input_box(String title) {
       newsPage.titleInputBox.sendKeys(title);
    }

    @When("the user writes {string} on the textArea input box")
    public void the_user_writes_on_the_textArea_input_box(String text) {
        newsPage.textAreaInputBox.sendKeys(text);
    }

    @When("the user clicks Save button")
    public void the_user_clicks_Save_button() {
        newsPage.saveButton.click();
    }

    @Then("hen the user should be able to see the new is sent")
    public void hen_the_user_should_be_able_to_see_the_new_is_sent() {
        BrowserUtils.waitFor(2.0);
        newsPage.newsTab.click();
        String expectedTitle = "Breaking News";
        String actualTitle = newsPage.lastNew.getText();

        Assert.assertEquals("the new is NOT created",expectedTitle,actualTitle);
    }

    @When("user clicks on {string} radio button")
    public void user_clicks_on_radio_button(String button) {
        switch (button.toLowerCase()){
            case "text":
                newsPage.textHTMLVisualEditor.get(0).click();
                break;
            case "html":
                newsPage.textHTMLVisualEditor.get(1).click();
                break;
            case "visual editor":
                newsPage.textHTMLVisualEditor.get(2).click();
                break;
        }
    }

    @Then("user should be able to see {string} radio button is selected")
    public void user_should_be_able_to_see_radio_button_is_selected(String button) {
       switch (button.toLowerCase()){
           case "text":
               System.out.println();
               Assert.assertTrue("text is NOT selected", newsPage.textHTMLVisualEditor.get(0).isSelected());
               break;
           case "html":
               Assert.assertTrue("HTML is NOT selected", newsPage.textHTMLVisualEditor.get(1).isSelected());
               break;
           case "visual editor":
               Assert.assertTrue("Visual Editor is NOT selected", newsPage.textHTMLVisualEditor.get(2).isSelected());
               break;
       }
    }

    //PullRequest







}
