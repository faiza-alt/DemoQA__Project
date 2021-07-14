package com.demoqa.pages.WebsiteFeatures;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.demoqa.base.Hook.*;

public class VerifyLinks_Page {

    @FindBy(xpath = "//ul[@id='primary-menu']/li/a")
    List<WebElement> headerLinks;

    public VerifyLinks_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomePage() {
        driver.get("https://www.toolsqa.com/selenium-training/");
    }

    public void verifyLinks() throws InterruptedException {
        System.out.println(headerLinks.size());

        for (int i = 0; i < headerLinks.size(); i++) {
            Utilities.highlightElements(headerLinks.get(i));
            Actions builder = new Actions(driver);
            builder.moveToElement(headerLinks.get(i)).build().perform();
        }


    }


}
