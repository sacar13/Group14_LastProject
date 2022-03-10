package com.azulcrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EventPage extends BasePage{

    @FindBy(css = "#feed-add-post-form-tab-calendar > span")
    public WebElement eventButton;

    @FindBy(id = "feed-cal-event-fromcal_3Jcl")
    public WebElement eventStartDate;

    @FindBy(id = "feed_cal_event_from_timecal_3Jcl")
    public WebElement eventStartHour;

    @FindBy(id = "feed-cal-event-tocal_3Jcl")
    public WebElement eventEndingDate;

    @FindBy(id = "feed_cal_event_to_timecal_3Jcl")
    public WebElement eventEndingHour;

    @FindBy(className = "feed-ev-tz-open")
    public WebElement specifyTimeZone;

    @FindBy(id = "feed-cal-tz-fromcal_3Jcl")
    public WebElement eventStartTimeZoneDropdown;

    @FindBy(id = "feed-cal-tz-tocal_3Jcl")
    public WebElement eventEndingTimeZoneDropdown;

    @FindBy(id = "feed-cal-event-namecal_3Jcl")
    public WebElement eventNameInbox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement eventSendButton;

    @FindBy(id = "feed-event-dest-cont")
    public WebElement membersInbox;

    @FindBy(id = "destDepartmentTab_calnAJEM3")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "(//a[@href='#U702']/div/div)[2]")
    public WebElement mikeSmith;

    @FindBy(xpath = "(//a[@href='#U712']/div/div)[2]")
    public WebElement hr20;

    @FindBy(xpath = "(//table/tbody/tr/td/a)[1]")
    public WebElement lastCreatedEventName;

    @FindBy(id = "event-remindercal_3Jcl")
    public WebElement setReminderButton;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public WebElement setReminderInbox;

    @FindBy(id = "event-remind_typecal_3Jcl")
    public WebElement setReminderTimeUnitDropdown;

    @FindBy(id = "event-locationcal_3Jcl")
    public WebElement eventLocationDropdown;

    @FindBy(id = "bxecmr_0")
    public WebElement centralMeetingRoom;

    @FindBy(id = "bxecmr_1")
    public WebElement eastMeetingRoom;

    @FindBy(id = "bxecmr_2")
    public WebElement westMeetingRoom;

    @FindBy(xpath = "(//td[@class='feed-calendar-view-text-cell-r'])[3]")
    public WebElement lastCreatedEventLocation;

    @FindBy(xpath = "//*[@class='bx-finder-company-department']/a[@href='#DR200']")
    public WebElement salesDepartment;

    @FindBy(xpath = "(//span/div[@class='bx-finder-company-department-check-arrow'])[3]")
    public WebElement allSalesDepartmentSelectButton;

    @FindBy(xpath = "(//*[@class='feed-add-post-destination-icon']/../*)[2]")
    public WebElement getLastCreatedEventDestination;

    @FindBy(css = "#feed-cal-additional-show > span")
    public WebElement eventMoreButton;

    @FindBy(xpath = "//*[@id='feed-cal-additional-inner']/table/tbody/tr/td/label")
    public List<WebElement> eventMoreOptions;

    @FindBy(xpath = "(//span[@class='feed-ev-planner-link'])[1]")
    public WebElement eventConflictDetailsButton;

    @FindBy(className = "calendar-planner-time-arrow-right-text")
    public WebElement vacantTimeArrow;
}
