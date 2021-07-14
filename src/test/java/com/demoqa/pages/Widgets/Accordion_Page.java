package com.demoqa.pages.Widgets;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.Thread.sleep;

public class Accordion_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[4]")
    WebElement WidgetsBtn;

    @FindBy(xpath = "//span[text()='Accordian']")
    WebElement accordionTag;

    @FindBy(xpath = "//div[@class='card']")
    List<WebElement> accordion;

    @FindBy(xpath = "//div[@id='section3Content']")
    WebElement successSign;

    public Accordion_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void navigateToAccordionPage() throws InterruptedException {
        Utilities.scrollIntoView(WidgetsBtn);
        WidgetsBtn.click();
        sleep(300);
        accordionTag.click();
    }

    public void clickOnAccordion() throws InterruptedException {
        for(int i = 0; i < accordion.size(); i++){
            Utilities.scrollIntoView(accordion.get(i));
            String text = accordion.get(i).getText();
            Utilities.highlightElements(accordion.get(i));
            accordion.get(i).click();
            System.out.println(text);
        }
    }

    public boolean verifyAccordion(){
      return  successSign.isDisplayed();
    }
}
