package com_utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class ComUtimateqa {

    //Setup Chrome browser
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //Multiple browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //Open URL
        driver.get(baseUrl);
        //Maximize the window
        driver.manage().window().maximize();
        //Timeout for hold the page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Print the title of the page.
        System.out.println(driver.getTitle());
        //Print the current url.
        System.out.println("This is the current URL: " + driver.getCurrentUrl());
        //Print the page source.
        System.out.println(driver.getPageSource());
        //Click on ‘Sign In’ link
        driver.findElement(By.linkText("Sing In")).click();
        //Print the current url
        System.out.println("This is the current URL: " + driver.getCurrentUrl());
        //Enter the email to email field.
        driver.findElement(By.id("user[email]")).sendKeys("sjalpar@gmail.com");
        //Enter the password to password field.
        driver.findElement(By.id("user[password]")).sendKeys("@1234567");
        //Click on Login Button.
         driver.findElement(By.partialLinkText("Sign")).click();
        //Navigate to baseUrl.
        driver.navigate().to(baseUrl);
         // Navigate forward to Homepage.
        driver.navigate().forward();
        //Navigate back to baseUrl.
        driver.navigate().back();
        //Refresh the page.
        driver.navigate().refresh();
        //Close the browser.
        driver.quit();


    }
}
