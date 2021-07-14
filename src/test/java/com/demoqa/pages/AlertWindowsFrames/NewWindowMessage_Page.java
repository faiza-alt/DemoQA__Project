package com.demoqa.pages.AlertWindowsFrames;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class NewWindowMessage_Page {

    @FindBy(xpath = "//button[@id='messageWindowButton']")
    WebElement newMessageWindowBtn;

    @FindBy(xpath = "//body[contains(text(),'Knowledge increases by sharing')]")
    WebElement newWindowText;

    @FindBy(xpath = "//button[@id='tabButton']")
    WebElement windowsTabBtn;

    public NewWindowMessage_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void navigateToNewTab() throws InterruptedException {
        //  Utilities.explicitWaitUntilClickable(newMessageWindowBtn);
        sleep(1000);
        newMessageWindowBtn.click();
        sleep(1000);
        // Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                WebDriver window = driver.switchTo().window(ChildWindow);
                window.close();
                break;
            }
        }
        driver.switchTo().window(mainWindowHandle);
    }
 public boolean verifySuccess() {
     Utilities.explicitWaitUntilClickable(windowsTabBtn);
     windowsTabBtn.click();
     return windowsTabBtn.isDisplayed();
 }
}
