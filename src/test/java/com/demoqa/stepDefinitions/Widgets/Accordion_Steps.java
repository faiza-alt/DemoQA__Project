package com.demoqa.stepDefinitions.Widgets;
import com.demoqa.pages.Widgets.Accordion_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;
public class Accordion_Steps {
    Accordion_Page accordion_page = new Accordion_Page(driver);
    @Given("User navigates to accordion page")
    public void user_navigates_to_accordion_page() throws InterruptedException {
        accordion_page.navigateToAccordionPage();
    }
    @Given("User click on accordions")
    public void user_click_on_accordions() throws InterruptedException {
        accordion_page.clickOnAccordion();
    }
    @Then("User clicked accordions successfully")
    public void user_clicked_accordions_successfully() {
        Assert.assertTrue(accordion_page.verifyAccordion());
    }
}
