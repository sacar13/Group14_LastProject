package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreOfActivitystream;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon feed-add-post-form-important feed-add-post-form-important-more ']")
    public WebElement announcementbutton;


}
