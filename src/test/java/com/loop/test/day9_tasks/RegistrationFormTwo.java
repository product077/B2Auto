//package com.loop.test.day9_tasks;
//
//import com.github.javafaker.Faker;
//import com.loop.test.utilities.ConfigurationReader;
//import com.loop.test.utilities.Driver;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class RegistrationFormTwo {
//    @Test
//    public void getToLoopAcademyWebSite() throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://loopcamp.vercel.app/registration_form.html");
//
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver(); // a little search from Google
//        js.executeScript("window.scrollBy(0,100);"); // -> scroll DOWN
//
//        Faker faker = new Faker();
//
//        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
//        firstName.sendKeys(faker.name().firstName() + Keys.TAB + faker.name().lastName() +
//                Keys.TAB + faker.name().firstName() + faker.number().digits(5) + Keys.TAB + faker.internet().emailAddress() + Keys.TAB +
//                faker.internet().password() + Keys.TAB + faker.numerify("###-###-####"));
//
//        WebElement genderRadioButton = Driver.getDriver().findElement(By.xpath("//input[@name='gender']"));
//        genderRadioButton.click();
//
//        WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
//        dateOfBirth.sendKeys(faker.numerify("12") + "/" + faker.numerify("04") + "/" +
//                faker.numerify("1995"));
//
//        Select selectDepartment = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
//        selectDepartment.selectByIndex(1);
//
//        Select selectJobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
//        selectJobTitle.selectByIndex(3);
//
//        WebElement programmingLanguage = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
//        programmingLanguage.click();
//
//        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
//        submitButton.click();
//
//        Thread.sleep(5000); // just for show what going on :)
//
//        Driver.closeDriver();
//    }
//}
//
