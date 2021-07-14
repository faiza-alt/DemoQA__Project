package com.demoqa.pages.AlertWindowsFrames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class smallModalDialogues_Pages {
    @FindBy(xpath = "//span[text()='Modal Dialogs']")
    WebElement modalDialogueTag;

    @FindBy(id = "showSmallModal")
    WebElement smallModal;

    @FindBy(id = "closeSmallModal")
    WebElement closeSmallModal;

    @FindBy(xpath = " //div[@class='modal-body']")
    WebElement TextSmallModal;

    public smallModalDialogues_Pages(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void navigateToTheDialoguePage(){
    modalDialogueTag.click();
    }
    public void smallModalHandling() {
        smallModal.click();
        String text = TextSmallModal.getText();
        System.out.println(text);
        closeSmallModal.click();
    }
    public boolean verification(){
      return   smallModal.isDisplayed();    }
}
