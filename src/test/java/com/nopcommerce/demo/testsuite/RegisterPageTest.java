package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {


    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        registerPage = new RegisterPage();
        homePage =new HomePage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
//         Click on Register Link
        homePage.clickOnRegisterLink();
//    Verify "Register" text
        registerPage.getRegisterMessage();
    }


    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){

//         Click on Register Link
        homePage.clickOnRegisterLink();
//    Click on "REGISTER" button
        registerPage.clickOnRegister();
//    Verify the error message "First name is required."
        registerPage.verifyFirstNameError();
//    Verify the error message "Last name is required."
        registerPage.verifyLastNameError();
//    Verify the error message "Email is required."
        registerPage.verifyEmailError();
//    Verify the error message "Password is required."
        registerPage.verifyPasswordError();
//    Verify the error message "Password is required."
        registerPage.verifyConfirmPasswordError();
    }


    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
//        Click on Register Link
        homePage.clickOnRegisterLink();
//    Select gender "Female"
        registerPage.selectGender();
//    Enter firstname
        registerPage.enterFirstname("Hess");
//    Enter lastname
        registerPage.enterLastname("Garris");
//    Select day
        registerPage.selectDayFromDropDown();
        Thread.sleep(2000);
//    Select month
        registerPage.selectMonthFromDropDown();
//    Select year
        registerPage.selectYearFromDropDown();
//    Enter email
        registerPage.enterEmail("Hgarris123@gmail.com");
//    Enter password
        registerPage.enterPassword("gabc123@");
//    Enter Confirm Password
        registerPage.enterConfirmPassword("gabc123@");
//    Click on "REGISTER" button
        registerPage.clickOnRegister();
//    Verify message "Your registration completed"

    }

    }


