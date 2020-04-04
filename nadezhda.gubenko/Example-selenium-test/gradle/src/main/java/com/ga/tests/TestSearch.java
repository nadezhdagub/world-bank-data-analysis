package com.ga.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearch {

    @Test
    public void googleTitleTest() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();

        driver.get("https://www.google.com.ua/");
        //System.out.println(driver.getTitle());

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("world bank");
        search.sendKeys(Keys.ENTER);

        String  title = driver.getTitle();
        System.out.println("google title is" + title);
        Assert.assertEquals(title, "google");


        driver.close();
    }


}

