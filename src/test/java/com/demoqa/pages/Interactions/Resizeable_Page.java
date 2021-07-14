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

public class Resizeable_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[5]")
    WebElement InteractionsBtn;

    @FindBy(xpath = "//span[text()='Resizable']")
    WebElement resizeableBtn;


    @FindBy(xpath = "(//*[contains(@class,'react-resizable-handle react-resizable-handle-se')])[2]")
    WebElement resizeableHandle;

    public Resizeable_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void navigateResizePage() throws InterruptedException {
        Utilities.scrollIntoView(InteractionsBtn);
        InteractionsBtn.click();
        sleep(3000);;
        resizeableBtn.click();
    }
    public void resize() throws InterruptedException {
        Actions builder = new Actions(driver);
        Utilities.scrollIntoView(resizeableHandle);
        builder.clickAndHold(resizeableHandle).moveByOffset(0,100)
                .release(resizeableHandle).perform();
        }


}
