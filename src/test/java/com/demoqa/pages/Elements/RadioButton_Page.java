package com.demoqa.pages.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RadioButton_Page {

    @FindBy(xpath = "//span[text()='Radio Button']")
    WebElement radioBtnTag;

    @FindBy(xpath = "//input[@id='impressiveRadio']")
    WebElement radioBtn;

    @FindBy(xpath = "//label[contains(@for,'Radio')]")
    List<WebElement> radioBtns;

    @FindBy(xpath = "//p[text()='You have selected ']")
    WebElement successBox;

    public RadioButton_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void ClickOnRadioBtnTag() {
        radioBtnTag.click();
    }

    public void selectRadioBtn(String btnType) {
        for (WebElement btn : radioBtns) {
            String text = btn.getText();
            System.out.println(text);
            if (text.trim().equalsIgnoreCase(btnType) && !btn.isSelected()) {
                btn.click();
                break;
            }

            System.out.println(text);
        }
    }

    public boolean verifyRadioBtn() {
        return successBox.isDisplayed();
    }
}




























