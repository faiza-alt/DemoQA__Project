package com.demoqa.stepDefinitions.Elements;

import com.demoqa.pages.Elements.CheckBox_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class CheckBox_Steps {

    CheckBox_Page checkBox_page = new CheckBox_Page(driver);

    @Given("User select the check boxes")
    public void user_select_the_check_boxes() throws InterruptedException {
        checkBox_page.clickOnCheckBox();
        checkBox_page.clickOnCollapseBtn();
        checkBox_page.selectCheckBoxes("desktop");
        System.out.println("checkbox");
    }

    @Then("User selected Checkboxes successfully")
    public void user_selected_checkboxes_successfully() {
        Assert.assertTrue(checkBox_page.verifySelectedCheckBox());
        System.out.println("checkbox");
    }
}
