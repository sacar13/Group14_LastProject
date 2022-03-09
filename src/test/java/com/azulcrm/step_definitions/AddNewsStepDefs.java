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


}
