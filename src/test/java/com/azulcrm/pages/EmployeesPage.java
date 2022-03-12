package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeesPage extends BasePage {

    @FindBy(className = "hr5@cybertekschool.com")
    public  WebElement postName;


    @FindBy(className = "bx-ilike-left-wrap")
    public WebElement likebutton;

    @FindBy(name = "hidden_focus")
    public WebElement commentButton;

    @FindBy(xpath = "//button[contains(text(),'Send')]")
    public WebElement commentSaveButton;

    @FindBy(partialLinkText = "Unfollow")
    public WebElement unfollowButton;



}
