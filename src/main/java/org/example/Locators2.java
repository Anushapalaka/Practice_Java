package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {

    public static void launchBrowser2() throws InterruptedException {

        String name = "Anu";
        WebDriver driver = new ChromeDriver();
        //added implicit step
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("Test");
        driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("anukdf@yopmail.com");
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9909881123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        System.out.println(driver.findElement(By.xpath("//form/p")).getText());
        driver.findElement(By.cssSelector("button[class*='go-to']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String sucess;
        Thread.sleep(1000);
        System.out.println( sucess= driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
        Assert.assertEquals(sucess, "You are successfully logged in.");
        driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
    }
    public static void main(String[] args) throws InterruptedException {
        launchBrowser2();

    }
}
