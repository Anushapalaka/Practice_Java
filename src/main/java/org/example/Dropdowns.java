package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {
    static  WebDriver driver = new ChromeDriver();

    public static void browserActions(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElement(By.xpath("//div/button[1]/following-sibling ::button[1]")).getText());
        driver.manage().window().maximize();
        driver.navigate().to("https://www.qaclickacademy.com/");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println("done");
    }

    public static void dropDownStatic(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
//        dropdown.deselectByVisibleText("AED");
    }

    public static void updatedDropdown() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
            Thread.sleep(2000);
//        int i=1;
//        while(i<5){
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }

        for(int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();

        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("btnclosepaxoption")).click();
    }

    public static void autoSuggestions() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option : options){

            if(option.getText().equalsIgnoreCase("India")){

                option.click();
                break;
            }
        }

    }

    public static void checkboxes(){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElement(By.cssSelector("input[name*='chk_friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[name*='chk_friendsandfamily']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[name*='chk_friendsandfamily']")).isSelected());

        //count
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

    }
    public static void main(String[] args) throws InterruptedException {

//     browserActions();
//     dropDownStatic();
//        updatedDropdown();
//        autoSuggestions();
        checkboxes();
        }

    }

