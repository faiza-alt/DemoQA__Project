package com.demoqa.pages.Widgets;
import  com.demoqa.helper.Utilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.Thread.sleep;

public class AutoComplete_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[4]")
    WebElement WidgetsBtn;

    @FindBy(xpath = "//span[text()='Auto Complete']")
    WebElement autoCompleteTag;

    @FindBy(xpath = "//input[@id='autoCompleteMultipleInput']")
    WebElement searchBox;

    @FindBy(xpath = "//div[text()='Blue']")
    WebElement successMsg;

    public AutoComplete_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void navigateToAutoCompletePage() throws InterruptedException {
        Utilities.scrollIntoView(WidgetsBtn);
        WidgetsBtn.click();
        sleep(300);
        autoCompleteTag.click();
    }
    public void searchColor() throws InterruptedException {
        searchBox.sendKeys("b");
        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ENTER);


        searchBox.sendKeys("w");
        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        searchBox.sendKeys(Keys.ENTER);


    }
    public boolean verifySuccessMsg(){
    return successMsg.isDisplayed();
    }
}
