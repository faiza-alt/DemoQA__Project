package com.demoqa.stepDefinitions.Elements;

import com.demoqa.pages.Elements.Buttons_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class Buttons_Steps {

    Buttons_Page buttons_page = new Buttons_Page(driver);
    @Given("User navigates to the button page")
    public void user_navigates_to_the_button_page() throws InterruptedException {
    buttons_page.navigateToButtonsPage();
        System.out.println("buttons");
    }
    @Given("User click on different  buttons")
    public void user_click_on_different_buttons() {
        buttons_page.clickOnButton("Click me");
        System.out.println("buttons");
    }
    @Then("User should click Successfully")
    public void user_should_click_successfully() {
        buttons_page.verifyClickButtons();
        System.out.println("buttons");
    }


}
