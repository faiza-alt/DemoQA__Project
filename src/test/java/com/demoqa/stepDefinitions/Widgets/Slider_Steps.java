package com.demoqa.stepDefinitions.Widgets;

import com.demoqa.pages.Widgets.Slider_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class Slider_Steps {


    Slider_Page slider_page = new Slider_Page(driver);
    @Given("User navigate to the slider ppage")
    public void user_navigate_to_the_slider_ppage() throws InterruptedException {
    slider_page.navigateToSliderPage();
    }
    @Then("User drag the slider")
    public void user_drag_the_slider() {
   slider_page.dragSlider(50,0);
    }
    @Then("He dragged it successfully")
    public void he_dragged_it_successfully() {
    Assert.assertTrue(slider_page.verifySuccess());
    }
}

