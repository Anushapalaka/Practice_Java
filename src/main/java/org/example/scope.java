package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class scope {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int links= driver.findElements(By.tagName("a")).size();
        System.out.println(links);

        WebElement footer = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
        System.out.println(footer.findElements(By.tagName("a")).size());
       WebElement rows =  footer.findElement(By.xpath( "//table/tbody/tr/td[1]/ul"));
        System.out.println(rows.findElements(By.tagName("a")).size());

        int pageLoad= rows.findElements(By.tagName("a")).size();
        for (int i=1;i<=pageLoad ;i++){

            String clicklink= Keys.chord(Keys.CONTROL,Keys.ENTER);
            rows.findElements(By.tagName("a")).get(i).click();
//            Set<String> w = driver.getWindowHandles();
//            Iterator<String> it = w.iterator();
//            String parent= it.next();
//            String child =it.next();
//            driver.switchTo().window(parent);


        }
    }
}