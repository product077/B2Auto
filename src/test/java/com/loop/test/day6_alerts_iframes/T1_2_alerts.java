package com.loop.test.day6_alerts_iframes;

import com.loop.test.base.TestBase;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.support.ui.Select;
public class T1_2_alerts extends  TestBase {

    @Test
    public void informationAlert() {
        driver.navigate().to("https://loopcamp.vercel.app/checkboxes.html");

        WebElement checkbox = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        Assert.assertTrue(checkbox.isSelected());
    }

//    @Test
//    public void test1(){
//      //  driver.navigate().to("https://loopcamp.vercel.app");  // same 20 and 21 lines
//        driver.get("https://loopcamp.vercel.app/");
//        WebElement radioButton = driver.findElement(By.xpath("input[@id ='red']"));
//        Assert.assertTrue(radioButton.isEnabled());
//    }
//}
@Test
public  void informationAlert1(){
    driver.get("https://loopcamp.vercel.app/dropdown.html");
    driver.manage().window().maximize();
    Select  dropdown = new Select(driver.findElement(By.id("dropdown")));
   // dropdown.selectByVisibleText("Option 1");
    dropdown.selectByIndex(1);
   // Assert.assertTrue(dropdown.isMultiple());
    }
}