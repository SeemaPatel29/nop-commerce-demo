package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement clickComputer;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement noteBooksLink;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")
    WebElement softwareLink;


    public void clickOnComputer() {
        Reporter.log("Click on Computer" + clickComputer.toString());
        clickOnElement(clickComputer);
        CustomListeners.test.log(Status.PASS, "Click on Computer");
    }


    public String verifyComputerText() {
        Reporter.log("Get text Computer" + computerText.toString());
        CustomListeners.test.log(Status.PASS, "Get text Computer");
        return getTextFromElement(computerText);
    }

    public void clickOnDesktop() {
        Reporter.log("Click on Desktop" + desktop.toString());
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS, "Click on Desktop");
    }

    public String verifyDesktopsText() {
        Reporter.log("Get text Desktops" + desktopText.toString());
        CustomListeners.test.log(Status.PASS, "Get text Desktops");
        return getTextFromElement(desktopText);
    }
    public void clickOnNotebooks() {
        Reporter.log("Click on NoteBooksLink" + noteBooksLink.toString());
        clickOnElement(noteBooksLink);
        CustomListeners.test.log(Status.PASS, "Click on NoteBooksLink");
    }
    public void clickOnSoftWare() {
        Reporter.log("Click on SoftwareLink" + softwareLink.toString());
        clickOnElement(softwareLink);
        CustomListeners.test.log(Status.PASS, "Click on SoftwareLink");
    }


}