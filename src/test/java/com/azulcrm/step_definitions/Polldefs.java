package com.azulcrm.step_definitions;

import com.azulcrm.pages.PollPage;
import com.azulcrm.utilities.BrowserUtils;
import com.azulcrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Polldefs {
    PollPage pollPage = new PollPage();

    @When("User should able to click POLL button")
    public void userShouldAbleToClickPOLLButton() {

        pollPage.PollButton.click();
    }

    @Then("User should able to click Link button")
    public void userShouldAbleToClickLinkButton() {
        pollPage.linkButton.click();
        BrowserUtils.waitFor(2.0);


    }

    @And("User should able to add link and save")
    public void userShouldAbleToAddLinkAndSave() {
        pollPage.link.sendKeys("https://www.youtube.com/watch?v=wtRlDiqt34w");
        BrowserUtils.waitFor(2.0);
        pollPage.save.click();
        Driver.get().switchTo().frame(0);
        BrowserUtils.waitFor(2.0);
        String actualLink = pollPage.linkyoutube.getText();
        BrowserUtils.waitFor(2.0);
        String expectedLink ="https://www.youtube.com/watch?v=wtRlDiqt34w";
        Assert.assertEquals(actualLink,expectedLink);
        System.out.println("Link added successfully");
        Driver.get().switchTo().defaultContent();



    }

    @When("User should able to add question and answer")
    public void userShouldAbleToAddQuestionAndAnswer() {
        pollPage.PollButton.click();
        BrowserUtils.waitFor(2.0);
        pollPage.linkButton.click();
        BrowserUtils.waitFor(2.0);
        pollPage.link.sendKeys("https://www.youtube.com/watch?v=3GifsdO2f");
        BrowserUtils.waitFor(2.0);
        pollPage.save.click();
        BrowserUtils.waitFor(1.0);
        pollPage.question.sendKeys("Which team is better");
        BrowserUtils.waitFor(2.0);
        pollPage.answerA.sendKeys("Galatasaray");
        BrowserUtils.waitFor(2.0);
        pollPage.answerB.sendKeys("Barcelona");
        BrowserUtils.waitFor(2.0);
        pollPage.SENDBUTTON.click();
        BrowserUtils.waitFor(2.0);
        System.out.println( pollPage.lastQuastion.isEnabled());


    }


    @When("User should able to click delete.")
    public void userShouldAbleToClickDelete() {

       pollPage.addQuestion.click();
        BrowserUtils.waitFor(2.0);
        pollPage.cancelQustn.click();
        System.out.println("Question can be editable and deletable");


    }

    @When("User should able to click SEND button")
    public void userShouldAbleToClickSENDButton() {

        pollPage.PollButton.click();
        BrowserUtils.waitFor(2.0);
        pollPage.question.sendKeys("Which team is better");
        BrowserUtils.waitFor(1.0);
        pollPage.answerA.sendKeys("Galatasaray");
        BrowserUtils.waitFor(1.0);
        pollPage.answerB.sendKeys("Barcelona");
        BrowserUtils.waitFor(1.0);

        pollPage.SENDBUTTON.click();
        System.out.println("SEND button working");

    }

}
