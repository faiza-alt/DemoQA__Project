package com.demoqa.pages.Elements;

import com.demoqa.helper.Utilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class DownloadFile_Page {

    @FindBy(xpath = "//span[text()='Upload and Download']")
    WebElement downloadTag;

    @FindBy(xpath = "//a[@id='downloadButton']")
    WebElement downloadBtn;

    public DownloadFile_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void navigateToDownloadPage() throws InterruptedException {
      Utilities.scrollIntoView(downloadTag);
        downloadTag.click();
    }
    public void clickOnDownload() {
        downloadBtn.click();
    }
    public void verifyDownload() throws IOException, InterruptedException {
        Utilities.scrollThePage(0,700);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./ScreenShot_Folder/Test1_Login.png"));
    }

}
