package com.loop.test.day_2_practice_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task0 {
    // 1. go to https://loopcamp.vercel.app/forgot-password.html
    // 2. locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
    // 3. use css
    // 4. verify those elements are displayed
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://loopcamp.vercel.app/forgot-password.html");
        WebElement forgetPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));
        WebElement email = driver.findElement(By.cssSelector("[for = 'email']"));
      //  WebElement emailInput = driver.findElement(By.cssSelector("input#email"));
        WebElement retrivePass = driver.findElement(By.cssSelector("[class = 'icon-2x icon-signin']"));
        WebElement poweredByLoop = driver.findElement(By.cssSelector("[style= 'text-align: center;']"));
        System.out.println("Forget Password is displayed: " + forgetPassword.isDisplayed());
        System.out.println("E-MAIL is displayed:" + email.isDisplayed());
        System.out.println("Email input is displayed: " + retrivePass.isDisplayed());
        System.out.println("Powered by LOOPCAMP is displayed: " + poweredByLoop.isDisplayed());

        driver.quit();
    }
}
