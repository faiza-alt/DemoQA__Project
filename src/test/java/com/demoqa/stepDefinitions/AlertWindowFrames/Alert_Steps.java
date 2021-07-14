package com.demoqa.stepDefinitions.AlertWindowFrames;

import com.demoqa.pages.AlertWindowsFrames.Alert_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class Alert_Steps {

    Alert_Page alert_page = new Alert_Page(driver);
    @Given("User navigate to the alert page")
    public void user_navigate_to_the_alert_page() throws InterruptedException {
       alert_page.navigateAlertPage();
    }
    @Then("user handle the alert")
    public void user_handle_the_alert() throws InterruptedException {
        alert_page.alert();
        alert_page.timeAlert();
        alert_page.confirmAlert();
        sleep(600);
        alert_page.promptAlert();
    }
    @Then("User should successfully handle it")
    public void user_should_successfully_handle_it() {
        Assert.assertTrue(alert_page.verifySuccessResponse());
    }

}
