package com.demoqa.pages.BookStoreApplication;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static java.lang.Thread.sleep;

public class Login_Page {

    @FindBy(xpath = "//*[text()='Book Store Application']")
    WebElement books;

    @FindBy(xpath = "//span[text()='Login']")
    WebElement LoginPageBtn;

    @FindBy(id = "userName")
    WebElement user;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login")
    WebElement loginBtn;

    @FindBy(xpath = "//button[text()='Log out']")
    WebElement logOutBtn;

    public Login_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void homePage() throws InterruptedException {
        driver.get("https://demoqa.com/books");
        Utilities.scrollIntoView(books);
        sleep(1000);
    }
    public void navigateToLoginPage() throws InterruptedException {
        LoginPageBtn.click();
        sleep(400);
    }
    public void enterCredentials(String userName, String pass) throws InterruptedException {
        sleep(400);
        user.sendKeys(userName);
        password.sendKeys(pass);
        sleep(700);
        loginBtn.click();
        sleep(1000);
    }
    public boolean verification() {
        return logOutBtn.isDisplayed();
    }
}
