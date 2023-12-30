package com.loop.test.day10_actions_upload;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T1_upload {

    /*
    1. Go to “http://demo.guru99.com/test/upload”
    2. Upload file into Choose File
    3. Click terms of service check box
    4. Click Submit File button
    5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
     */

    @Test
    public void upload_file() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("guru.url"));
        WebElement chooseFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
      //  String path = "/Users/nsh/Desktop/note.txt";
        String path = "C:\\Users\\aland\\OneDrive\\Desktop\\JAVA 08.13.23.txt";
        chooseFile.sendKeys(path);
        WebElement checkBox = Driver.getDriver().findElement(By.id("terms"));
        checkBox.click();
        WebElement submitButton = Driver.getDriver().findElement(By.id("submitbutton"));
        submitButton.click();
        Thread.sleep(3000);
        WebElement successMessage = Driver.getDriver().findElement(By.id("res"));
        String expectedMessage = "1 file\nhas been successfully uploaded.";
        assertEquals(successMessage.getText(), expectedMessage);
        // Driver.closeDriver();
    }
}