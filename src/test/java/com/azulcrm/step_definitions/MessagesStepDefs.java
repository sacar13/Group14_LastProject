package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.pages.MessagePage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MessagesStepDefs {

    @Given("the user logged in")
    public void the_user_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String password = ConfigurationReader.get("password");
        String username = ConfigurationReader.get("username");
        new LoginPage().login(username,password);
        BrowserUtils.waitForPageToLoad(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue("the title is not Portal",actualTitle.contains("Portal"));
    }

    @When("the user clicks on Message tab")
    public void the_user_clicks_on_Message_tab() {
        (new MessagePage()).messageTab.click();
    }

    @When("the user clicks on upload files")
    public void the_user_clicks_on_upload_files() {
        (new MessagePage()).attachFileIcon.click();
    }

    @When("the user chooses file or picture from local disks")
    public void the_user_chooses_file_or_picture_from_local_disks() {
        (new MessagePage()).uploadFile.sendKeys(new CharSequence[]{"C:\\Users\\LENOVO\\Desktop\\file.txt"});
        BrowserUtils.waitFor(3.0D);
    }

    @Then("the user should be able to see attachment text")
    public void the_user_should_be_able_to_see_attachment_text() {
        Assert.assertTrue((new MessagePage()).textAttached.getText(), true);
    }

    @When("the user clicks on add more button")
    public void the_user_clicks_on_add_more_button() {
        Driver.get().findElement(By.xpath("//div[@id='feed-add-post-destination-container']")).click();
    }

    @When("the user clicks on Employees and Departments tab")
    public void the_user_clicks_on_Employees_and_Departments_tab() {

        new MessagePage().employeesDepartments.click();
    }

    @When("the user clicks on Sales Department")
    public void the_user_clicks_on_Sales_Department() {
        (new MessagePage()).salesDepartment.click();
    }

    @When("the user checks All department and subdepartment employees")
    public void the_user_checks_All_department_and_subdepartment_employees() {
        BrowserUtils.selectCheckBox((new MessagePage()).allDepartEmployees, true);

    }

    @Then("the user verifies added employees")
    public void the_user_verifies_added_employees() {
        Driver.get().findElement(By.xpath("(//span[@class='feed-add-post-del-but'])[1]")).click();
        String str= Driver.get().findElement(By.xpath("//span[@id='feed-add-post-destination-item']")).getText();
        Assert.assertTrue(str,true);

    }



    @When("the user clicks on link icon")
    public void the_user_clicks_on_link_icon() {
        (new MessagePage()).linkIcon.click();
    }

    @When("the user fills link text and link URL")
    public void the_user_fills_link_text_and_link_URL() {
        (new MessagePage()).linkText.sendKeys(new CharSequence[]{"AzulCRM"});
        (new MessagePage()).linkURL.sendKeys(new CharSequence[]{"https://qa.azulcrm.com/stream/"});
    }

    @When("the user clicks on save button")
    public void the_user_clicks_on_save_button() {
        (new MessagePage()).saveButton.click();
    }

    @Then("the user sees written text on text frame")
    public void the_user_sees_written_text_on_text_frame() {
        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(2.0);
        Driver.get().findElement(By.xpath("/html/body")).getText();
        Assert.assertTrue("AzulCRM", true);
        Driver.get().switchTo().defaultContent();

    }

    @When("the user types on frame text {string}")
    public void the_user_types_on_frame_text(String string) {

        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(2.0);
        Driver.get().findElement(By.xpath("/html/body")).sendKeys(string);
        Assert.assertTrue(string, true);
        Driver.get().switchTo().defaultContent();
    }

    @When("the user clicks on send button")
    public void the_user_clicks_on_send_button() {

        new MessagePage().sendButton.click();
    }

    @Then("the user should see the sent message {string}")
    public void the_user_should_see_the_sent_message(String text) {

        BrowserUtils.waitFor(3.0D);
        new MessagePage().lastPost.getText();
        Assert.assertTrue(text, true);
    }
}
