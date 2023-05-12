package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;



    public void clickOnLoginButton(){
        CustomListeners.test.log(Status.PASS,"Click on Login Button");
        Reporter.log("Click on Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getWelcomeText(String expected){
        CustomListeners.test.log(Status.PASS,"Get Welcome Text");
        Reporter.log("Get Welcome Text" + welcomeText.toString());
        String  actual= getTextFromElement(welcomeText);
        Assert.assertEquals(expected,actual);
        return getTextFromElement(welcomeText);
    }
    public void enterEmailId(String email){
        CustomListeners.test.log(Status.PASS,"Enter Email ID");
        Reporter.log("Enter Email ID" + emailField.toString());
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        CustomListeners.test.log(Status.PASS,"Enter Password");
        Reporter.log("Enter Password" + loginButton.toString());
        sendTextToElement(passwordField,password);
    }
    public String getErrorMessage(String expected) {
        CustomListeners.test.log(Status.PASS, "Get Welcome Text");
        Reporter.log("Get Welcome Text" + errorMessage.toString());
        String  actual= getTextFromElement(errorMessage);
        Assert.assertEquals(expected,actual);
        return getTextFromElement(errorMessage);
    }

    public void verifyOnLogOutLink() {
        CustomListeners.test.log(Status.PASS, "Click on LogoutLink");
        Reporter.log("Click on LogoutLink" + logoutLink.toString());
        clickOnElement(logoutLink);
    }

    }







