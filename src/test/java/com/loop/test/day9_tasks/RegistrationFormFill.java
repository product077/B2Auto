package com.loop.test.day9_tasks;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationFormFill {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Go to the registration form URL
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        // Fill the registration form using Faker
        Faker faker = new Faker();
        fillRegistrationForm(driver, faker);

        // Close the browser
        driver.quit();
    }

    public static void fillRegistrationForm(WebDriver driver, Faker faker) throws InterruptedException {
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName() + Keys.TAB + faker.name().lastName() +
                Keys.TAB + faker.name().firstName() + faker.number().digits(5) + Keys.TAB + faker.internet().emailAddress() + Keys.TAB +
                faker.internet().password() + Keys.TAB + faker.numerify("###-###-####"));

        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@name='gender']"));
        genderRadioButton.click();

        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys(faker.numerify("12") + "/" + faker.numerify("04") + "/" +
                faker.numerify("1995"));

        Select selectDepartment = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        selectDepartment.selectByIndex(1);

        Select selectJobTitle = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        selectJobTitle.selectByIndex(3);

        WebElement programmingLanguage = driver.findElement(By.xpath("//input[@value='java']"));
        programmingLanguage.click();

        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        Thread.sleep(3000); // Waiting for 5 seconds just to observe the result (not recommended in actual tests)

        // Close the browser (consider using a proper teardown mechanism like in testing frameworks)
        driver.quit();
    }
}
