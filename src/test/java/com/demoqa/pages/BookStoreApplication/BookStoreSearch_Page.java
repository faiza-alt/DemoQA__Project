package com.demoqa.pages.BookStoreApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class BookStoreSearch_Page {
    @FindBy(xpath = "//span[text()='Book Store']")
    WebElement searchPageBtn;

    @FindBy(id = "searchBox")
    WebElement searchBox;


    @FindBy(xpath = "//*[@href='/books?book=9781449365035']")
    WebElement book;

    @FindBy(xpath = "//*[text()='Speaking JavaScript']")
    WebElement bookTitle;

    public BookStoreSearch_Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void navigateToTheSearchPage() throws InterruptedException {
        searchPageBtn.click();
        sleep(1000);
    }

    public void searchBook(){
        searchBox.sendKeys("sp");
        book.click();

    }

    public boolean verification(){
        return bookTitle.isDisplayed();
    }
}
