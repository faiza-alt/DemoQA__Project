package com.demoqa.pages.Interactions;

import com.demoqa.helper.Utilities;
import io.cucumber.java.sl.In;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class SelectAble_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[5]")
    WebElement InteractionsBtn;


    @FindBy(xpath = "//span[text()='Selectable']")
    WebElement selectableBtn;

    @FindBy(xpath = "//ul[@id='verticalListContainer']//li")
    List<WebElement> options;

    @FindBy(xpath = "//li[@class='mt-2 list-group-item active list-group-item-action']")
    WebElement successSign;

    public SelectAble_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSelectable() throws InterruptedException {
        Utilities.scrollIntoView(InteractionsBtn);
        InteractionsBtn.click();
        sleep(3000);
        selectableBtn.click();
    }

    public void selectOptions(String optionType) {
        for (WebElement selectOpt : options) {
            String text = selectOpt.getText();
            System.out.println(text);
            selectOpt.click();
//            if (text.trim().equalsIgnoreCase(optionType)) {
//                selectOpt.click();
//            }

        }

    }

    public boolean verifySelection() {
        return successSign.isDisplayed();
    }
}
