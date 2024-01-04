package com.loop.test.day11_waits_pom;

import com.loop.pages.TestTextNowDrop;
import com.loop.pages.TestTextTryAgain;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Task2 {
    TestTextNowDrop testTextNowDrop;
    TestTextTryAgain testTextTryAgain;
    Actions actions;
    @BeforeMethod
    public void setUpMethod () {
        Driver.getDriver().get(ConfigurationReader.getProperty("loopDragAndDrop"));
        testTextNowDrop = new TestTextNowDrop();
        testTextTryAgain = new TestTextTryAgain();
        actions = new Actions(Driver.getDriver());
    }
    @Test (priority = 1)
    public void setTestTextNowDrop () {
        actions.clickAndHold(testTextNowDrop.smallCircle).moveToElement(testTextNowDrop.bigCircle).perform();
        assertEquals(testTextNowDrop.bigCircle.getText(), "Now drop...");
    }
    @Test (priority = 2)
    public void setTestTextTryAgain () {
        actions.clickAndHold(testTextTryAgain.smallCircle).moveToElement(testTextTryAgain.outsideOfBigCircle).click().perform();
        assertEquals(testTextTryAgain.bigCircle.getText(), "Try again!");
    }
    @AfterMethod
    public void tearDownMethod () {
        Driver.closeDriver();
    }
}