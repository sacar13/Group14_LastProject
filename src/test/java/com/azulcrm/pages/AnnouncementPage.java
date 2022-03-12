package com.azulcrm.pages;

import com.azulcrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AnnouncementPage {
    public AnnouncementPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement LinkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement TextField;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement LinkField;

    @FindBy(id = "undefined")
    public WebElement SaveButton;

    @FindBy(xpath = "//div[starts-with(@id,'blog_post_')]//a[starts-with(@href,'http:')]")
    public WebElement textActivityStream;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id ="U512")
    public WebElement userExtra;

    @FindBy(id = "U768")
    public WebElement userExtra1;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[position()>1]")
    public List<WebElement> chosenUsers;

    @FindBy(xpath = "//div[starts-with(@id,'blog_post_')]//a[starts-with(@href,'http://')]")
    public WebElement createdannouncement;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement addmetion;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab_mention')]")
    public WebElement employeesanddepartments;

    @FindBy(xpath = "(//a[@href='#U483'])[2]")
    public WebElement asiya;

    @FindBy(xpath = "//div[starts-with(@id,'blog_post_')]//a")
    public WebElement choosenasiya;

    @FindBy(xpath = "//span[@id='bx-b-quote-blogPostForm']//span")
    public WebElement quoteIcon;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement qoutetextField;

    @FindBy(xpath = "//div[@class='blog-post-quote']//table//tbody//tr//td")
    public WebElement quoteAnnouncement;

    @FindBy(id = "bx-destination-tag")
    public WebElement addMoreButton;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab_destination')]")
    public WebElement EmployeesAndDepartmentButton;

    @FindBy(xpath = "//a[@href='#U490']")
    public WebElement usermarufjon;

    @FindBy(xpath = "//a[@href='#U547']")
    public WebElement usernick;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement defaultdelete;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement choosenmarufjon;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-text'])[2]")
    public WebElement choosennick;



}
