package com.demoqa.pages;

import com.demoqa.helper.Utilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;

public class Forms_Page {
    @FindBy(xpath = "(//div[@class='header-right'])[2]")
    WebElement FormBtn;

    @FindBy(xpath = "//span[text()='Practice Form']")
    WebElement formPageTag;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement eMail;

    @FindBy(xpath = "//input[@id='userNumber']")
    WebElement phoneNum;


    @FindBy(xpath = "//div//label[contains(@for,'gender-radio')]")
    List<WebElement> genderRadioBtns;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    WebElement dateOfBirthBox;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    WebElement selectMonth;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    WebElement selectYear;

    @FindBy(xpath = "//div[@class='react-datepicker__month']//div")
    List<WebElement> days;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    WebElement subjectBox;

    @FindBy(xpath = "//label[contains(@for,'hobbies-checkbox')]")
    List<WebElement> hobbies;


    @FindBy(xpath = "//input[@id='uploadPicture']")
    WebElement picUploadLocation;


    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement address;

    @FindBy(xpath = "//div[@class=' css-tlfecz-indicatorContainer']")
    WebElement stateDropDown;

    @FindBy(xpath = "//div[text()='Uttar Pradesh']")
    WebElement stateOpt;

    @FindBy(xpath = "//div[text()='Lucknow']")
    WebElement cityOpt;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//div[text()='Thanks for submitting the form']")
    WebElement successMessage;


    public Forms_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void navigateToTheFormPage() throws InterruptedException {
        Utilities.scrollIntoView(FormBtn);
        FormBtn.click();
        sleep(300);
        formPageTag.click();
    }

    public void fillTheTextOfForm(String FirstName, String LastName, String Email, String phoneNumber) {
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);
        eMail.sendKeys(Email);
        phoneNum.sendKeys(phoneNumber);

    }

    public void selectGender(String gender) {

        for (WebElement btn : genderRadioBtns) {
            if (btn.getText().equalsIgnoreCase(gender)) {
                btn.click();
                break;
            }
        }
    }


    public void selectDate(String month,  String day, String year) {
        dateOfBirthBox.click();
        Select select = new Select(selectMonth);
        select.selectByVisibleText(month);
        Select slect = new Select(selectYear);
        slect.selectByVisibleText(year);

        for (WebElement Day : days) {
            if (Day.getText().equalsIgnoreCase(day)) {
                Day.click();
                break;
            }
        }
    }

    public void selectSubject(String subject1, String subject2) throws InterruptedException {

        subjectBox.sendKeys(subject1);
        subjectBox.sendKeys(Keys.ENTER);
        sleep(300);
        subjectBox.sendKeys(subject2);
        subjectBox.sendKeys(Keys.ENTER);

    }

    public void checkHobbiesBox(String Hobby) {
        for (WebElement hobby : hobbies) {
            hobby.click();
            if (hobby.getText().equalsIgnoreCase(Hobby) && !hobby.isSelected()) {
                break;
            }
        }
    }

    public void uploadPicture(String picLocation) throws InterruptedException {
        picUploadLocation.sendKeys(picLocation);
        Utilities.scrollIntoView(picUploadLocation);
    }

    public void currentAddress(String Address) {
        address.sendKeys(Address);
    }

    public void selectCityAndState() throws InterruptedException {
        stateDropDown.click();
        stateOpt.click();

        sleep(300);
        stateDropDown.click();
        cityOpt.click();

    }

    public void submitForm(){
    submitBtn.click();
    }

    public boolean successResponseIsDisplayed(){
        return successMessage.isDisplayed();
    }
}

