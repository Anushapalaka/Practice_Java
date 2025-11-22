package org.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class WebDriverUtils {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));


    public void launchBrowser(String url) {
        launchIncognitoBrowser();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void launchIncognitoBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false
        ));
        driver = new ChromeDriver(options);
    }

    public void implicitWait(long sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

    }

    public void fluentWait(By locator) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
        wait.until(driver1 -> driver1.findElement(locator));
    }

    public void visibilityOf(WebElement webElement){
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void elementClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
    }
    public void visibilityOfElementLocated(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void visibilityOfElementsLocated(By locator){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void selectByName(By locator,String text){
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByVisibleText(text);

    }
        public void selectByIndex(By locator,int index){
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByIndex(index);
    }

    public void selectByValue(By locator,String text){
        Select dropdown = new Select(driver.findElement(locator));
        dropdown.selectByValue(text);
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void sendKeysToAlert(String value){
        driver.switchTo().alert().sendKeys(value);
    }

//    public void windowHandles(){
//        driver.getWindowHandles()
//    }

    public void clickElement(By locator){
        driver.findElement(locator).click();
    }

    public void sendKeys(By locator,String value){
        driver.findElement(locator).sendKeys(value);
    }
    public String getText(By locator){
        String value = driver.findElement(locator).getText();
        return value;
    }
    public List<WebElement> getWebElements(By locator){
        return driver.findElements(locator);


    }
    public void quitBrowser(){
        driver.close();
    }

}



