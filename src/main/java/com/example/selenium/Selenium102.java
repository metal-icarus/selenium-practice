package com.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium102 {

    @Test
    public void loginTest() {
        System.out.println("Starting loginTest");

//		Create driver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // sleep for 3 seconds
        sleep(3000);

        // maximize browser window
        driver.manage().window().maximize();

//		open test page
        String url = "http://the-internet.herokuapp.com/login";
        driver.get(url);
        System.out.println("Page is opened.");

        // sleep for 2 seconds
        sleep(2000);

        // Close browser
        driver.quit();
    }

    private void sleep(long m) {
        try {
            Thread.sleep(m);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



}


