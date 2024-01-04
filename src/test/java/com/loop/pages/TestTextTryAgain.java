package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestTextTryAgain {
    @FindBy (id = "droptarget")
    public WebElement bigCircle;
    @FindBy (id = "draggable")
    public WebElement smallCircle;
    @FindBy (tagName = "body")
    public WebElement outsideOfBigCircle;
    public TestTextTryAgain () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}