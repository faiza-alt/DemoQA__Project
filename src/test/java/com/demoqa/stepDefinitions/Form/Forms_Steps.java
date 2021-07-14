package com.demoqa.stepDefinitions.Form;

import com.demoqa.pages.Forms_Page;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

import static com.demoqa.base.Hook.*;
import static java.lang.Thread.sleep;

public class Forms_Steps {
    Forms_Page forms_page = new Forms_Page(driver);

    @Given("User navigate to the form page")
    public void user_navigate_to_the_form_page() throws InterruptedException {
        forms_page.navigateToTheFormPage();
    }

    @Given("User fill the form with valid info")
    public void user_fill_the_form_with_valid_info(DataTable dataTable) throws InterruptedException {
        List<String> data = dataTable.asList();
        forms_page.fillTheTextOfForm(data.get(0), data.get(1), data.get(2), data.get(3));

        forms_page.selectGender(data.get(4));

        String[] dob = data.get(5).split(" ");
        forms_page.selectDate(dob[0], dob[1], dob[2]);


        String[] subject = data.get(6).split(" ");
        forms_page.selectSubject(subject[0], subject[1]);

        forms_page.checkHobbiesBox(data.get(7));
        forms_page.uploadPicture(data.get(8));
        sleep(3000);
        forms_page.currentAddress(data.get(9));
        forms_page.selectCityAndState();
        forms_page.submitForm();

    }

    @Then("user should successfully submit the form")
    public void user_should_successfully_submit_the_form() {
        Assert.assertTrue(forms_page.successResponseIsDisplayed());

    }

}
