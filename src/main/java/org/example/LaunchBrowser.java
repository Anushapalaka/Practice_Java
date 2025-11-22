package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

   public static void launchBrowser(){
        WebDriver driver = new ChromeDriver();

//        WebDriver driver = new FirefoxDriver();

//        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
    }

    public static  void main(String[] args) {

//        driver.close();
//        driver.quit();
        launchBrowser();

    }
}
