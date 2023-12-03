//package com.loop.test.day4_xpath_findelement;
//
//import com.loop.test.utilities.DocuportConstants;
//import com.loop.test.utilities.WebDriverFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Day4_task1 {
//    public static void main(String[] args) throws InterruptedException {
//        //open Chrome browser
//        //go to Docuport
//
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("https://beta.docuport.app");
//
//        //login to Docuport
//
//        WebElement userNameForClient = driver.findElement(By.id("input - 14"));
//        userNameForClient.sendKeys(DocuportConstants.USERNAME_CLIENT + Keys.TAB, DocuportConstants.PASSWORD_DOCUPORT_CLIENT + Keys.ENTER);
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        List<WebElement> webElements = new ArrayList<>();
//        webElements.add(driver.findElement(By.xpath("//span[.'Home']"))); //Home
//        webElements.add(driver.findElement(By.xpath("//span[.'Received docs']")));//Received dosc
//        webElements.add(driver.findElement(By.xpath("//a[.'My uploads']")));//My uploads
//        webElements.add(driver.findElement(By.xpath("//a[.'Invitation']")));//Invitations
//
//        for (WebElement webElement : webElements) {
//            System.out.println((webElement.isDisplayed()) ? "TEST PASS" + webElement.getText() + "is displayed" : "TEST FAIL"  + webElement.getText() + "is NOT displayed");
//
//        }
//
//        driver.quit();
//    }
//}
