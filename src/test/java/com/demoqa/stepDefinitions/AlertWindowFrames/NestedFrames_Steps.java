package com.demoqa.stepDefinitions.AlertWindowFrames;

import com.demoqa.pages.AlertWindowsFrames.NestedFrames_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
public class NestedFrames_Steps {

    NestedFrames_Page nestedFrames_page = new NestedFrames_Page(driver);
    @When("User navigate to the nested frame page")
    public void user_navigate_to_the_nested_frame_page() {
      nestedFrames_page.navigateToTheNestedFramePage();
    }
    @Then("user try to handle the nested frame")
    public void user_try_to_handle_the_nested_frame() {
    nestedFrames_page.nestedFrameHandling();
    }
    @Then("User should be able to successfully handle the nested frames")
    public void user_should_be_able_to_successfully_handle_the_nested_frames() {
        Assert.assertTrue(nestedFrames_page.verifyFrames().contains("Child Iframe"));
    }

}
