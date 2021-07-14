package com.demoqa.stepDefinitions.Widgets;

import com.demoqa.pages.Widgets.ToolTip_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
public class ToolTip_Steps {

 ToolTip_Page toolTip_page = new ToolTip_Page(driver);
    @Given("User is on home page of demoqa")
    public void user_is_on_home_page_of_demoqa() throws InterruptedException {
    toolTip_page.homePage();
    }
    @When("user navigates to the tool tip page")
    public void user_navigates_to_the_tool_tip_page() throws InterruptedException {
   toolTip_page.navigateToToolTipPage();
    }
    @When("user handle the tool tip")
    public void user_handle_the_tool_tip() {
    toolTip_page.handleToolTip();
    }
    @Then("user should be able to handle it successfully")
    public void user_should_be_able_to_handle_it_successfully() {
        Assert.assertTrue(toolTip_page.verify());
    }
}
