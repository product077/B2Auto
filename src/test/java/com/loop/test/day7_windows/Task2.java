package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;


public class Task2 extends TestBase {

    /*1. go to https://loopcamp.vercel.app/
    2. click "Multiple Windows" link
    3. Validate "Powered by Loopcamp" is displayed
    4. Validate title is "Windows"
    5. Click - click here
    6. Switch to new window and validate title

     */

    @Test
    public void windowsHandling() {
        //1. go to https://loopcamp.vercel.app/
        driver.get("https://loopcamp.vercel.app/");

        //2. click "Multiple Windows" link
        WebElement multipleWindows = driver.findElement(By.xpath("//a[contains(text(), 'Multiple Windows')]"));
        multipleWindows.click();


        //3. Validate "Powered by Loopcamp" is displayed

        WebElement footer = driver.findElement(By.xpath("//div[contains(text(), 'Powered')]"));
        String expectedFooter = "Powered by LOOPCAMP";
        String actualFooter = footer.getText();
        Assert.assertEquals(actualFooter, expectedFooter, "Test fail --> Actual does not match expected");

        //4. Validate title is "Windows"
        Assert.assertEquals(driver.getTitle(), "Windows", "Test fail -->  Actual does not match expected");


        //5. Click - click here
        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        clickHere.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            System.out.println("each window handle = " + each);
            driver.switchTo().window(each);
        }
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //6. Switch to new window and validate title
        Assert.assertEquals(driver.getTitle(), "New Window", "Test fail -->  Actual does not match expected");

    }
}


