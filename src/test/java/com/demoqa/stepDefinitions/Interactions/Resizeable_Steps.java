package com.demoqa.stepDefinitions.Interactions;

import com.demoqa.pages.Interactions.Resizeable_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class Resizeable_Steps {

        Resizeable_Page resizeable_page = new Resizeable_Page(driver);
    @Given("user navigate to the resizeable page")
    public void user_navigate_to_the_resizeable_page() throws InterruptedException {
        resizeable_page.navigateResizePage();
        System.out.println("resize me ");
    }
    @Then("user resize the element")
    public void user_resize_the_element() throws InterruptedException {
        resizeable_page.resize();
        System.out.println("resize me ");
    }
    @Then("user successfully resized")
    public void user_successfully_resized() {
        System.out.println("resize successfully");
    }

}
