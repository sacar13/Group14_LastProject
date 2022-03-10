package com.azulcrm.step_definitions;

import com.azulcrm.pages.EmployeesPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmployeesStepDefs {




    @Then("User should be able to make like, or unfollow on other employees' posts.")
    public void theUserClicksOnSendMessageBox() {

        Driver.get().findElement(By.linkText("Add comment")).click();
        BrowserUtils.waitForPageToLoad(3);
        Driver.get().findElement(By.name("hidden_focus"));
        Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));
        Driver.get().findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("How are yo");
        Driver.get().switchTo().defaultContent();
        Driver.get().findElement(By.xpath("//button[contains(text(),'Send')]")).click();
        EmployeesPage employeesPage = new EmployeesPage();
        employeesPage.likebutton.click();
        employeesPage.unfollowButton.click();


    }

    @Then("User should be able to like or make comments on all other reviewers' comments.")
    public void userShouldBeAbleToLikeOrMakeCommentsOnAllOtherReviewersComments() {
        Driver.get().findElement(By.xpath("(//span[@class='sidebar-user-info'])[2]")).click();
        EmployeesPage employeesPage=new EmployeesPage();
        employeesPage.likebutton.click();
        Driver.get().findElement(By.linkText("Add comment")).click();
        BrowserUtils.waitForPageToLoad(3);
        Driver.get().findElement(By.name("hidden_focus"));
        Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));
        Driver.get().findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi");
        Driver.get().switchTo().defaultContent();
        Driver.get().findElement(By.xpath("//button[contains(text(),'Send')]")).click();

    }

    @Then("User should be able to click on reviewers' names and visit their profiles.")
    public void userShouldBeAbleToClickOnReviewersNamesAndVisitTheirProfiles() {
       WebElement name= Driver.get().findElement(By.id("bp_718"));
       name.click();
      String expectedname="(2) hr5@cybertekschool.com";

       Assert.assertEquals(expectedname,Driver.get().getTitle());
    }

    @Then("User should be able to add others' posts to favorite by clicking on the Star icon.")
    public void userShouldBeAbleToAddOthersPostsToFavoriteByClickingOnTheStarIcon() {
        Driver.get().findElement(By.cssSelector("#log_entry_favorites_1626")).click();
    }
}

