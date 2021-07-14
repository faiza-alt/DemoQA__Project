package com.demoqa.stepDefinitions.Widgets;

import com.demoqa.pages.Widgets.DatePicker_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class DatePicker_Steps {

    DatePicker_Page datePicker_page = new DatePicker_Page(driver);

    @Given("user navigate to the date Picker page")
    public void user_navigate_to_the_date_picker_page() throws InterruptedException {
   datePicker_page.navigateToDatePickerPage();
    }
    @Then("User pick the date")
    public void user_pick_the_date() throws InterruptedException{
      datePicker_page.pickDate("October 2021", "15");

    }
    @Then("user picked the date successfully")
    public void user_picked_the_date_successfully() {
        Assert.assertTrue(datePicker_page.verifySuccess());

    }
    @Given("user select the date")
    public void user_select_the_date() throws InterruptedException {
    datePicker_page.selectDate("December","2021","24");
    }
    @Then("user successfully selected the date")
    public void user_successfully_selected_the_date() {
        System.out.println("successfully selected");
        Assert.assertTrue(datePicker_page.verifySuccessResponse());
    }


}
