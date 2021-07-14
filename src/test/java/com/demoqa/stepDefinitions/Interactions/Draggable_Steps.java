package com.demoqa.stepDefinitions.Interactions;

import com.demoqa.pages.Interactions.Draggable_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class Draggable_Steps {

 Draggable_Page draggable_page = new Draggable_Page(driver);
    @Given("User navigate to the draggable page")
    public void user_navigate_to_the_draggable_page() throws InterruptedException {
     draggable_page.navigateToDraggingPage();
    }
    @Given("user drag the element")
    public void user_drag_the_element() throws InterruptedException {
        draggable_page.dragMe();
        System.out.println("drag me");
    }
    @Then("user dragged it successfully")
    public void user_dragged_it_successfully() {
        System.out.println("drag me");
    }
}
