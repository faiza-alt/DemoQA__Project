package com.demoqa.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;
public class Utilities {

    public static void scrollThePage(int x,int y) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy" +  x , y);
        sleep(300);
    }
    public static void scrollIntoView(WebElement element) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        sleep(300);
    }

    public static WebElement explicitWaitUntilClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,20);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void highlightElements(WebElement elem) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 3 ; i ++){
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", elem);
            sleep(500);
        js.executeScript("arguments[0].setAttribute('style','arguments[1]');",elem,"");
       }
    }
}
