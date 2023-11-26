package com.loop.test.day_2_practice_tasks;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task02 {
    public static void main(String[] args)throws InterruptedException {


        //1. navigate to docuport application
        //2. validate placeholders for user name and password
        //3. without sending username and password click login button
        //4. validate username and password error messages

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize():
        driver.get("https://beta.docuport.app");

        // WebElement userName = driver.findElement(By.id("input-14"));
        // useName.sendKeys(DocuportConstants.USERNAME_CLIENT);
        // Validate placeholders for username and password fields
        WebElement usernameField = driver.findElement(By.id("input-14"));
        WebElement passwordField = driver.findElement(By.id("input-15"));
        WebElement loginButton = driver.findElement(By.cssSelector(".v-btn"));
        loginButton.click();
        Thread.sleep(3000);
        WebElement userNameError = driver.findElement(By.xpath("//div[text()= 'Please enter your username or email address']"));
        if(userNameError.getText().equals("Please enter your username or email address")) {
            System.out.println("Username error is displayed");
        }else{
            System.out.println("Username error is not displayed");
        }
        WebElement passwordError = driver.findElement(By.xpath("//div[text()= 'Please enter your password']"));
        if(userNameError.getText().equals("Please enter your password")) {
            System.out.println("Password error is displayed");
        }else{
            System.out.println("Password error is not displayed");
        }
        driver.quit();
    }
}