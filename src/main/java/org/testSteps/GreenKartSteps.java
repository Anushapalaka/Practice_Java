package org.testSteps;

import org.utils.WebDriverUtils;

import org.locators.GreenKartLocators;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class GreenKartSteps extends WebDriverUtils {


    public void kart() {

    }

    public void verificationOfLoginFlow() {
        SoftAssert softAssert= new SoftAssert();
        try {
            String usernameLabelText = getText(GreenKartLocators.usernameLabel);
            softAssert.assertEquals(usernameLabelText, "Username:", "Username Label text is not matching with the expected");

            sendKeys(GreenKartLocators.username, "rahulshettyacademy");
            String passwordLabelText = getText(GreenKartLocators.passwordLabel);
            softAssert.assertEquals(passwordLabelText, "Password:", "Password Label text is not matching with the expected");

            sendKeys(GreenKartLocators.password, "learning");
            clickElement(GreenKartLocators.submitButton);
            elementClickable(GreenKartLocators.successButton);
            clickElement(GreenKartLocators.successButton);
            selectByIndex(GreenKartLocators.roleDropdown, 1);
            String tncLabelText = getText(GreenKartLocators.tncLinkText);
            softAssert.assertEquals(tncLabelText,"terms and conditions","TnC Label text is not matching with the expected");
            clickElement(GreenKartLocators.tncCheckbox);
            clickElement(GreenKartLocators.signInButton);
        }
        catch (Exception e){
            softAssert.fail("Exception occured during verificationOfLoginFlow " + e.getMessage());
        } finally {
            softAssert.assertAll();
        }

    }

    public void verificationOfAddToCartFlow() {
        SoftAssert softAssert= new SoftAssert();
        try {
            fluentWait(GreenKartLocators.addToCartButton);

            List<WebElement> products = getWebElements(GreenKartLocators.addToCartButton);

            for (WebElement element : products) {
                element.click();
            }
        }
        catch (Exception e){
            softAssert.fail("Exception occured during verificationOfAddToCartFlow " + e.getMessage());
        } finally {
            softAssert.assertAll();
        }

    }

    public void verificationOfCheckoutProductsFlow() {
        SoftAssert softAssert= new SoftAssert();
        try {
            clickElement(GreenKartLocators.checkOutButton);
            clickElement(GreenKartLocators.checkoutButton2);
            clickElement(GreenKartLocators.tncCheckboxAtCheckOut);
            clickElement(GreenKartLocators.purchaseButton);
            fluentWait(GreenKartLocators.successMessage);
            String textOfSuccessMessage = getText(GreenKartLocators.successMessage);
            softAssert.assertEquals(textOfSuccessMessage,"×\n" +
                    "Success! Thank you! Your order will be delivered in next few weeks :-).","Inavlid success message");
            System.out.println(textOfSuccessMessage);
        }
        catch (Exception e){
            softAssert.fail("Exception occured during verificationOfCheckoutProductsFlow " + e.getMessage());
        } finally {
            softAssert.assertAll();
        }

    }



}
