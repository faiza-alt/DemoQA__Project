package com.demoqa.pages.AlertWindowsFrames;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class Alert_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[3]")
    WebElement AlertWindowFramesBtn;

    @FindBy(xpath = "//span[text()='Alerts']")
    WebElement alertTag;

    @FindBy(xpath = "//button[@id='alertButton']")
    WebElement alertBtn;

    @FindBy(xpath = "//button[@id='timerAlertButton']")
    WebElement timeAlertBtn;

    @FindBy(xpath = "//button[@id='confirmButton']")
    WebElement confirmAlertBtn;

    @FindBy(xpath = "//button[@id='promtButton']")
    WebElement promptAlertBtn;

    @FindBy(xpath = "//span[text()='You selected ']")
    WebElement verifySuccess;

    public Alert_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateAlertPage() throws InterruptedException {
        Utilities.scrollIntoView(AlertWindowFramesBtn);
        AlertWindowFramesBtn.click();
        alertTag.click();
    }
    public void alert() {
        alertBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void timeAlert() throws InterruptedException {
        timeAlertBtn.click();
        sleep(6000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void confirmAlert(){
        confirmAlertBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }
    public void promptAlert() {
        promptAlertBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public boolean verifySuccessResponse() {
        return verifySuccess.isDisplayed();
    }
}
