package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeesPage extends BasePage{
    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    public WebElement EmployeeTab;

    @FindBy(xpath = "//span[text()='Add department']")
    public WebElement addDepartmentButton;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentName;

    @FindBy(xpath = "//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartment;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//a[@title='New Fancy Department']")
    public WebElement addedNewDepartment;

    @FindBy(xpath = "//span[text()='Find Employee']")
    public WebElement findEmployeeTab;

    @FindBy(id = "user-fio")
    public WebElement employeeSearchBox;

    @FindBy(xpath = "//a[@class='employee-name-link']")
    public WebElement searchedEmployee;

    @FindBy(xpath = "(//span[@class='filter-but-text-block'])[3]")
    public WebElement searchByAlphabetTab;

    @FindBy(xpath = "(//div[@class='employee-ABC-popup'])/a[5]")
    public WebElement searchedAlphabet;

    @FindBy(xpath = "//a[@class='employee-name-link']")
    public WebElement alphabeticallySearchedEmployee;

    @Then("the user should be able to see title as {string}")
    public void the_user_should_be_able_to_see_title_as(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify the title", expectedTitle, actualTitle);
    }

}
