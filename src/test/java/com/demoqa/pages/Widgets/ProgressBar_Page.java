package com.demoqa.pages.Widgets;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class ProgressBar_Page {
    @FindBy(xpath = "(//div[@class='header-right'])[4]")
    WebElement WidgetsBtn;

    @FindBy(xpath = "//span[text()='Progress Bar']")
    WebElement progressBarTag;

    @FindBy(xpath = "//button[@id='startStopButton']")
    WebElement startStopBtn;

    @FindBy(xpath = "//div[@id='progressBar']//div")
    WebElement progressBarValue;
    public ProgressBar_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateToProgressBarPage() throws InterruptedException {
        Utilities.scrollIntoView(WidgetsBtn);
        WidgetsBtn.click();
        sleep(300);
        progressBarTag.click();
    }

    public void handleButton() throws InterruptedException {
        sleep(1000);
       startStopBtn.click();
        sleep(1000);
        System.out.println(progressBarValue.getText());
       if(progressBarValue.getAttribute("aria-valuenow").equalsIgnoreCase("70")){ ;
           startStopBtn.click();
       }

    }


    }

