package com.demoqa.stepDefinitions.Elements;

import com.demoqa.pages.Elements.DynamicProperties_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class DynamicProperties_Steps {


    DynamicProperties_Page dynamicProperties_page = new DynamicProperties_Page(driver);
    @Given("User navigates to the dynamic properties page")
    public void user_navigates_to_the_dynamic_properties_page() throws InterruptedException {
       dynamicProperties_page.navigateTODynamicPropPage();
    }
    @Given("User click on dynamic button")
    public void user_click_on_dynamic_button() throws InterruptedException {
        dynamicProperties_page.clickOnDynamicBtn();

    }
    @Then("User clicked on dynamic button successfully")
    public void user_clicked_on_dynamic_button_successfully() {
        Assert.assertTrue(dynamicProperties_page.verifySuccess());
    }


}
