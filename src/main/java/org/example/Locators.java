package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Anu");
        driver.findElement(By.name("password")).sendKeys("Test");
        driver.findElement(By.cssSelector("input[value='Log In']")).click();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot login info?")).click();

        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Anu");
        driver.findElement(By.xpath("//input[@name='firstName']")).clear();


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[name='radioButton']:nth-of-type(3)")).click();
//        driver.close();
    }
}
