package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestTextNowDrop {
    @FindBy(id = "droptarget")
    public WebElement bigCircle;
    @FindBy (id = "draggable")
    public WebElement smallCircle;
    public TestTextNowDrop () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
