package com.azulcrm.step_definitions;

import com.azulcrm.pages.AnnouncementPage;
import com.azulcrm.pages.BasePage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Locale;

public class AnnouncementDefs {

    BasePage basePage = new BasePage();
    AnnouncementPage announcementPage = new AnnouncementPage();



    @Given("the user goes Announcement subheading from More under Activity Stream")
    public void the_user_goes_Announcement_subheading_from_More_under_Activity_Stream() throws InterruptedException {
        basePage.moreOfActivitystream.click();
        basePage.announcementbutton.click();
        Thread.sleep(1000);
    }

    @When("the user clicks {string} icon")
    public void the_user_clicks_icon(String string) throws InterruptedException {
        announcementPage.LinkIcon.click();
        Thread.sleep(1000);
    }

    @When("the user enters {string} into Text field and enters {string} into Link field, clicks {string} button")
    public void the_user_enters_into_Text_field_and_enters_into_Link_field_clicks_button(String text, String link, String button) throws InterruptedException {
        announcementPage.TextField.sendKeys(text);
        Thread.sleep(1000);
        announcementPage.LinkField.sendKeys(link);
        announcementPage.SaveButton.click();
        Thread.sleep(1000);
    }

    @When("the user clicks Quote text icon")
    public void the_user_clicks_Quote_text_icon() {
        announcementPage.quoteIcon.click();
    }

    @When("the users enters {string} to the quote text field")
    public void the_users_enters_to_the_quote_text_field(String quotetext) {
        Driver.get().switchTo().frame(0);
        announcementPage.qoutetextField.sendKeys(quotetext);
        Driver.get().switchTo().defaultContent();
    }

    @Then("the published announcement contains {string} quote")
    public void the_published_announcement_contains_quote(String expectedResult) {
        String actualResult = announcementPage.quoteAnnouncement.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }


    @When("the clicks {string} button")
    public void the_clicks_button(String string) {
        announcementPage.sendButton.click();
    }

    @Then("the Announcement should be published under Activity Stream page and contains {string} and {string}")
    public void the_Announcement_should_be_published_under_Activity_Stream_page_and_contains_and(String text, String link) {
        String actualtext = announcementPage.createdannouncement.getText();
        System.out.println(announcementPage.createdannouncement.getAttribute("href"));
        String actuallink = announcementPage.createdannouncement.getAttribute("href").substring(7);
        System.out.println("actuallink = " + actuallink);
        Assert.assertEquals(text,actualtext);
        Assert.assertEquals(link.toLowerCase(Locale.ROOT)+"/",actuallink);
    }

    @When("the user click Add Mention icon")
    public void the_user_click_Add_Mention_icon() {
        announcementPage.addmetion.click();
    }

    @When("the user clicks Employees and departments button from dropdown and chooses Asiya")
    public void the_user_clicks_Employees_and_departments_button_from_dropdown_and_chooses_Asiya() throws InterruptedException {
        announcementPage.employeesanddepartments.click();
        Thread.sleep(1000);
        announcementPage.asiya.click();
    }


    @Then("the Announcement should be published under Activity Stream page and contains Asiya with")
    public void the_Announcement_should_be_published_under_Activity_Stream_page_and_contains_Asiya_with() {
        BrowserUtils.waitForVisibility(announcementPage.choosenasiya,2);
        Assert.assertEquals("Asiya",announcementPage.choosenasiya.getText());
    }

    @When("the user delete the default variable in To section")
    public void the_user_delete_the_default_variable_in_To_section() {
        announcementPage.defaultdelete.click();
    }

    @When("the user clicks on Add persons, groups or department button")
    public void the_user_clicks_on_Add_persons_groups_or_department_button() {
        announcementPage.addMoreButton.click();
    }

    @When("the user clicks on Employees and department button, choose and clicks Marufjon and Nick Owhadi as the target user")
    public void the_user_clicks_on_Employees_and_department_button_choose_and_clicks_Marufjon_and_Nick_Owhadi_as_the_target_user() {
        announcementPage.EmployeesAndDepartmentButton.click();
        announcementPage.usermarufjon.click();
        announcementPage.usernick.click();
    }

    @Then("Chosen target users must be displayed in the To field")
    public void chosen_target_users_must_be_displayed_in_the_To_field() {
        Assert.assertTrue(announcementPage.choosenmarufjon.isDisplayed());
        Assert.assertTrue(announcementPage.choosennick.isDisplayed());
    }




}
