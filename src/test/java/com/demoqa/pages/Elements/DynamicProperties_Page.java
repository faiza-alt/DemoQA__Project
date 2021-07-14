package com.demoqa.pages.Elements;
import com.demoqa.helper.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;
public class DynamicProperties_Page {
    @FindBy(xpath = "//span[text()='Dynamic Properties']")
    WebElement dynamicPropertiesTag;

    @FindBy(xpath = "//button[@id='colorChange']")
    WebElement dynamicBtn;

    @FindBy(xpath = "//button[@id='visibleAfter']")
    WebElement successResponse;
    public  DynamicProperties_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void navigateTODynamicPropPage() throws InterruptedException {
        Utilities.scrollIntoView(dynamicPropertiesTag);
        dynamicPropertiesTag.click();
    }
    public void clickOnDynamicBtn(){
        dynamicBtn.click();
    }
    public boolean verifySuccess(){
      return   successResponse.isDisplayed();
    }
}
