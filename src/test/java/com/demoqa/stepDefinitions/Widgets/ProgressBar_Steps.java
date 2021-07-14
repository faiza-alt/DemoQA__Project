package com.demoqa.stepDefinitions.Widgets;

import com.demoqa.pages.Widgets.ProgressBar_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class ProgressBar_Steps {

    ProgressBar_Page progressBar_page = new ProgressBar_Page(driver);
    @Given("user navigate to progress bar page")
    public void user_navigate_to_progress_bar_page() throws InterruptedException {
   progressBar_page.navigateToProgressBarPage();

    }
    @Then("user handle progress bar")
    public void user_handle_progress_bar() throws InterruptedException {
    progressBar_page.handleButton();

    }
    @Then("User handled it successfully")
    public void user_handled_it_successfully() {


    }
}
