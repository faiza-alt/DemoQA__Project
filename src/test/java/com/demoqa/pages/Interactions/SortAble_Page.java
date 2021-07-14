package com.demoqa.pages.Interactions;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class SortAble_Page {
    @FindBy(xpath = "(//div[@class='header-right'])[5]")
    WebElement InteractionsBtn;

    @FindBy(xpath = "//span[text()='Sortable']")
    WebElement sortAbleBtn;

    @FindBy(xpath = "//div[@class='vertical-list-container mt-4']//div")
    List<WebElement> sortAbleBtnOptions;

    @FindBy(xpath = "//div[@class='vertical-list-container mt-4']//div[text()='Six']")
    WebElement target;
    public SortAble_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void navigateToTheSortablePage() throws InterruptedException {
        Utilities.scrollIntoView(InteractionsBtn);
        InteractionsBtn.click();
        sleep(300);
        sortAbleBtn.click();
    }
    public void sortTheOption(String sortType) throws InterruptedException {
        for (WebElement opt:sortAbleBtnOptions){
            String text = opt.getText();
            System.out.println(text);
            if (text.trim().equalsIgnoreCase(sortType)){
                Actions builder = new Actions(driver);
                sleep(500);
                Utilities.highlightElements(opt);
                builder.dragAndDrop(opt , target).build().perform();
                sleep(500);
                break;
            }
        }
    }
}
