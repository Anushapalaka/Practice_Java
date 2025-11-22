package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class Windows {

    static WebDriver driver = new ChromeDriver();

    public static void practiceWindow1() {
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("a.blinkingText")).click();
        Set<String> Windows = driver.getWindowHandles();
        Iterator<String> it = Windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(email);

    }

    public static void practiceWindow2() {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector(".btn-style.class1.class2")).click();
        Set<String> w = driver.getWindowHandles();
        Iterator<String> it = w.iterator();
        String Parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        String email = driver.findElement(By.xpath("//div[@class='support float-left']/div/span")).getText();
        driver.switchTo().window(Parent);
        driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(email);

    }

    public static void assignment1() {

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.cssSelector("a[href=\"/windows/new\"]")).click();

        Set<String> w = driver.getWindowHandles();
        Iterator<String> it = w.iterator();
        String parentWindow = it.next();
        String childWindow1 = it.next();
        driver.switchTo().window(childWindow1);
        String newPage = driver.findElement(By.cssSelector(".example")).getText();
        System.out.println(newPage);
        driver.switchTo().window(parentWindow);
        String oldpage =  driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
        System.out.println(oldpage);


//        driver.switchTo().window(childWindow2);
//
//        driver.switchTo().window(parentWindow);

    }

    public static void assignment2(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());


    }


    public static void main(String[] args) {
//        practiceWindow1();
//        practiceWindow2();
//        assignment1();
        assignment2();
    }

}
