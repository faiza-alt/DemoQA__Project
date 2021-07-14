package com.demoqa.stepDefinitions.Elements;

import com.demoqa.pages.Elements.WebTable_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.demoqa.base.Hook.*;
public class WebTable_Steps {

 WebTable_Page webTable_page = new WebTable_Page(driver);

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
    webTable_page.navigateToTheWebTablePage();
    }
    @When("User navigate to the web Table page")
    public void user_navigate_to_the_web_table_page() {
    }
    @Then("User try to handle the page")
    public void user_try_to_handle_the_page() {
    webTable_page.getRows();
    webTable_page.gettingCellData();
    }
    @Then("User should successfully handle the table")
    public void user_should_successfully_handle_the_table() {

    }
}
