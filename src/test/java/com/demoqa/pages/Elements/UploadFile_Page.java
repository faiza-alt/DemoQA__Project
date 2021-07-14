package com.demoqa.pages.Elements;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class UploadFile_Page {
    @FindBy(xpath = "//span[text()='Upload and Download']")
    WebElement downloadAndUploadTag;

    @FindBy(xpath = "//input[@id='uploadFile']")
    WebElement upLoadBtn;

    @FindBy(xpath = "//p[@id='uploadedFilePath']")
    WebElement successMsg;

 public UploadFile_Page(WebDriver driver){
     PageFactory.initElements(driver,this);
 }

  public void navigateToUploadPage() throws InterruptedException {
      Utilities.scrollIntoView(downloadAndUploadTag);
     downloadAndUploadTag.click();
  }
    public void clickOnUpLoad(String UploadFile){
        upLoadBtn.sendKeys(UploadFile);
    }
    public boolean verifySuccessUpload() {
        return successMsg.isDisplayed();
    }
}
