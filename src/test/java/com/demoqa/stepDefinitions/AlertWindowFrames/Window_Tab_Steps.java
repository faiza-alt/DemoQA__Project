package com.demoqa.stepDefinitions.AlertWindowFrames;
import com.demoqa.pages.AlertWindowsFrames.Windows_Tab_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.demoqa.base.Hook.*;
public class Window_Tab_Steps {

    Windows_Tab_Page windows_page = new Windows_Tab_Page(driver);
    @Given("User navigate to the Window page")
    public void user_navigate_to_the_window_page() throws InterruptedException {
        windows_page.navigateToTheWindowPage();
    }
    @Then("user handle the Window tab")
    public void user_handle_the_window_tab() throws InterruptedException {
        windows_page.navigateToNewTab();
    }
    @Then("User successfully handled Window")
    public void user_successfully_handled_window() {
        windows_page.successResponse();
    }
}
