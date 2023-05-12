package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        computerPage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
//       Click on Computer tab
        computerPage.clickOnComputer();
//       Verify "Computer" text
        computerPage.verifyComputerText();
    }


    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
//        Click on Computer tab
        computerPage.clickOnComputer();
//    Click on Desktops link
        computerPage.clickOnDesktop();
//    Verify "Desktops" text
        computerPage.verifyDesktopsText();
    }

    @Test(dataProvider = "BuildComputer",dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software){
//        Click on Computer tab
        computerPage.clickOnComputer();
//    Click on Desktops link
        computerPage.clickOnDesktop();
//    Click on product name "Build your own computer"
        buildYourOwnComputerPage.clickOnBuildYourOwnComputer();
//    Select processor "processor"
        buildYourOwnComputerPage.selectProcessor(processor);
//    Select RAM "ram"
        buildYourOwnComputerPage.selectRam(ram);
//    Select HDD "hdd"
        buildYourOwnComputerPage.selectHDD(hdd);
//    Select OS "os"
        buildYourOwnComputerPage.selectOS(os);
//    Select Software "software"
        buildYourOwnComputerPage.selectSoftware(software);
//    Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCart();
//    Verify message "The product has been added to your shopping cart"
        buildYourOwnComputerPage.verifyAddToCartSuccessfully();
    }


}
