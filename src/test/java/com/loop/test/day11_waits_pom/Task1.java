package com.loop.test.day11_waits_pom;

import com.loop.pages.SmartBearSoftwareWeb;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {
    /*
    1. Open browser
2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click to Login button
6. Print out count of all the links on landing page
7. Print out each link text on this page
     */
    SmartBearSoftwareWeb smartBearSoftwareWeb;
    @BeforeMethod
    public void setUpMethod () {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartbearsoftware"));
        smartBearSoftwareWeb = new SmartBearSoftwareWeb();
        Actions actions = new Actions(Driver.getDriver());
    }
    @Test
    public void test_1 () {
        smartBearSoftwareWeb.username.sendKeys("Tester");
        smartBearSoftwareWeb.password.sendKeys("test");
        smartBearSoftwareWeb.loginButton.click();
        System.out.println("Size is: " + smartBearSoftwareWeb.link.size());
        for (WebElement element : smartBearSoftwareWeb.link) {
            System.out.println("Text: " + element.getText());
        }
    }
    @AfterMethod
    public void tearDownMethod () {
        Driver.closeDriver();
    }
}