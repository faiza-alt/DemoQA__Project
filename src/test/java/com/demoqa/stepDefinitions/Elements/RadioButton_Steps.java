package com.demoqa.stepDefinitions.Elements;

import com.demoqa.pages.Elements.RadioButton_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class RadioButton_Steps {
    RadioButton_Page radioButton_page = new RadioButton_Page(driver);
    @Given("User navigates to the radio button page")
    public void user_navigates_to_the_radio_button_page() {
        radioButton_page.ClickOnRadioBtnTag();
    }
    @Given("User click on radio button")
    public void user_click_on_radio_button() throws InterruptedException {
        radioButton_page.selectRadioBtn("Yes");
    }
    @Then("User clicked successfully")
    public void user_clicked_successfully() {
        Assert.assertTrue(radioButton_page.verifyRadioBtn());
    }
}
