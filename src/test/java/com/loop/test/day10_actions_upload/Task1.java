package com.loop.test.day10_actions_upload;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {

    @Test
    public void dropAnywhereOutside(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loopcampDragDrop"));
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
        WebElement outCircle = Driver.getDriver().findElement(By.xpath("//div[@class='container']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle,outCircle).perform();
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[.='Try again']"));
        String actual = bigCircle.getText();
        Assert.assertEquals(actual, "Try again", "Test failed");

    }
}
