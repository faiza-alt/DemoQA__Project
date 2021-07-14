package com.demoqa.stepDefinitions.BookStoreApplication;

import com.demoqa.pages.BookStoreApplication.BookStoreSearch_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.demoqa.base.Hook.*;
public class BookStoreSearch_Steps {

    BookStoreSearch_Page bookStoreSearch_page = new BookStoreSearch_Page(driver);
    @When("User navigate to the search page")
    public void user_navigate_to_the_search_page() throws InterruptedException {
      bookStoreSearch_page.navigateToTheSearchPage();
    }
    @Then("User search book on store searchBox")
    public void user_search_book_on_store_search_box() {
    bookStoreSearch_page.searchBook();
    }
    @And("User should be able to search the book")
    public void user_should_be_able_to_search_the_book() {
   bookStoreSearch_page.verification();
    }

}
