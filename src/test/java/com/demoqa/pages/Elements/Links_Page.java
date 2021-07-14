package com.demoqa.pages.Elements;
import com.demoqa.helper.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;
public class Links_Page {
    @FindBy(xpath = "//span[text()='Links']")
    WebElement linksTag;

    @FindBy(tagName = "a")
    List<WebElement> linksWrapper;
    public Links_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickOnLinksPage() throws InterruptedException {
        Utilities.scrollIntoView(linksTag);
        linksTag.click();
    }
    public void clickOnLinks() throws InterruptedException {
        // This line will print the number of links and the count of links.
        System.out.println("No of links are " + linksWrapper.size());

        //checking the links fetched.
        for (int i = 0; i < linksWrapper.size(); i++) {
            WebElement E1 = linksWrapper.get(i);
            String url = E1.getAttribute("href");
            Utilities.highlightElements(linksWrapper.get(i));
            verifyLinks(url);
        }
    }
    public static void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            //Now we will be creating url connection and getting the response code
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() >= 400) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
            }
            //Fetching and Printing the response code obtained
            else {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
        } catch (Exception e) {
        }
    }
}
