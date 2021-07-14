package com.demoqa.pages.Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class Buttons_Page {

    @FindBy(xpath = "//span[text()='Buttons']")
    WebElement buttonsTag;

    @FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']/div[1]/div/button")
    List<WebElement> clickableBtns;

    @FindBy(xpath = "//p[@id='dynamicClickMessage']")
    WebElement successMessage;

    public Buttons_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void navigateToButtonsPage() throws InterruptedException {
        sleep(300);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");
        buttonsTag.click();
   }

   public void clickOnButton(String BtnType){
        for(WebElement btn : clickableBtns) {
            String text = btn.getText();
            if(text.equalsIgnoreCase(BtnType)){
                btn.click();
            }
        }
    }

    public boolean verifyClickButtons(){
       return successMessage.isDisplayed();
    }
}
