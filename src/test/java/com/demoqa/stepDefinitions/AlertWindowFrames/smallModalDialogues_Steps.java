package com.demoqa.stepDefinitions.AlertWindowFrames;
import com.demoqa.pages.AlertWindowsFrames.smallModalDialogues_Pages;
import io.cucumber.java.en.*;
import static com.demoqa.base.Hook.*;
public class smallModalDialogues_Steps {

    smallModalDialogues_Pages smallModalDialogues_pages = new smallModalDialogues_Pages(driver);
    @When("User navigate to the Modal Dialogue Page")
    public void user_navigate_to_the_modal_dialogue_page() {
       smallModalDialogues_pages.navigateToTheDialoguePage();
    }
    @Then("User try to Handle with it")
    public void user_try_to_handle_with_it() throws InterruptedException {
   smallModalDialogues_pages.smallModalHandling();
    }
    @And("User should be able to do it successfully")
    public void user_should_be_able_to_do_it_successfully() {
    smallModalDialogues_pages.verification();
    }
}
