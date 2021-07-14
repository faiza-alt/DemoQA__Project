package com.demoqa.stepDefinitions.Widgets;

import com.demoqa.pages.Widgets.AutoComplete_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class AutoComplete_Steps {

    AutoComplete_Page autoComplete_page = new AutoComplete_Page(driver);
    @Given("User navigate to autoCompletePage")
    public void user_navigate_to_auto_complete_page() throws InterruptedException {
        autoComplete_page.navigateToAutoCompletePage();
    }
    @Then("User search some item")
    public void user_search_some_item() throws InterruptedException {
        autoComplete_page.searchColor();
    }
    @Then("User did autoComplete action successfully")
    public void user_did_auto_complete_action_successfully() {
       Assert.assertTrue(autoComplete_page.verifySuccessMsg());
    }
}
