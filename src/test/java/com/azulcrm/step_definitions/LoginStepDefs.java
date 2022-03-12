package com.azulcrm.step_definitions;

import com.azulcrm.pages.LoginPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.ConfigurationReader;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user logged in")
    public void the_user_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String password = ConfigurationReader.get("password");
        String username = ConfigurationReader.get("username");
        loginPage.login(username,password);
        BrowserUtils.waitForPageToLoad(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue("the title is not Portal",actualTitle.contains("Portal"));
    }

}
