package com.demoqa.pages.Widgets;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class ToolTip_Page {
    @FindBy(xpath = "(//div[@class='header-right'])[4]")
    WebElement WidgetsBtn;

    @FindBy(xpath = "//span[text()='Tool Tips']")
    WebElement toolTipTag;
    @FindBy(id = "toolTipButton")
    WebElement toolTip1;
    @FindBy(id = "toolTipTextField")
    WebElement toolTip2;

    public ToolTip_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void homePage() throws InterruptedException {
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Utilities.scrollIntoView(WidgetsBtn);
        WidgetsBtn.click();

    }

    public void navigateToToolTipPage() throws InterruptedException {
        sleep(300);
        toolTipTag.click();
    }

    public void handleToolTip() {
        // Get element for which we need to find tooltip

        //Get title attribute value
        String tooltipText = toolTip1.getText();

        System.out.println("Retrieved tooltip text as :" + tooltipText);

        //Verification if tooltip text is matching expected value
        if (tooltipText.equalsIgnoreCase("Hover me to see")) {
            System.out.println("Pass : Tooltip matching expected value");
        } else {
            System.out.println("Fail : Tooltip NOT matching expected value");
        }

        String tooltipText2 = toolTip1.getText();
        System.out.println("Retrieved tooltip text as :" + tooltipText2);
    }

    public boolean verify() {
        return toolTip1.getText().equalsIgnoreCase("Hover me to see");
    }
}
