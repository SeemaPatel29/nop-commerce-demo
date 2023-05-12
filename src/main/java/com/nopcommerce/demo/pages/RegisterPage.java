package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath= "//input[@id='gender-male']")
    WebElement maleRadio;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement selectDay;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement selectMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement selectYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]")
    WebElement registerMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueLink;


    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstnameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastnameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordError;


    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;


    public void selectGender(){
        CustomListeners.test.log(Status.PASS,"Select Gender");
        Reporter.log("Select Gender" + maleRadio.toString());
        clickOnElement(maleRadio);
    }
    public void enterFirstname(String firstName){
        CustomListeners.test.log(Status.PASS,"Enter FirstName");
        Reporter.log("Enter FirstName" + firstNameLink.toString());
        sendTextToElement(firstNameLink,firstName);
    }
    public void enterLastname(String name){
        CustomListeners.test.log(Status.PASS,"Enter LastName");
        Reporter.log("Enter LastName" + lastNameLink.toString());
        sendTextToElement(lastNameLink,name);
    }

    public void selectDayFromDropDown() {
        CustomListeners.test.log(Status.PASS, "Select Day From DropDown");
        Reporter.log("Select Day From DropDown" + selectDay.toString());
        selectByVisibleTextFromDropDown(selectDay,"1");
    }
    public void selectMonthFromDropDown() {
        CustomListeners.test.log(Status.PASS, "Select Month From DropDown");
        Reporter.log("Select Month From DropDown" + selectMonth.toString());
        selectByVisibleTextFromDropDown(selectMonth,"January");
    }
    public void selectYearFromDropDown() {
        CustomListeners.test.log(Status.PASS, "Select Year From DropDown");
        Reporter.log("Select Year From DropDown" + selectDay.toString());
        selectByVisibleTextFromDropDown(selectYear,"1980");
    }

    public void enterEmail(String email){
        CustomListeners.test.log(Status.PASS,"Enter Email");
        Reporter.log("Enter Email" + emailLink.toString());
        sendTextToElement(emailLink,email);
    }
    public void enterPassword(String password){
        CustomListeners.test.log(Status.PASS,"Enter Password");
        Reporter.log("Enter Password" + passwordLink.toString());
        sendTextToElement(passwordLink,password);
    }
    public void enterConfirmPassword(String password){
        CustomListeners.test.log(Status.PASS,"Enter Confirm Password");
        Reporter.log("Enter Confirm Password" + confirmPasswordLink.toString());
        sendTextToElement(confirmPasswordLink,password);
    }
    public void clickOnRegister(){
        CustomListeners.test.log(Status.PASS,"Click On Register");
        Reporter.log("Click On Register" + registerButton.toString());
        clickOnElement(registerButton);
    }
    public String getRegisterMessage(){
        CustomListeners.test.log(Status.PASS,"verify Register text");
        Reporter.log("verify Register text" + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
    public void clickOnContinue(){
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        Reporter.log("Click on Continue" + continueLink.toString());
        clickOnElement(continueLink);
    }
    public String verifyFirstNameError(){
        CustomListeners.test.log(Status.PASS,"First name is required");
        Reporter.log("First name is required" + firstnameError.toString());
        return getTextFromElement(firstnameError);
    }
    public String verifyLastNameError() {
        CustomListeners.test.log(Status.PASS, "Last name is required");
        Reporter.log("Last name is required" + lastnameError.toString());
        return getTextFromElement(lastnameError);
    }

    public String verifyEmailError() {
        CustomListeners.test.log(Status.PASS, "Email is required");
        Reporter.log("Email is required" + emailError.toString());
        return getTextFromElement(emailError);
    }
    public String verifyPasswordError() {
        CustomListeners.test.log(Status.PASS, "Password is required");
        Reporter.log("Password is required" + passwordError.toString());
        return getTextFromElement(passwordError);
    }
    public String verifyConfirmPasswordError() {
        CustomListeners.test.log(Status.PASS, "Confirm Password is required");
        Reporter.log("Confirm Password is required" + confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);
    }
}
