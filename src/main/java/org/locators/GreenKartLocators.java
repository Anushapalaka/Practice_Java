package org.locators;

import org.openqa.selenium.By;

public class GreenKartLocators {
    public static final By usernameLabel = By.cssSelector("label[for='username']");
    public static final By passwordLabel = By.cssSelector("label[for='password']");

    public static final By username = By.xpath("(//input[@class='form-control'])[1]");
    public static final By password = By.xpath("(//input[@class='form-control'])[2]");
    public static final By submitButton = By.cssSelector("label.customradio input[value='user']");
    public static final By successButton = By.cssSelector("button.btn.btn-success");
    public static final By roleDropdown = By.cssSelector("select[class='form-control']");
    public static final By tncLinkText = By.cssSelector(".text-white.termsText a");
    public static final By tncCheckbox = By.cssSelector("input[type='checkbox']");
    public static final By signInButton = By.cssSelector("input[id='signInBtn']");
    public static final By addToCartButton = By.cssSelector(".card-footer .btn-info");
    public static final By checkOutButton = By.cssSelector("a.nav-link.btn.btn-primary");
    public static final By checkoutButton2 = By.cssSelector(".btn.btn-success");
    public static final By tncCheckboxAtCheckOut = By.xpath("//label[@for='checkbox2']");
    public static final By purchaseButton = By.cssSelector("input[value='Purchase']");
    public static final By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");

}
