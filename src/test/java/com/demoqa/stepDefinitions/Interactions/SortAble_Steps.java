package com.demoqa.stepDefinitions.Interactions;

import com.demoqa.pages.Interactions.SortAble_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class SortAble_Steps {

    SortAble_Page sortAble_page = new SortAble_Page(driver);
    @Given("user navigate to the sortable page")
    public void user_navigate_to_the_sortable_page() throws InterruptedException {
        sortAble_page.navigateToTheSortablePage();
    }
    @Given("user click on sortable")
    public void user_click_on_sortable() throws InterruptedException {
        sortAble_page.sortTheOption("one");

    }
    @Then("user sorted successfully")
    public void user_sorted_successfully() {
        System.out.println("sorted Successfully");
    }
}
