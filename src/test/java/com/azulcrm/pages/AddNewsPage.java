package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddNewsPage extends BasePage{

    @FindBy(xpath = "//span[text()='Add News']")
    public WebElement addNewsTab;

    @FindBy(xpath = "(((//tbody)[6]/tr)[2]/td)[2]/select")
    public WebElement typeOfInfoSelectButton;

    @FindBy(id = "tab_cont_cedit1")
    public WebElement previewTextTab;

    @FindBy(id = "tab_cont_cedit2")
    public WebElement detailsTab;

    @FindBy(xpath = "(((//tbody)[6]/tr)[2]/td)[2]/select/option")
    public List<WebElement> selectOptions;

    @FindBy(css = ".adm-calendar-icon")
    public WebElement calendarIcon;



}
