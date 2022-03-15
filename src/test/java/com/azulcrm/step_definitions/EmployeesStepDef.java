package com.azulcrm.step_definitions;

import com.azulcrm.pages.EmployeesPage;
import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class EmployeesStepDef {

    EmployeesPage employeesPage=new EmployeesPage();

    @Given("the user logged in2")
    public void the_user_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        LoginPage loginPage=new LoginPage();
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        loginPage.login(username,password);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify the title", "(3) Portal", actualTitle);
    }

    @Then("the user should be able to see title as {string}")
    public void the_user_should_be_able_to_see_title_as(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify the title", expectedTitle, actualTitle);
    }

    @When("the user clicks to Employees tab")
    public void the_user_clicks_to_Employees_tab() {
        employeesPage.EmployeeTab.click();
    }
    @When("the user clicks the Add Department button")
    public void the_user_clicks_the_Add_Department_button() {
        employeesPage.addDepartmentButton.click();
    }

    @When("the user writes Department Name")
    public void the_user_writes_Department_Name() {
        employeesPage.departmentName.sendKeys("New Fancy Department");
    }

    @When("the user select Parent Department")
    public void the_user_select_Parent_Department() {
        Select select=new Select(employeesPage.parentDepartment);
        select.selectByIndex(3);
    }

    @When("the user clicks Add button")
    public void the_user_clicks_Add_button()  {
        employeesPage.addButton.click();
        BrowserUtils.waitForPageToLoad(3);
    }

    @Then("the user should be able to see the added department")
    public void the_user_should_be_able_to_see_the_added_department() {
        Assert.assertTrue("Verify new Department added",employeesPage.addedNewDepartment.isDisplayed());
    }
    @Given("the user clicks Find Employee tab")
    public void the_user_clicks_Find_Employee_tab() {
        employeesPage.findEmployeeTab.click();
    }

    @When("the user search {string} via search box")
    public void the_user_search_via_search_box(String username) {
        employeesPage.employeeSearchBox.sendKeys(username, Keys.ENTER);
    }

    @Then("the user should be able to see employees name as {string}")
    public void the_user_should_be_able_to_see_employees_information(String username) {
        String EmployeeName = employeesPage.searchedEmployee.getText();
        Assert.assertEquals("Verify the Employees info",EmployeeName,username);
    }
    @When("the user clicks Search By Alphabet tab")
    public void the_user_clicks_Search_By_Alphabet_tab() {
        employeesPage.searchByAlphabetTab.click();
    }

    @When("the user choose any alphabet")
    public void the_user_choose_any_alphabet() {
        employeesPage.searchedAlphabet.click();
    }

    @Then("the user should be able to see the employees name")
    public void the_user_should_be_able_to_see_the_employees_name() {
        String EmployeeName = employeesPage.alphabeticallySearchedEmployee.getText();
        Assert.assertEquals("Verify the Employees info","cat animal",EmployeeName);
    }

}
