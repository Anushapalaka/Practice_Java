package org.example;

import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
        driver.findElement(By.cssSelector("span[id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
        Thread.sleep(1000);


//        driver.findElement(By.)
        driver.findElement(By.cssSelector("a[value='BLR']")).click();
//        driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
        driver.findElement(By.linkText("Chennai (MAA)")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){

            System.out.println("it enabled");
            Assert.assertTrue(true);
            driver.findElement(By.className(".ui-datepicker-week-end")).click();


        }else {

            Assert.assertFalse(false);
        }


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        for(int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();

        }

        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);


        driver.findElement(By.cssSelector("input[name='ctl00$mainContent$btn_FindFlights']")).click();

    }
}
