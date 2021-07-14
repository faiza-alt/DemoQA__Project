package com.demoqa.pages.Widgets;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.demoqa.base.Hook.*;
import static java.lang.Thread.sleep;

public class Tabs_Page {
    @FindBy(xpath = "(//div[@class='header-right'])[4]")
    WebElement WidgetsBtn;

    @FindBy(xpath = "//span[text()='Tabs']")
    WebElement tabsTag;

    @FindBy(xpath = "//nav[@class='nav nav-tabs']/a")
    List<WebElement> Tabs;


    @FindBy(xpath = "//p[@class='mt-3']")
    List<WebElement> TabsText;

    public Tabs_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void homePage() throws InterruptedException {
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Utilities.scrollIntoView(WidgetsBtn);
        WidgetsBtn.click();

    }

    public void navigateToTabsPage() throws InterruptedException {
        sleep(300);
        tabsTag.click();
    }

    public void handlingTabs() {
        for (WebElement tab : Tabs) {
            String text = tab.getText();
            System.out.println(text);
            switch (text) {
                case "What":
                    tab.click();
                    System.out.println("It is WHAT TAB TEXT  --------------------");
                    String text1 = TabsText.get(0).getText();
                    System.out.println(text1);
                    System.out.println(tab.getText());

                case "Origin":
                    tab.click();
                    System.out.println("It is USE TAB TEXT --------------------");


                    String text2 = TabsText.get(1).getText();
                    System.out.println(text2);
                case "Use":
                    tab.click();
                    System.out.println("It is ORIGIN TAB TEXT --------------------");
                    String text3 = TabsText.get(2).getText();
                    System.out.println(text3);
                    break;
            }

        }
    }
}
