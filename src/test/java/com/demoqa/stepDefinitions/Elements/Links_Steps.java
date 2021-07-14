package com.demoqa.stepDefinitions.Elements;
import com.demoqa.pages.Elements.Links_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;
public class Links_Steps {
    Links_Page links_page = new Links_Page(driver);
    @Given("User navigate to links page")
    public void user_navigate_to_links_page() throws InterruptedException {
        links_page.clickOnLinksPage();
    }
    @Given("User click on link")
    public void user_click_on_link() throws InterruptedException {
        links_page.clickOnLinks();
    }
    @Then("User should click links successfully")
    public void user_should_click_links_successfully(){
        System.out.println("Links");
    }
}
