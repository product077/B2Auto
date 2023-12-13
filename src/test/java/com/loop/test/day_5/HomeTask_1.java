//package com.loop.test.day_5;
//import com.loop.test.utilities.WebDriverFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class HomeTask_1 {
//    //1. Open Chrome browse
//  //2  Go to http://the-internet.herokuapp.com/dropdown
//    //3. Verify “Dropdown list” default selected value is correct - Expected: “Please select an option”
//
//    WebDriver driver;
//    String expected1 = "Please select an option";
//    String actual1= "Please select an option";
//    String expected2 = "Please select an option";
//    String actual2= "Please select an option";
//
//    @BeforeMethod
//    public void setUpMethod() {
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("http://the-internet.herokuapp.com/dropdown");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    @AfterMethod
//    public void tearDownMethod() {
//        driver.close();
//    }
//    //#2validate "Please select an option" is selected
//@Test(priority = 1)
//public void  Test_1() {
//        driver.get("http://the-internet.herokuapp.com/dropdown");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
//
//    Select dropdownElement = new Select(driver.findElement(By.xpath("Select[@id='dropdown']")));
//    actual1 = dropdownElement.getFirstSelectedOption().getText();
//     Assert.assertEquals(actual1, expected1,"Actual does not match excepted");
//
//
//}
//// choose option 1 and validate that is selected
//@Test(priority = 2)
//
//