//package com.loop.test.day4_xpath_findelement;
//import com.loop.test.utilities.DocuportConstants;
//import com.loop.test.utilities.WebDriverFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import java.util.List;
//
//public class day4_task2_1 {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("https://beta.docuport.app");
//
//        WebElement userName = driver.findElement(By.id("input - 14"));
//        userName.sendKeys(DocuportConstants.USERNAME_ADVISOR);
//
//        WebElement password = driver.findElement(By.cssSelector("input[id='input-15']"));
//        password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT_ADVISOR);
//
//        WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
//        login.click();
//
//        Thread.sleep(3000);
//
//        List<WebElement> navigateItems = driver.findElements(By.xpath("//a[contains(@class,'py-x-2')]"));
//        System.out.println(navigateItems.size());
//    }
//
//}
