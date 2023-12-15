package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import static org.testng.Assert.*;

public class Task1 extends TestBase {
    @Test
    public void alertButtons() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertButton.click();
        driver.switchTo().alert().accept();


        WebElement timerAlertButton = driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
       timerAlertButton.click();
       Thread.sleep(5000);
        driver.switchTo().alert().accept();



        WebElement confirmButton = driver.findElement(By.xpath("//*[@id='confirmButton']"));
        confirmButton.click();
        driver.switchTo().alert().accept();

        WebElement successMessageForConfirmButton  = driver.findElement(By.xpath("//*[@id='confirmResult']"));
        String expected = "You selected Ok"; // Correcting the expected text
        String actual = successMessageForConfirmButton.getText();
        Assert.assertEquals(actual, expected, "Actual does not match the expected");


        confirmButton.click();
        driver.switchTo().alert().dismiss();
        actual = successMessageForConfirmButton.getText();
        expected = "You selected Cancel";
        Assert.assertEquals(actual, expected, "Actual does not match the expected" );




        WebElement promtButton = driver.findElement(By.xpath("//*[@id='promptButton']"));
        promtButton.click();
        String text="Loop Academy";
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();

        WebElement validateMessage = driver.findElement(By.xpath("//span[@id='promptResult']"));
        String expected1 = "You entered " + text;
        String actual1 = validateMessage.getText(); // Retrieve text from the webpage
        Assert.assertEquals(actual1, expected1, "Actual does not match the expected");

    }
}







