package com.loop.test.day_2_practice_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



//        1. Open Chrome browser
//        2. Go to https://www.etsy.com
//        3. Search for “wooden spoon”
//        4. Verify title:
//        Expected: “Wooden spoon | Etsy”

public class Task4 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate to etsy.com
        driver.manage().window().maximize();
        driver.get("https://etsy.com");

        WebElement searchBoxWithId = driver.findElement(By.id("global-enhancements-search-query"));
        //id is an attribute, if there is a number it could be dynamic. refresh the page in order
        //to see if it changed it's not dynamic
        String textToSearch = "Wooden spoon";
        searchBoxWithId.sendKeys(textToSearch + Keys.ENTER); //driver.findElement(By.id
        //("global-enhancements-search-query"   00/sendKeys("Wooden spoon", Keys.ENTER);

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();
        //String expectedURL = "https://www.etsy.com/search?q=wooden+spoon&ref=search_bar";
        //String actual URL = driver.getCurrentURL();

        if (actualTitle.contains("Wooden spoon - Etsy")) {
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + " => TEST PASS");
        } else {
            System.err.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + " => TEST FAIL");
        }
        driver.quit();
    }
}





