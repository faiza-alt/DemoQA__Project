package com.demoqa.stepDefinitions.AlertWindowFrames;

import com.demoqa.pages.AlertWindowsFrames.Window_Browser_Page;
import io.cucumber.java.en.*;
import org.testng.Assert;
import static com.demoqa.base.Hook.*;
public class Window_Browser_Steps {

   Window_Browser_Page window_browser_page = new Window_Browser_Page(driver);
    @When("user handle the Window browser")
    public void user_handle_the_window_browser() throws InterruptedException {
        window_browser_page.newWindow();
    }
    @Then("User successfully handled Window browser")
    public void user_successfully_handled_window_browser() {
     Assert.assertTrue( window_browser_page.successResponse());
    }
}

