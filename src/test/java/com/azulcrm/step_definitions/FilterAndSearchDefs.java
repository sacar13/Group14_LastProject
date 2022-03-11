package com.azulcrm.step_definitions;

import com.azulcrm.pages.PortalPage787;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.List;

public class FilterAndSearchDefs {
    PortalPage787 portalPage=new PortalPage787();

    @When("user click on Filter and Search button")
    public void user_click_on_Filter_and_Search_button() {
        portalPage.filterAndSearch.click();
        BrowserUtils.waitFor(2.0);
    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> expectedListOptions) {
        List<String> actualOptions= BrowserUtils.getElementsText(portalPage.menuElement);
        Assert.assertEquals(expectedListOptions,actualOptions);
    }

    @When("User should be able to add field")
    public void userShouldBeAbleToAddField() {
        portalPage.filterAndSearch.click();
        BrowserUtils.waitFor(2.0);
        portalPage.restoreButton.click();
        portalPage.addButton.click();
        for (int i = 4; i <=6; i++) {
            portalPage.fieldElement.get(i).click();
        }
    }

    @Then("the user should see following options under add field")
    public void theUserShouldSeeFollowingOptionsUnderAddField(List<String> expectedListOptions) {
        List<String> actualOptions= BrowserUtils.getElementsText(portalPage.fieldElement);
        Assert.assertEquals(expectedListOptions,actualOptions);
    }

    @When("User should be able to remove field")
    public void userShouldBeAbleToRemoveField() {
        portalPage.filterAndSearch.click();
        BrowserUtils.waitFor(2.0);
        portalPage.restoreButton.click();
        portalPage.addButton.click();
        for (int i = 3; i >0; i--) {
            portalPage.fieldElement2.get(i).click();
        }
    }
    @Then("the user should see following options under remove field")
    public void theUserShouldSeeFollowingOptionsUnderRemoveField(List<String> expectedListOptions) {
        List<String> actualOptions= BrowserUtils.getElementsText(portalPage.fieldElement2);
        Assert.assertEquals(expectedListOptions,actualOptions);
    }
    @Then("the user should see following option {string}")
    public void theUserShouldSeeFollowingOption(String expected) {
        String actual=portalPage.filterOptionsText.getText();
        System.out.println(actual);
        Assert.assertEquals(expected,actual);

    }

    @When("User click on selecting date")
    public void userClickOnSelectingDate() {
        portalPage.filterAndSearch.click();
        BrowserUtils.waitFor(2.0);
        portalPage.restoreButton.click();
        portalPage.dateButton.click();
        BrowserUtils.waitFor(2.0);
        portalPage.selectDateButton.click();

        portalPage.searchButton.click();

    }

    @When("User click on selecting one or more type")
    public void userClickOnSelectingOneOrMoreType() {
        portalPage.filterAndSearch.click();
        BrowserUtils.waitFor(2.0);
        portalPage.restoreButton.click();
        portalPage.dateButton.click();
        BrowserUtils.waitFor(2.0);
        portalPage.selectDateButton.click();

        portalPage.typeButton.click();
        BrowserUtils.waitFor(1.0);
        portalPage.selectTypeButton.click();
        portalPage.searchButton.click();


    }

    @Then("the user should see following option {string} {string}")
    public void theUserShouldSeeFollowingOption(String expected1, String expected2) {
        String actual=portalPage.filterOptionsText.getText();
        Assert.assertEquals(expected1,actual);

        String actual2=portalPage.filterOptionsText2.getText();
        Assert.assertEquals(expected2,actual2);


    }
}
