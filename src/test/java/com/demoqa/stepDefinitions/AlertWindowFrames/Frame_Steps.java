package com.demoqa.stepDefinitions.AlertWindowFrames;

import com.demoqa.pages.AlertWindowsFrames.Frame_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
public class Frame_Steps {

    Frame_Page frame_page = new Frame_Page(driver);
    @Given("User is on the home page of demoqa")
    public void user_is_on_the_home_page_of_demoqa() throws InterruptedException {
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        frame_page.atPageOfFrames();
    }
    @When("User navigate to the frame page")
    public void user_navigate_to_the_frame_page() {
   frame_page.navigateToFramePage();
    }
    @Then("user try to handle the frame")
    public void user_try_to_handle_the_frame() {
  frame_page.handleTheFrame();
    }
    @Then("User should be able to successfully handle the frames")
    public void user_should_be_able_to_successfully_handle_the_frames() {
        Assert.assertTrue(frame_page.verifyFrame());
    }
}
