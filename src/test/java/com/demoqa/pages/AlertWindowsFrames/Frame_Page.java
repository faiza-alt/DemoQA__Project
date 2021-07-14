package com.demoqa.pages.AlertWindowsFrames;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.demoqa.base.Hook.*;

public class Frame_Page {
    public Frame_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//div[@class='header-right'])[3]")
    WebElement AlertWindowFramesBtn;

    @FindBy(xpath = "//span[text()='Frames']")
    WebElement frameTag;

    @FindBy(xpath = "//h1[@id='sampleHeading']")
    WebElement sampleHeading;

    public void atPageOfFrames() throws InterruptedException {
        Utilities.scrollIntoView(AlertWindowFramesBtn);
        AlertWindowFramesBtn.click();
    }
    public void navigateToFramePage() {
        Utilities.explicitWaitUntilClickable(frameTag);
        frameTag.click();
    }
    public void handleTheFrame(){
      driver.switchTo().frame("frame1");
        System.out.println("Text Of The Frame page--->"+sampleHeading.getText());
    }

    public boolean verifyFrame(){
        return sampleHeading.isDisplayed();
    }
}
