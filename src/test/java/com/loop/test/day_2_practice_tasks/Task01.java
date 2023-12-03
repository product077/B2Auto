package com.loop.test.day_2_practice_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Go to the specified URL
        driver.get("https://loopcamp.vercel.app/forgot-password.html");

        // Locating elements using CSS selectors
        WebElement forgotPassword = driver.findElement(By.cssSelector("a[href='https://loopcamp.vercel.app/forgot-password.html']"));
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[type='submit']"));
        WebElement poweredByLoopCamp = driver.findElement(By.cssSelector(".footer a"));


        if (forgotPassword.isDisplayed()) {
            System.out.println("Forgot Password link is displayed: TEST PASSED");
        } else {
            System.out.println("Forgot Password link is not displayed: TEST FAILED");
        }

        if (emailLabel.isDisplayed()) {
            System.out.println("Email Label is displayed: TEST PASSED");
        } else {
            System.out.println("Email Label is not displayed: TEST FAILED");
        }

        if (emailInput.isDisplayed()) {
            System.out.println("Email Input field is displayed: TEST PASSED");
        } else {
            System.out.println("Email Input field is not displayed: TEST FAILED");
        }

        if (retrievePassword.isDisplayed()) {
            System.out.println("Retrieve Password button is displayed: TEST PASSED");
        } else {
            System.out.println("Retrieve Password button is not displayed: TEST FAILED");
        }

        if (poweredByLoopCamp.isDisplayed()) {
            System.out.println("Powered by LOOPCAMP link is displayed: TEST PASSED");
        } else {
            System.out.println("Powered by LOOPCAMP link is not displayed: TEST FAILED");
        }

        driver.quit();
    }
}
