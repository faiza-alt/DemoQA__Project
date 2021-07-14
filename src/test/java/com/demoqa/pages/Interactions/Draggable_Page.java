package com.demoqa.pages.Interactions;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class Draggable_Page {
    @FindBy(xpath = "(//div[@class='header-right'])[5]")
    WebElement InteractionsBtn;

    @FindBy(xpath = "//span[text()='Dragabble']")
    WebElement draggableBtn;


    @FindBy(xpath = "//*[text()='Drag me']")
    WebElement draggMeElem;
    public Draggable_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void navigateToDraggingPage() throws InterruptedException {
        Utilities.scrollIntoView(InteractionsBtn);
        InteractionsBtn.click();
        sleep(3000);
        draggableBtn.click();
    }
    public void dragMe() throws InterruptedException {
        Actions builder = new Actions(driver);
        sleep(3000);
        builder.clickAndHold(draggMeElem).moveByOffset(100,200)
                .release(draggMeElem).perform();
        Utilities.highlightElements(draggMeElem);
        sleep(3000);
    }
}
