package com.demoqa.pages.Widgets;
import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class SelectMenu_Page {
    @FindBy(xpath = "(//div[@class='header-right'])[4]")
    WebElement WidgetsBtn;

    @FindBy(xpath = "//span[text()='Select Menu']")
    WebElement selectMenuTag;

    @FindBy(xpath = "//select[@id='oldSelectMenu']")
    WebElement selectDropDown;

    @FindBy(xpath = "//select[@id='cars']")
    WebElement carsDropDown;

    public SelectMenu_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void homePage() throws InterruptedException {
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Utilities.scrollIntoView(WidgetsBtn);
        WidgetsBtn.click();
    }
    public void navigateToSelectMenuPage() throws InterruptedException {
        sleep(300);
        selectMenuTag.click();
    }
    public void dropDowns() throws InterruptedException {
        sleep(1000);
        Select s = new Select(selectDropDown);
        s.selectByIndex(1);
        Select s2 = new Select(carsDropDown);
        s2.selectByIndex(2);
        Utilities.scrollIntoView(carsDropDown);


    }
}
