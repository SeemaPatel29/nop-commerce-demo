package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByPosition;
    // By sortByPosition = By.id("products-orderby");
    @CacheLookup
    @FindBy(tagName = "h2")
    List<WebElement> productList;
    //By productList = By.tagName("h2");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;
    //By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[2]/button[1]");


    public void sortByPositionByNameZtoA() {
        Reporter.log("Select sort by Product list" + sortByPosition.toString());
        CustomListeners.test.log(Status.PASS, "Select sort by Product list");
        selectByValueFromDropDown(sortByPosition, "6");
    }

    public ArrayList<String> defaultProductList() {
        // Get all the products name and stored into array list
        List<WebElement> products = productList;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        Reporter.log("Product list" + products.toString());
        CustomListeners.test.log(Status.PASS, "Product list");
        return originalProductsName;
    }

    public void clickOnAddToCart() {
        Reporter.log("Click on Add to Cart" + addToCart.toString());
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS, "Click on Add to Cart");
    }


}
