package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    List<WebElement> topMenuTab;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement  nopcommercelogo;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;


    public void selectMenu(String menu) {
        try {
            List<WebElement> list = topMenuTab;
            for (WebElement listOfElement : list) {
                if (listOfElement.getText().equals(menu)) {
                    listOfElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> list = topMenuTab;
        }
        CustomListeners.test.log(Status.PASS, "Click on Top Menu");
        Reporter.log("Click on Top Menu" + topMenuTab.toString());
    }

    public void clickOnLoginLink(){
        CustomListeners.test.log(Status.PASS, "Click on LoginLink");
        Reporter.log("Click on LoginLink" + loginLink.toString());
        clickOnElement(loginLink);

    }
    public void clickOnRegisterLink(){
        CustomListeners.test.log(Status.PASS, "Click on RegisterLink");
        Reporter.log("Click on RegisterLink" + registerLink.toString());
        clickOnElement(registerLink);
    }
    public String verifyLogo(){
        CustomListeners.test.log(Status.PASS, "Verify Logo");
        Reporter.log("Verify Logo" + nopcommercelogo.toString());
        return getTextFromElement(nopcommercelogo);
    }
    public void clickOnMyAccountLink(){
        CustomListeners.test.log(Status.PASS, "Click on My AccountLink");
        Reporter.log("Click on My AccountLink" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }
    public void clickOnLogOutLink(){
        CustomListeners.test.log(Status.PASS, "Click on LogoutLink");
        Reporter.log("Click on LogoutLink" + logoutLink.toString());
        clickOnElement(logoutLink);
    }
    }

