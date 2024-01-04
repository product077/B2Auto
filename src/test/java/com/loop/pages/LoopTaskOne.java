package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoopTaskOne{


public LoopTaskOne() {
  PageFactory.initElements(Driver.getDriver(), this);


}
    @FindBy(id ="ctl00_MainContent_username")
    public WebElement username;

    @FindBy(id ="ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id ="ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(tagName ="a")
    public List<WebElement>myList;


}
