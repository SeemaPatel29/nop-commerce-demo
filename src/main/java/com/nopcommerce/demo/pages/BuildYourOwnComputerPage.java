package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement clickOnBuildComputer;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;

    @CacheLookup
    @FindBy(name = "product_attribute_1")
    WebElement processorLink;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareLink;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement priceLink;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement getAddToCartText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement getAddToCartSuccessfull;

    public void clickOnBuildYourOwnComputer(){
        CustomListeners.test.log(Status.PASS, "Click on Build your own computer");
        Reporter.log("Click on Build your own computer" + clickOnBuildComputer.toString());
        clickOnElement(clickOnBuildComputer);
    }


    public String verifyBuildYourOwnComputerText() {
        CustomListeners.test.log(Status.PASS, "Get Text Build your own computer");
        Reporter.log("Get Text Build your own computer" + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor(String processor) {
        Reporter.log("Select 2.2 GHz Intel Pentium Dual-Core E2200" + processor.toString());
        selectByVisibleTextFromDropDown(processorLink,processor);
        CustomListeners.test.log(Status.PASS, "Select 2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectRam(String ram) {
        Reporter.log("Select 8GB [+$60.00]" + ram.toString());
        selectByVisibleTextFromDropDown(ramLink,ram);
        CustomListeners.test.log(Status.PASS, "Select 8GB [+$60.00]");
    }

    public void selectHDD(String hdd) {
        Reporter.log("Select HDD" + hdd.toString());
        clickOnElement(hddLink);
        CustomListeners.test.log(Status.PASS, "Select HDD");
    }

    public void selectOS(String os) {
        Reporter.log("Select OS" + os.toString());
        clickOnElement(osLink);
        CustomListeners.test.log(Status.PASS, "Select OS");
    }

    public void selectSoftware(String software) {
        Reporter.log("Select Software" + software.toString());
        clickOnElement(softwareLink);
        CustomListeners.test.log(Status.PASS, "Select Software");
    }

    public String verifyThePrice(String price) {
        Reporter.log("Verify Price" + price.toString());
        CustomListeners.test.log(Status.PASS, "Verify Price");
        return getTextFromElement(priceLink);
    }

    public void clickOnAddToCart() {
        Reporter.log("Get Text Add to Cart" + getAddToCartText.toString());
        clickOnElement(getAddToCartText);
        CustomListeners.test.log(Status.PASS, "Get Text Add to Cart");
    }

    public String verifyAddToCartSuccessfully() {
        Reporter.log("Get Text Add to Cart Successfully" + getAddToCartText.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Add to Cart");
        return getTextFromElement(getAddToCartSuccessfull);
    }

}
