package com.demoqa.stepDefinitions.WebsiteFeatureSteps;

import com.demoqa.pages.WebsiteFeatures.VerifyLinks_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.demoqa.base.Hook.*;
public class VerifyLinks_Steps {

   VerifyLinks_Page verifyLinks_page = new VerifyLinks_Page(driver);
    @Given("user is on home page")
    public void user_is_on_home_page() {
    verifyLinks_page.navigateToHomePage();
    }
    @When("User is verifying links")
    public void user_is_verifying_links() throws InterruptedException {
    verifyLinks_page.verifyLinks();
    }
    @Then("user should verify links successfully")
    public void user_should_verify_links_successfully() {

    }
}
