//package com.loop.test.day4_xpath_findelement;
//
//
//import com.loop.test.utilities.WebDriverFactory;
//import com.loop.test.utilities.DocuportConstants;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class Day4_task3 {
//
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = WebDriverFactory.getDriver((String)DocuportConstants.ALL_BROWSERS.get(0));
//        getUrl(driver, "https://beta.docuport.app/login");
//
//        driver.manage().window().maximize();
//
//        goToElement(driver, "//input[@id='input-14']", DocuportConstants.USERNAME_CLIENT);
//        goToElement(driver, "//input[@id='input-15']",DocuportConstants.PASSWORD_DOCUPORT_CLIENT + Keys.ENTER);
//
//        Thread.sleep(3000);
//
//        findElementByXPath(driver, "//span[text()='Home']", "Home");
//        findElementByXPath(driver, "//span[text()='Received docs']", "Received docs");
//        findElementByXPath(driver, "//span[text()='My uploads']", "My uploads");
//        findElementByXPath(driver, "//span[text()='Invitations']", "My uploads");
//
//        Thread.sleep(3000);
//
//        goToElement(driver, "//button[@class='v-app-bar__nav-icon v-btn v-btn--icon v-btn--round theme--light v-size--default']");
//
//        Thread.sleep(3000);
//
//        isDisplayed(driver, "Home");
//        isDisplayed(driver, "Received docs");
//        isDisplayed(driver, "My uploads");
//        isDisplayed(driver, "Invitations");
//
//        driver.quit();
//
//    }
//
//    public static void getUrl(WebDriver driver, String input) {
//        driver.get(input);
//    }
//    public static WebElement goToElement (WebDriver driver, String xPath, String userInfo) {
//        WebElement element = driver.findElement(By.xpath(xPath));
//        element.sendKeys(userInfo);
//        return element;
//    }
//    public static WebElement goToElement (WebDriver driver, String xPath) {
//        WebElement element = driver.findElement(By.xpath(xPath));
//        element.click();
//        return element;
//    }
//    public static WebElement findElementByXPath(WebDriver driver, String xPath, String elementsName) {
//        WebElement findByXPath = driver.findElement(By.xpath(xPath));
//        if (findByXPath.isDisplayed())
//            System.out.println("TEST PASSED -> Website: " +DocuportConstants.USERNAME_CLIENT + " have a \"" + elementsName + "\" BUTTON");
//        else
//            System.out.println("TEST FAILED -> \"" + elementsName + "\" IS NOT DISPLAYED");
//        return findByXPath;
//    }
//    public static void isDisplayed (WebDriver driver, String isDisappear) {
//        WebElement element = driver.findElement(By.xpath("//span[text()='" + isDisappear + "']"));
//        if (!element.isDisplayed())
//            System.out.println("TEST PASSED -> \"" + isDisappear + "\" button are DISAPPEAR");
//        else
//            System.out.println("TEST FAILED -> \"" + isDisappear + "\" button are NOT DISAPPEAR");
//    }
//
//}