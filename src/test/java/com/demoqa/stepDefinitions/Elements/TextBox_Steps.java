package com.demoqa.stepDefinitions.Elements;

import com.demoqa.pages.Elements.TextBox_Page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;
import static java.lang.Thread.sleep;

public class TextBox_Steps {

    TextBox_Page textBox_page = new TextBox_Page(driver);

    @Given("User navigate to the elements page")
    public void user_navigate_to_the_elements_page() {
        textBox_page.clickOnTextBox();
    }

    @Given("User enter text in the textBox")
    public void user_enter_text_in_the_text_box(DataTable dataTable) {
        List<String> data = dataTable.asList();
        textBox_page.fillTextBoxes(data.get(0), data.get(1), data.get(2), data.get(3));
    }
    @When("System should let the user to enter text")
    public void system_should_let_the_user_to_submit_text() throws InterruptedException {
        sleep(300);
        textBox_page.clickOnSubmitBtn();
    }

    @Then("User entered text successfully")
    public void user_entered_text_successfully() {
        Assert.assertTrue(textBox_page.verifyTextBoxFeature());
    }
}
