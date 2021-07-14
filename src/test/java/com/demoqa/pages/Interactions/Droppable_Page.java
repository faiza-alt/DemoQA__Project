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

public class Droppable_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[5]")
    WebElement InteractionsBtn;

    @FindBy(xpath = "//span[text()='Droppable']")
    WebElement droppableBtn;

    @FindBy(xpath = "//div[@id='draggable']")
    WebElement droppable;

    @FindBy(xpath = "(//div[@id='droppable'])[1]")
    WebElement target;


    @FindBy(xpath = "//p[text()='Dropped!']")
    WebElement dropSuccessMsg;

    public Droppable_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateToDropPage() throws InterruptedException {
        Utilities.scrollIntoView(InteractionsBtn);
        InteractionsBtn.click();
        sleep(3000);
        droppableBtn.click();
    }

    public void dragMeAndDrop() {
        Actions builder = new Actions(driver);
        builder.dragAndDrop(droppable, target).build().perform();
    }

    public boolean verifyDropped() {
        return dropSuccessMsg.isDisplayed();
    }
}
