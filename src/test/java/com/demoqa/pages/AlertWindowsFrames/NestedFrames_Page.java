package com.demoqa.pages.AlertWindowsFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.demoqa.base.Hook.*;
public class NestedFrames_Page {

    @FindBy(xpath = "//span[text()='Nested Frames']")
    WebElement nestedFrameTag;

    @FindBy(tagName = "iframe")
    List<WebElement> IFrames;

    @FindBy(id = "frame1")
    WebElement frame1;

    @FindBy(tagName = "body")
    WebElement frame1Element;

    @FindBy(tagName = "iframe")
    List<WebElement> iFramesInframe1;

    @FindBy(tagName = "iframe")
    List<WebElement> iframesInFrame2;
    public NestedFrames_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void navigateToTheNestedFramePage(){
        nestedFrameTag.click();
    }
    public void nestedFrameHandling(){
        //Number of Frames on a Page
        int countIframesInPage = IFrames.size();
        System.out.println("Number of Frames on a Page:" + countIframesInPage);
        //Switch to Frame1
        driver.switchTo().frame(frame1);

        //Get the text for frame1 element
        String frame1Text =  frame1Element.getText();
        System.out.println("Frame1 is :"+frame1Text);

        //Number of Frames on a Frame1
        int countIframesInFrame1 =  iFramesInframe1.size();
        System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);

        //switch to child frame
        driver.switchTo().frame(0);
        String frame2Text =  frame1Element.getText();

        System.out.println("Frame 2 is :  "+ frame2Text);

        int countIframesInFrame2 =iframesInFrame2.size();
        System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
    }
    public String verifyFrames(){
        return frame1Element.getText();
    }
}
