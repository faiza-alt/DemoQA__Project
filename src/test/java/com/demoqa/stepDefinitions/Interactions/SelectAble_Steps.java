package com.demoqa.stepDefinitions.Interactions;

import com.demoqa.pages.Interactions.SelectAble_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class SelectAble_Steps {

    SelectAble_Page selectAble_page = new SelectAble_Page(driver);
    @Given("user navigate to the interactions page")
    public void user_navigate_to_the_interactions_page() throws InterruptedException {
        selectAble_page.clickOnSelectable();
        System.out.println("select me ");
    }
    @Given("user select specific option")
    public void user_select_specific_option() {
        selectAble_page.selectOptions("Porta ac consectetur ac");
    }
    @Then("user selected successfully")
    public void user_selected_successfully() {
       Assert.assertTrue(selectAble_page.verifySelection());
    }

}
