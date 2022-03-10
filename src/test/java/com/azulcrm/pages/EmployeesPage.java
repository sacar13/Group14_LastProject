package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeesPage extends BasePage {

    @FindBy(className = "user-post-name")
    public  WebElement postName;


    @FindBy(className = "bx-ilike-left-wrap")
    public WebElement likebutton;

    @FindBy(id = "blog-post-addc-add-788")
    public WebElement commentButton;

    @FindBy(className = "feed-inform-follow")
    public WebElement unfollowButton;



}
