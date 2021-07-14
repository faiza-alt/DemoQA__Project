package com.demoqa.pages.Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class TextBox_Page {

   // WebDriver driver;
    @FindBy(xpath = "//span[text()='Text Box']")
    WebElement textBox;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement userEmail;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement currentAddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement permanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//div[@class='border col-md-12 col-sm-12']")
    WebElement dataBox;

    public TextBox_Page(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickOnTextBox(){
        textBox.click();
    }

    public void fillTextBoxes(String Name,String Email , String CurrentAddress, String PermanentAddress){
        userName.sendKeys(Name);
        userEmail.sendKeys(Email);
        currentAddress.sendKeys(CurrentAddress);
        permanentAddress.sendKeys(PermanentAddress);
    }

    public void clickOnSubmitBtn() throws InterruptedException {
        sleep(300);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        submitBtn.click();
    }
    public boolean verifyTextBoxFeature(){
        String text = dataBox.getText();
        System.out.println(text);
        return dataBox.isDisplayed();
    }
}
