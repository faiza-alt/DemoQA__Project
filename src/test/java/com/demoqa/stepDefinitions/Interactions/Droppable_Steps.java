package com.demoqa.stepDefinitions.Interactions;

import com.demoqa.pages.Interactions.Droppable_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class Droppable_Steps {

    Droppable_Page droppable_page = new Droppable_Page(driver);

    @Given("user navigate to droppable page")
    public void user_navigate_to_droppable_page() throws InterruptedException {
        droppable_page.navigateToDropPage();
    }

    @Then("user drop the element")
    public void user_drop_the_element() {
        droppable_page.dragMeAndDrop();
    }

    @Then("user successfully dropped it")
    public void user_successfully_dropped_it() {
        Assert.assertTrue(droppable_page.verifyDropped());
    }
}
