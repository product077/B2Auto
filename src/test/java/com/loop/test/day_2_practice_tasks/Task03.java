package com.loop.test.day_2_practice_tasks;

import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
public class Task03 {
// 1- Open a chrome browser
// 2- Go to: https://google.com
// 3- Click to Gmail from top right.
// 4- Verify title contains:
//    Expected: Gmail
//5- Go back to Google by using the .back();
//6- Verify title equals:
//    Expected: Google


    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement gmailButton = driver.findElement(By.cssSelector(".gb_E"));
        gmailButton.click();
        // Verify title contains "Gmail"
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title contains 'Gmail': TEST PASSED");
        } else {
            System.out.println("Title does not contain 'Gmail': TEST FAILED");
        }

         Thread.sleep(1000);
        driver.navigate().back();
        String expectedHomeTitle = "Google";
        String actualHomeTitle = driver.getTitle();

       if(actualHomeTitle.contains(expectedHomeTitle)) {

           System.out.println("Expected" + actualHomeTitle + " contains " + actualHomeTitle);
           System.out.println("TEST PASSED");
       }else{
           System.out.println("Expected" + actualHomeTitle + " DOES NOT contains " + actualHomeTitle);
           System.out.println("TEST FAILED");
       }
       driver.quit();

    }

}

