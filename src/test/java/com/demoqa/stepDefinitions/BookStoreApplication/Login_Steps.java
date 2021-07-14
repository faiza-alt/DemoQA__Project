package com.demoqa.stepDefinitions.BookStoreApplication;

import com.demoqa.pages.BookStoreApplication.Login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;

public class Login_Steps {

    Login_Page login_page = new Login_Page(driver);

    @Given("User is on the home page of Book store Application")
    public void user_is_on_the_home_page_of_book_store_application() throws InterruptedException {
        login_page.homePage();
    }
    @When("User enter {string} user name and {string} Password to login")
    public void user_enter_user_name_and_password_to_login(String user, String password) throws InterruptedException {
        login_page.navigateToLoginPage();
        login_page.enterCredentials(user, password);
    }
    @Then("User should be able to login successfully")
    public void user_should_be_able_to_login_successfully() {
        Assert.assertTrue(login_page.verification());
    }
}
