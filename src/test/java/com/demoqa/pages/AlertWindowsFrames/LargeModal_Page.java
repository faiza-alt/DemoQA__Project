package com.demoqa.pages.AlertWindowsFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LargeModal_Page {

    @FindBy(id = "showLargeModal")
    WebElement largeModal;

    @FindBy(id = "closeLargeModal")
    WebElement closeLargeModal;

    @FindBy(xpath = " //div[@class='modal-body']/p")
    WebElement textLargeModal;

    public LargeModal_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openTheLargeModal() {
        largeModal.click();
    }

    public String verification() {
        String text = textLargeModal.getText();
        System.out.println("LARGE MODAL TEXT   ----->  " + text);
        closeLargeModal.click();
        return text;
    }
}
