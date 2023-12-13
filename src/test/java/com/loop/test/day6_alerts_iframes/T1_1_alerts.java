package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class T1_1_alerts extends  TestBase{


    @Test
 public void informationAlert(){
        driver.navigate().to("https://google.com");//same
        driver.get("https://google.com");//same



    }
}
