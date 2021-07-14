package com.demoqa.stepDefinitions.AlertWindowFrames;

import com.demoqa.pages.AlertWindowsFrames.NewWindowMessage_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
public class NewWindowMessage_Steps {

    NewWindowMessage_Page newWindowMessage_page = new NewWindowMessage_Page(driver);
    @When("user handle the new Window message browser")
    public void user_handle_the_new_window_message_browser() throws InterruptedException {
     newWindowMessage_page.navigateToNewTab();
    }
    @Then("User should successfully handle the  Window browser message")
    public void user_should_successfully_handle_the_window_browser_message() {
        Assert.assertTrue(newWindowMessage_page.verifySuccess());
    }
}
