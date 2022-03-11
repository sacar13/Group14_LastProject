package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PollPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-vote\"]/span")
    public WebElement PollButton;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
    public WebElement linkButton;

    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement link;

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement save;

    @FindBy(xpath = "//*[@id=\"question_0\"]")
    public WebElement question;

    @FindBy(xpath = "//*[@id=\"answer_0__0_\"]")
    public WebElement answerA;

    @FindBy(xpath = "//*[@id=\"answer_0__1_\"]")
    public WebElement answerB;

    @FindBy(xpath = "//*[contains(@id,'feed-post-more-78')]")
    public WebElement moreButton;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-cancel\"]")
    public WebElement cancelQustn;


    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement SENDBUTTON;

    @FindBy(xpath = "//*[@id=\"votes-ac3ab09e1ab5bccbdfe6e02e0dec8cff\"]/div/a")
    public WebElement addQuestion;

    @FindBy(xpath = "/html/body/a")
    public WebElement linkyoutube;

    @FindBy(xpath = "//*[contains(@id,'question')]/table/tbody/tr[1]/td[1]/div/span/label[1]/span")
    public WebElement lastQuastion;




}
