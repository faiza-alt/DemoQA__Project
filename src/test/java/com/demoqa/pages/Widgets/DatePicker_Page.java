package com.demoqa.pages.Widgets;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;

public class DatePicker_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[4]")
    WebElement WidgetsBtn;

    @FindBy(xpath = "//span[text()='Date Picker']")
    WebElement datePickerTag;

    @FindBy(xpath = "//input[@id='datePickerMonthYearInput']")
    WebElement datePickerBox;

    @FindBy(xpath = "//button[text()='Next Month']")
    WebElement nextDateBtn;

    @FindBy(xpath = "//div[@class='react-datepicker__header']//div")
    List<WebElement> dateOptions;

    @FindBy(xpath = "//div[@aria-label='month  2021-07']//div")
    List<WebElement> dayOptions;

    @FindBy(xpath = "//input[@value='10/15/2021']")
    WebElement successMsg;
    @FindBy(xpath = "//input[@id='datePickerMonthYearInput']")
    WebElement successMsg1;


    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    WebElement selectMonth;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    WebElement selectYear;


    @FindBy(xpath = "//div[@class='react-datepicker__month']//div")
    List<WebElement> selectDay;

    public DatePicker_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateToDatePickerPage() throws InterruptedException {
        Utilities.scrollIntoView(WidgetsBtn);
        WidgetsBtn.click();
        sleep(300);
        datePickerTag.click();

    }

    public void pickDate(String mnthYear, String day) throws InterruptedException {
        datePickerBox.click();
        sleep(300);
        while (true) {
            System.out.println(dateOptions.get(0).getText());
            if (dateOptions.get(0).getText().equalsIgnoreCase(mnthYear)) {
                break;
            }
            nextDateBtn.click();
        }

        for (WebElement elem : dayOptions) {
            if (elem.getText().equalsIgnoreCase(day)) {
                elem.click();
                break;
            }

        }
    }

    public boolean verifySuccess() {
        return successMsg1.isDisplayed();
    }

    public void selectDate(String month, String Year, String day) throws InterruptedException {
        datePickerBox.click();
        Select select = new Select(selectMonth);
        select.selectByVisibleText(month);
        Select slect = new Select(selectYear);
        slect.selectByVisibleText(Year);

        for (WebElement Day : selectDay) {
            if (Day.getText().equalsIgnoreCase(day)) {
                Day.click();
                break;
            }
        }
    }

    public boolean verifySuccessResponse() {

        return successMsg1.isDisplayed();
    }


}