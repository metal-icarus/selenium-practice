package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium101 {

    public static void main(/*String[] args*/) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("http://www.facebook.com");
        chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("usuario");
        chromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        chromeDriver.findElement(By.id("u_0_b")).click();


        //Go to the url
        chromeDriver.get("https://www.findmyfare.com/");

        //Validate your page title is correct
        System.out.println(chromeDriver.getTitle());

        //Validate landed url
        System.out.println(chromeDriver.getCurrentUrl());

        //Print page source
        System.out.println(chromeDriver.getPageSource());

        //Go to the url
        chromeDriver.get("https://www.airbnb.com/");

        //Navigate back
        chromeDriver.navigate().back();

        //Navigate forward
        chromeDriver.navigate().forward();

        //Close current browser
        chromeDriver.close();

        //Close all the browsers
        chromeDriver.quit();


    }


}


