package com.demoqa.pages.Elements;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.demoqa.base.Hook.driver;

public class CheckBox_Page {
    @FindBy(xpath = "//span[text()='Check Box']")
    WebElement checkBoxBtn;

    @FindBy(xpath = "(//button[@title='Toggle'])[1]")
    WebElement collapseBtn;
    @FindBy(xpath = "//span[@class='rct-node-icon']")
    WebElement checkBoxIcon;

    @FindBy(xpath = "//span[text()='You have selected :']")
    WebElement selectedBox;

    @FindBy(xpath = "//ol/li/span /label")
    List<WebElement> options;

    public CheckBox_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickOnCheckBox() throws InterruptedException {
        Utilities.scrollThePage(0,100);
        checkBoxBtn.click();
    }
    public void clickOnCollapseBtn() {
        collapseBtn.click();
    }
    public void selectCheckBoxes(String selectCheckbox) {
        for (WebElement box : options) {
            System.out.println(box.getText());
            String text = box.getText().trim();
            if (text.equalsIgnoreCase(selectCheckbox)) {
                box.click();
                break;
            }
        }
    }
    public boolean verifySelectedCheckBox() {
        return selectedBox.isDisplayed();
    }

}
