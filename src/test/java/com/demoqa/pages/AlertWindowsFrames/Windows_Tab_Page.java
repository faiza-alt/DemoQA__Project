package com.demoqa.pages.AlertWindowsFrames;
import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;
import static com.demoqa.base.Hook.*;
import static java.lang.Thread.sleep;

public class Windows_Tab_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[3]")
    WebElement AlertWindowFramesBtn;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    WebElement windowsTag;

    @FindBy(xpath = "//button[@id='tabButton']")
    WebElement windowsTabBtn;


    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement newTab_Window;

    @FindBy(xpath = "//button[@id='messageWindowButton']")
    WebElement windowPage;

    public Windows_Tab_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateToTheWindowPage() throws InterruptedException {
        Utilities.scrollIntoView(AlertWindowFramesBtn);
        AlertWindowFramesBtn.click();
        Utilities.explicitWaitUntilClickable(windowsTag);
        windowsTag.click();
    }

    public void navigateToNewTab() throws InterruptedException {
        Utilities.explicitWaitUntilClickable(windowsTabBtn);
        windowsTabBtn.click();
        sleep(5000);
        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                WebDriver window = driver.switchTo().window(ChildWindow);
                System.out.println("Heading of child window is :---------->" + newTab_Window.getText());
                window.close();
                break;
            }
        }
        driver.switchTo().window(mainWindowHandle);
    }



    public void successResponse() {
        Utilities.explicitWaitUntilClickable(windowPage);
         windowPage.click();
    }
}
