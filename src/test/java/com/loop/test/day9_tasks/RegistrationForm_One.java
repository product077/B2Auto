//package com.loop.test.day9_tasks;
//
//import com.github.javafaker.Faker;
//import com.loop.test.base.TestBase;
//import com.loop.test.utilities.ConfigurationReader;
//import com.loop.test.utilities.Driver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.support.ui.Select;
//
//import static com.loop.test.utilities.Driver.driver;
//
//
//public class RegistrationForm_One {
//
//
//    @Test
//
//            public void fillTheForm()throws InterruptedException{
//
//            driver.get()
//            Driver.getDriver().get(ConfigurationReader.getProperty("reg"));
//    Faker faker = new Faker();
//    String Name = faker.name().firstName();
//    String lastName = faker.name().lastName();
//    String email = lastName.toLowerCase() + "gmail.com";
//
//    WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
//    firstName.sendKeys(faker.name().firstName());
//    WebElement latName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
//    lastName.sendKeys(faker.name().lastName());
//    WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
//    usename.sendKeys(faker.name().username().replace("."),"");
//    WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
//    email.sendKeys(faker.internet().emailAdress());
//    WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
//    password.sendKeys(faker.internet().password());
//    WebElement phonenumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
//    phoneNumber.sendKeys(faker.numerify("###-###-####"));
//    WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='female')");
//    gender.click();
//    Assert.assertTrue(gender.isSelected());
//    WebElement dateOfBirth=Driver.getDriver().findElement(By.xpath("//input[@name='birthday'"));
//    dateOfBirth.sendKeys(faker.nameberify("12/28/1999"));
//    Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("select[@name='department']"));
//    departmentDropdowm.selectByVisibleText("Tourism Office")
//    Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//input[@name='job_title'")));
//    jobTitle.selectByVisiableText("SDET");
//    WebElement programmingLanguage=Driver.getDriver().findElement(By.xpath("//div[@class='form-check form-check-inline'][2]"));
//    programmingLanguage.click();
//    WebElement signUp = Driver.getDriver().findElement(By.xpath("//button[type='submit']"));
//    signUp.click());
//
//
//}
//}
