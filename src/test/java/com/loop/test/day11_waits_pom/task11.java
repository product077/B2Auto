package com.loop.test.day11_waits_pom;

import com.loop.pages.SmartBearSoftwareWeb1;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class task11 {

    SmartBearSoftwareWeb1 smartBearSoftwareWeb1;
    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("smartbearsoftware"));
        smartBearSoftwareWeb1 = new SmartBearSoftwareWeb1();
    }

    @Test
    public void test_link(){
        smartBearSoftwareWeb1.username.sendKeys("Tester");
        smartBearSoftwareWeb1.password.sendKeys("test");
        smartBearSoftwareWeb1.button.click();
        System.out.println("Links on the page: " + smartBearSoftwareWeb1.linksList.size());
        for (WebElement each : smartBearSoftwareWeb1.linksList){
            System.out.println(each.getText());
        }

    }
}