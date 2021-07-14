package com.demoqa.pages.Widgets;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class Slider_Page {

    @FindBy(xpath = "(//div[@class='header-right'])[4]")
    WebElement WidgetsBtn;

    @FindBy(xpath = "//span[text()='Slider']")
    WebElement sliderTag;

    @FindBy(xpath = "//div[contains(@class,'range-slider__tooltip range-slider__tooltip')]")
    WebElement slider;


    @FindBy(xpath = "//input[@id='sliderValue']")
    WebElement sliderValue;
    public Slider_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void navigateToSliderPage() throws InterruptedException {
        Utilities.scrollIntoView(WidgetsBtn);
        WidgetsBtn.click();
        sleep(300);
        sliderTag.click();
        sleep(300);
    }
    public void dragSlider(int x, int y){
        Actions builder = new Actions(driver);
        builder.dragAndDropBy(slider,x,y).build().perform();
    }

    public boolean verifySuccess(){
       return sliderValue.isDisplayed();
    }
}
