package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends BasePage{

    @FindBy(xpath = "(//span[@class='feed-add-post-form-link feed-add-post-form-link-active'])[1]")
    public WebElement messageTab;

    @FindBy(xpath = "//*[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement attachFileIcon;

    @FindBy(xpath = "(//*[@class='diskuf-label'][1])[1]")
    public WebElement textAttached;

    @FindBy(xpath = "(//*[@class='diskuf-fileUploader wd-test-file-light-inp '][1])[1]")
    public WebElement uploadFile;

    @FindBy(xpath = "(//*[@class='feed-add-destination-link'][1])[1]")
    public WebElement addPersons;

    @FindBy(xpath = "//a[@href='#'][@id='bx-destination-tag']")
    public WebElement addMoreButton;

    @FindBy(xpath = "(//input[@class='feed-add-destination-inp'])[1]")
    public WebElement employeesDepartments;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab_destination')]")
    public WebElement salesDepartment;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-text'])[4]")
    public WebElement allDepartEmployees;

    @FindBy(xpath = "//*[@class='popup-window-close-icon']")
    public WebElement closeWindow;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link'][@title='Link']")
    public WebElement linkIcon;

    @FindBy(xpath = "//input[@type='text'][@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkText;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkURL;

    @FindBy(xpath = "//input[@type='button'][@value='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement iFrameText;


    @FindBy(xpath = "//button[@id='blog-submit-button-save'][@class='ui-btn ui-btn-lg ui-btn-primary']")
    public WebElement sendButton;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement lastPost;


}
