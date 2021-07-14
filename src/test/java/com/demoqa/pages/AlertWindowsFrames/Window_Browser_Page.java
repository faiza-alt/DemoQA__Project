package com.demoqa.pages.AlertWindowsFrames;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class Window_Browser_Page {

    public Window_Browser_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement newTab_Window;

    @FindBy(xpath = "//button[@id='windowButton']")
    WebElement newWindowsBtn;

    @FindBy(xpath = "//button[@id='messageWindowButton']")
    WebElement windowPage;
    public void newWindow() throws InterruptedException {
        sleep(5000);
        newWindowsBtn.click();
        sleep(2000);
        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                WebDriver window = driver.switchTo().window(ChildWindow);
                System.out.println("Heading of child window is :-------->" + newTab_Window.getText());
                 window.close();
                break;
            }
        }
            driver.switchTo().window(mainWindowHandle);
    }

    public boolean successResponse() {
        Utilities.explicitWaitUntilClickable(windowPage);
         windowPage.click();
         return windowPage.isDisplayed();
    }

}
