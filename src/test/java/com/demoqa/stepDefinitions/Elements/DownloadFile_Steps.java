package com.demoqa.stepDefinitions.Elements;
import com.demoqa.pages.Elements.DownloadFile_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

import static com.demoqa.base.Hook.*;
import static com.demoqa.base.Hook.driver;
public class DownloadFile_Steps {

    DownloadFile_Page downloadFile_page = new DownloadFile_Page(driver);

    @Given("user navigates to the download page")
    public void user_navigates_to_the_download_page() throws InterruptedException {
        downloadFile_page.navigateToDownloadPage();
    }
    @Given("user click on download")
    public void user_click_on_download() {
        downloadFile_page.clickOnDownload();
    }
    @Then("User should download file successfully")
    public void user_should_download_file_successfully() throws IOException, InterruptedException {
        downloadFile_page.verifyDownload();
        System.out.println("File is downloaded");
    }
}
