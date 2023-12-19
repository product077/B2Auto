//package com.loop.test.day4_xpath_findelement;
//
//
//import com.loop.test.utilities.DocuportConstants;
//import com.loop.test.utilities.WebDriverFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import java.util.ArrayList;
//import java.util.List;
//public class Day4_task1_1 {
//
//    public static void main(String[] args) throws  InterruptedException{
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//
//        driver.get("https://beta.docuport.app/login?redirect=%2F");
//
//        driver.findElement(By.cssSelector("button[type='text']")).sendKeys((DocuportConstants.USERNAME_CLIENT));
//        driver.findElement(By.cssSelector("button[type='password']")).sendKeys(DocuportConstants.PASSWORD).;
//
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//
//
//        Thread.sleep(3000);
//        WebElement homeDriver = driver.findElement()
//
//    }
//}
