package com.demoqa.stepDefinitions.AlertWindowFrames;

import com.demoqa.pages.AlertWindowsFrames.LargeModal_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
public class LargeModal_Steps {
    LargeModal_Page largeModal_page = new LargeModal_Page(driver);
    @When("User try to Handle with large modal")
    public void user_try_to_handle_with_large_modal() {
   largeModal_page.openTheLargeModal();
    }
    @Then("User should be able to handle it successfully")
    public void user_should_be_able_to_handle_it_successfully() {
    largeModal_page.verification();
    }
}
