package com.demoqa.stepDefinitions.Widgets;

import com.demoqa.pages.Widgets.Tabs_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.demoqa.base.Hook.*;
public class Tabs_Steps {

 Tabs_Page tabs_page = new Tabs_Page(driver);
    @Given("User is on the demoQa home page")
    public void user_is_on_the_demo_qa_home_page() throws InterruptedException {
        tabs_page.homePage();
    }
    @When("User navigates to the Tabs Page")
    public void user_navigates_to_the_tabs_page() throws InterruptedException {
  tabs_page.navigateToTabsPage();
    }
    @Then("User handle the tabs")
    public void user_handle_the_tabs() {
    tabs_page.handlingTabs();
    }
    @Then("He should successfully  handle")
    public void he_should_successfully_handle() {

    }
}
