package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PracticePage {
  static   WebDriver driver = new ChromeDriver();


    public static void checkbox(){

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
        driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());

        driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
    public  static void form() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Anusha");
        driver.findElement(By.name("email")).sendKeys("testi3@yopmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Testi");
        driver.findElement(By.id("exampleCheck1")).click();
       WebElement staticDropdown = driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
       Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText("Female");
        driver.findElement(By.cssSelector("input[value='option1']")).click();
        driver.findElement(By.cssSelector("input[type='date']")).sendKeys("30-06-1993");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        String success = driver.findElement(By.xpath("//div/strong")).getText();
        Assert.assertEquals(success,"Success!");


    }
    public  static void main(String[] args) throws InterruptedException {
//        checkbox();
            form();
    }
}
