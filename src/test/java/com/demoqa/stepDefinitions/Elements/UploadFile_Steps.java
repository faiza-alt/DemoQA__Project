package com.demoqa.stepDefinitions.Elements;

import com.demoqa.pages.Elements.UploadFile_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;

public class UploadFile_Steps {

    UploadFile_Page uploadFile_page = new UploadFile_Page(driver);
    @Given("user navigates to the upload page")
    public void user_navigates_to_the_upload_page() throws InterruptedException {
        uploadFile_page.navigateToUploadPage();

    }
    @Given("user click on upload file")
    public void user_click_on_upload_file() throws InterruptedException {
        uploadFile_page.clickOnUpLoad( "C:\\Users\\ramza\\OneDrive\\Pictures\\AzalPic.jpg");;

    }
    @Then("User should upload file successfully")
    public void user_should_upload_file_successfully() {
        Assert.assertTrue(uploadFile_page.verifySuccessUpload());
    }
}
