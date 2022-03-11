package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PortalPage787 extends BasePage{

    @FindBy(xpath = "//input[@placeholder='Filter and search']")
    public WebElement filterAndSearch;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item']")
    public List<WebElement> menuElement;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label']")
    public List<WebElement> fieldElement;

    @FindBy(xpath = " //div[@class='main-ui-filter-field-list-item main-ui-select-inner-item main-ui-checked']")
    public List<WebElement> fieldElement2;


    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreButton;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addButton;

    @FindBy(xpath="//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button main-ui-filter-find']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='main-ui-control main-ui-select']")
    public WebElement dateButton;

    @FindBy(xpath = "(//div[@data-item='{\"NAME\":\"Yesterday\",\"VALUE\":\"YESTERDAY\"}'])[1]/div")
    public WebElement selectDateButton;

    @FindBy(xpath = "(//div[@class='main-ui-square-item'])[1]")
    public WebElement filterOptionsText;

    @FindBy(xpath = "(//div[@data-item='{\"NAME\":\"Posts\",\"VALUE\":\"blog_post\"}'])[1]/div")
    public WebElement selectTypeButton;

    @FindBy(xpath = "//div[@class='main-ui-control main-ui-multi-select']")
    public WebElement typeButton;

    @FindBy(xpath = "(//div[@class='main-ui-square-item'])[2]")
    public WebElement filterOptionsText2;





}
