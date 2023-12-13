package com.loop.test.day6_alerts_iframes;
import com.loop.test.base.TestBase;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class T1_alerts extends TestBase {

//    @Test
    //  public void informationAlert() {
//        driver.navigate().to("https://loopcamp.vercel.app/checkboxes.html");
//        driver.get("https://loopcamp.vercel.app/checkboxes.html");
//
//
//        WebElement chechbox = driver.findElement(By.xpath("//input[@type = 'checkbox1]"));
//        Assert.assertTrue(chechbox.isSelected());

    // }


//        driver.navigate().to("https://loopcamp.vercel.app/dropdown.html");
//        driver.manage().window().maximize();
//        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
//        dropdown.selectByVisibleText("Option 1 ");
//        dropdown.selectByIndex(1);
//        Assert.assertTrue(dropdown.isMultiple());


//        public void informationAlert(){
//            driver.get("https://loopcamp.vercel.app/dropdown.html");
//            Select dropdown = new Select(driver.findElement(By.id("dropdown")));
//          dropdown.getFirstSelectedOption().getText();
//          dropdown.selectByIndex();
    //            dropdown.getOptions
//
//            dropdown.selectByIndex(1);
//            Assert.assertTrue(dropdown.isMultiple());


    //  }
//}


    // --------------------------
//        driver.get("https://loopcamp.vercel.app/dropdown.html");
//        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
//
//        dropdown.getFirstSelectedOption().getText();
//
//        List<String> list = new ArrayList<>();
//
//
//        List<WebElement> listWebElements = dropdown.getOptions();
//
//        for (WebElement listWebElement : listWebElements) {
//            list.add(listWebElement.getText());
//        }
//
//
//        dropdown.selectByIndex(1);
//        Assert.assertTrue(dropdown.isMultiple());
//    }
//}

    //-------------------
/*
    Information alert practice
    1. Open browser
    2. Go to website: https://loopcamp.vercel.app/javascript-alerts.html
    3. Click to “Click for JS Alert” button
    4. Click to OK button from the alert
    5. Validate “You successfully clicked an alert” text is displayed

    Confirmation alert practice
    1. Click to “Click for JS Confirm” button
    2. Click to OK button from the alert
    3. Verify “You clicked: Ok” text is displayed.
    4. Click to “Click for JS Confirm” button
    5. Click to Cancel button from the alert
    6. Validate “You clicked: Cancel” text is displayed.

    Prompt alert practice
    1. Click to “Click for JS Prompt” button
    2. Send "Loop Academy"
    3. Click Ok
    4. Validate "You entered: Loop Academy" text is displayed


     */
    @Test
    public void informationAlert() {

        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        clickForJSAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement successMessageForInformationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You successfully clicked an alert";
        String actual = successMessageForInformationAlert.getText();
        assertEquals(actual, expected, "actual does not match the expected");
    }

    @Test
    public void confirmationAlert() {
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickForJSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        clickForJSConfirm.click();
        driver.switchTo().alert().accept(); //will click ok and accept
        WebElement successMessageForConfirmationAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String expected = "You clicked: Ok";
        String actual = successMessageForConfirmationAlert.getText();
        assertEquals(actual, expected, "Actual does not match the expected");

        clickForJSConfirm.click();
        driver.switchTo().alert().dismiss(); //will click cancel = will dismiss
        actual = successMessageForConfirmationAlert.getText();
        expected = "You clicked: Cancel";
        assertEquals(actual, expected, "actual does not match the expected");


    }

    @Test
    public void promptAlert() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/javascript-alerts.html");
        WebElement clickJSPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
        clickJSPrompt.click();
        String text = "Loop Academy";
//        driver.switchTo().alert().sendKeys(text);
//        driver.switchTo().alert().accept();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();

        WebElement successMessagePromptAlert = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = successMessagePromptAlert.getText();
        String expected = "You entered: " + text;
        assertEquals(actual, expected, "actual does not match the expected");


    }

}