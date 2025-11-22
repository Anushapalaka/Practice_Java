package org.example;

import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
//        driver.findElement(By.cssSelector("div[id='draggable']")).click();
        Actions a = new Actions(driver);
        WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
        WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();

    }
}
