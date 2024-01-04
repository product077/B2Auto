package com.loop.pages;


import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearSoftwareWeb {
    @FindBy (xpath = "//input[@type='text']")
    public WebElement username;
    @FindBy (xpath = "//input[@type='password']")
    public WebElement password;
    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginButton;
    @FindBy (tagName = "a")
    public List <WebElement> link;

    public SmartBearSoftwareWeb(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}