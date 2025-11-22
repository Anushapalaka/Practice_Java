package org.tests;

import org.testSteps.GreenKartSteps;
import org.testng.annotations.*;

public class GreenKartTests extends GreenKartSteps {

    @BeforeSuite
    public void launchBrowser() {
        launchBrowser("https://rahulshettyacademy.com/loginpagePractise/");
    }

    @Test(priority = 1)
    public void loginIntoGreenKart() {
        verificationOfLoginFlow();
    }

    @Test(priority = 2)
    public void addProductsToCart() {
        verificationOfAddToCartFlow();
    }

    @Test(priority = 3)
    public void checkoutProducts() {
        verificationOfCheckoutProductsFlow();
    }

    @AfterSuite
    public void quit(){
        quitBrowser();
    }

}

