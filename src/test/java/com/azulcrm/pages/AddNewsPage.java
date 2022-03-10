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

    @FindBy(xpath = "(//div[@class='bx-calendar-range'])[4]/a")
    public List<WebElement> daysOfWeek;

    @FindBy(xpath = "//a[@class='bx-calendar-set-time']")
    public WebElement setTimeTab;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[1]")
    public WebElement setTimeHourInput;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[2]")
    public WebElement setTimeMinuteInput;

    @FindBy(xpath = "(//div[@class='bx-calendar-button-block']/a/span)[2]")
    public WebElement calendarSelectButton;

    @FindBy(xpath = "//input[@class='adm-input adm-input-calendar']")
    public WebElement dateInputBox;





}
