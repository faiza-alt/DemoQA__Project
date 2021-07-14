package com.demoqa.stepDefinitions.Widgets;

import com.demoqa.pages.Interactions.SelectAble_Page;
import com.demoqa.pages.Widgets.SelectMenu_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.demoqa.base.Hook.*;
public class SelectMenu_Steps {

  SelectMenu_Page selectMenu_page = new SelectMenu_Page(driver);
    @Given("User is on home page")
    public void user_is_on_home_page() throws InterruptedException {
    selectMenu_page.homePage();;
    }
    @When("user navigate to select menu page")
    public void user_navigate_to_select_menu_page() throws InterruptedException {
    selectMenu_page.navigateToSelectMenuPage();
    }
    @When("user select different drop downs")
    public void user_select_different_drop_downs() throws InterruptedException {
    selectMenu_page.dropDowns();
    }
    @Then("User should able to select all")
    public void user_should_able_to_select_all() {

    }
}
