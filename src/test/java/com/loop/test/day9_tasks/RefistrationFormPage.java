//package com.loop.test.day9_tasks;
//
//import com.github.javafaker.Faker;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//import static com.loop.test.utilities.ConfigurationReader.*;
//import static com.loop.test.utilities.Driver.*;
//import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;
//
//public class RegistrationFormPage {
//
//    static final By FIRST_NAME_LABEL = By.xpath("//label[.='First name']");
//    static final By FIRST_NAME_INPUT = By.xpath("//input[@name='firstname']");
//    static final By LAST_NAME_LABEL = By.xpath("//label[.='Last name']");
//    static final By LAST_NAME_INPUT = By.xpath("//input[@name='lastname']");
//    static final By USERNAME_LABEL = By.xpath("//label[.='Username']");
//    static final By USERNAME_INPUT = By.xpath("//input[@name='username']");
//    static final By EMAIL_ADDRESS_LABEL = By.xpath("//label[.='Email address']");
//    static final By EMAIL_ADDRESS_INPUT = By.xpath("//input[@name='email']");
//    static final By PASSWORD_LABEL = By.xpath("//label[.='Password']");
//    static final By PASSWORD_INPUT = By.xpath("//input[@name='password']");
//    static final By PHONE_NUMBER_LABEL = By.xpath("//label[.='Phone number']");
//    static final By PHONE_NUMBER_INPUT = By.xpath("//input[@name='phone']");
//    static final By GENDER_LABEL = By.xpath("//label[.='Gender']");
//    static final By GENDER_INPUT_MALE = By.xpath("//input[@value='male']");
//    static final By GENDER_INPUT_FEMALE = By.xpath("//input[@value='female']");
//    static final By GENDER_INPUT_OTHER = By.xpath("//input[@value='other']");
//    static final By DATE_OF_BIRTH_LABEL = By.xpath("//label[.='Date of birth']");
//    static final By DATE_OF_BIRTH_INPUT = By.xpath("//input[@name='birthday']");
//    static final By DEPARTMENT_OFFICE_LABEL = By.xpath("//label[.='Department / Office']");
//    static final By JOB_TITLE_LABEL = By.xpath("//label[.='Job title']");
//    static final By SELECT_PROGRAMMING_LANGUAGES_LABEL = By.xpath("//label[.='Select programming languages']");
//    static final By SELECT_PROGRAMMING_LANGUAGES_INPUT_CPP = By.xpath("//label[.='C++']/preceding-sibling::input");
//    static final By SELECT_PROGRAMMING_LANGUAGES_INPUT_JAVA = By.xpath("//label[.='Java']/preceding-sibling::input");
//    static final By SELECT_PROGRAMMING_LANGUAGES_INPUT_JAVASCRIPT = By.xpath("//label[.='JavaScript']/preceding-sibling::input");
//
//    static final By SIGN_UP_BUTTON = By.xpath("//button[@type='submit']");
//    static final By SUCCESSFUL_FORM_SUBMISSION = By.xpath("//div[@class='alert alert-success']");
//    static final By UNSUCCESSFUL_FORM_SUBMISSION = By.xpath("//div[@class='alert alert-danger']");
//
//    static final By SELECT_DEPARTMENT_OFFICE = By.xpath("//select[@name='department']");
//    static final By SELECT_JOB_TITLE = By.xpath("//select[@name='job_title']");
//    static final Select dropDownDepartmentOffice;
//    static final Select dropDownJobTitle;
//
//
//    static {
//        getDriver().get(getProperty("registrationForm"));
//        dropDownDepartmentOffice = new Select(getDriver().findElement(SELECT_DEPARTMENT_OFFICE));
//        dropDownJobTitle = new Select(getDriver().findElement(SELECT_JOB_TITLE));
//    }
//
//    @Test (priority = 1)
//    public static void testRegistrationPage_HappyPath() {
//        assertRegistrationFormLabels();
//        assertRegistrationFormPlaceHolders();
//        assertNoOptionsAreSelected();
//        fillRegistrationPage();
//        submitRegistrationForm();
//        assertSuccessfulSubmission();
//    }
//
//    @Test (priority = 2)
//    public static void testRegistrationPage_Negative() {
//        assertRegistrationFormLabels();
//        assertRegistrationFormPlaceHolders();
//        assertNoOptionsAreSelected();
//        submitRegistrationForm();
//        assertUnSuccessfulSubmission();
//        validateAllFieldsAreRequired();
//    }
//
//    public static void fillRegistrationPage() {
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        Faker faker = new Faker();
//        Map<By, String> map = new LinkedHashMap<>(Map.of(FIRST_NAME_INPUT, faker.name().firstName(), LAST_NAME_INPUT, faker.name().lastName(), USERNAME_INPUT, faker.name().username().replace(".", ""), EMAIL_ADDRESS_INPUT, faker.internet().emailAddress(), PASSWORD_INPUT, faker.internet().password(), PHONE_NUMBER_INPUT, faker.numerify("###-###-####"), DATE_OF_BIRTH_INPUT, sdf.format(faker.date().birthday())));
//        map.forEach((By, fakerData) -> {
//            getDriver().findElement(By).sendKeys(fakerData);
//        });
//        List<By> list = new ArrayList<>(Arrays.asList(GENDER_INPUT_MALE, GENDER_INPUT_FEMALE, GENDER_INPUT_OTHER, SELECT_PROGRAMMING_LANGUAGES_INPUT_CPP, SELECT_PROGRAMMING_LANGUAGES_INPUT_JAVA, SELECT_PROGRAMMING_LANGUAGES_INPUT_JAVASCRIPT));
//        list.forEach((each) -> {
//            getDriver().findElement(each).click();
//        });
//        dropDownDepartmentOffice.getOptions().forEach(each -> each.click());
//        dropDownJobTitle.getOptions().forEach(each -> each.click());
//    }
//
//
//    public static void assertRegistrationFormLabels() {
//        Map<By, String> map = new LinkedHashMap<>(Map.of(FIRST_NAME_LABEL, "First name", LAST_NAME_LABEL, "Last name", USERNAME_LABEL, "Username", EMAIL_ADDRESS_LABEL, "Email address", PASSWORD_LABEL, "Password", PHONE_NUMBER_LABEL, "Phone number", GENDER_LABEL, "Gender", DATE_OF_BIRTH_LABEL, "Date of birth", DEPARTMENT_OFFICE_LABEL, "Department / Office"));
//        map.put(JOB_TITLE_LABEL, "Job title");
//        map.put(SELECT_PROGRAMMING_LANGUAGES_LABEL, "Select programming languages");
//        map.forEach((By, expectedLabel) -> {
//            assertEquals(getDriver().findElement(By).getText(), expectedLabel, "Actual does NOT match expected:\n" + getDriver().findElement(By).getText() + "\n" + expectedLabel);
//        });
//    }
//
//    public static void assertRegistrationFormPlaceHolders() {
//        Map<By, String> map = new LinkedHashMap<>(Map.of(FIRST_NAME_INPUT, "first name", LAST_NAME_INPUT, "last name", USERNAME_INPUT, "username", EMAIL_ADDRESS_INPUT, "email@email.com", PASSWORD_INPUT, "", PHONE_NUMBER_INPUT, "571-000-0000", DATE_OF_BIRTH_INPUT, "MM/DD/YYYY"));
//        map.forEach((By, expectedPlaceHolder) -> {
//            assertEquals(getDriver().findElement(By).getAttribute("placeholder"), expectedPlaceHolder, "Actual does NOT match expected:\n" + getDriver().findElement(By).getAttribute("placeholder") + "\n" + expectedPlaceHolder);
//        });
//        assertEquals(dropDownDepartmentOffice.getFirstSelectedOption().getText(), "Select your Department/Office", "Actual does NOT match expected");
//        assertEquals(dropDownJobTitle.getFirstSelectedOption().getText(), "Select job type", "Actual does NOT match expected");
//    }
//
//    public static void assertNoOptionsAreSelected() {
//        List<By> list = new ArrayList<>(Arrays.asList(GENDER_INPUT_MALE, GENDER_INPUT_FEMALE, GENDER_INPUT_OTHER, SELECT_PROGRAMMING_LANGUAGES_INPUT_CPP, SELECT_PROGRAMMING_LANGUAGES_INPUT_JAVA, SELECT_PROGRAMMING_LANGUAGES_INPUT_JAVASCRIPT));
//        list.forEach((By) -> {
//            assertTrue(!getDriver().findElement(By).isSelected());
//        });
//    }
//
//    public static void submitRegistrationForm() {
//        getDriver().findElement(SIGN_UP_BUTTON).click();
//    }
//
//    public static void assertSuccessfulSubmission() {
//        assertEquals(getDriver().findElement(SUCCESSFUL_FORM_SUBMISSION).getText(), "Thanks for signing up!", "Actual does NOT match expected");
//    }
//
//    public static void assertUnSuccessfulSubmission() {
//        assertEquals(getDriver().findElement(UNSUCCESSFUL_FORM_SUBMISSION).getText(), "Please fix the errors below", "Actual does NOT match expected");
//    }
//
//    public static void validateAllFieldsAreRequired() {
//        List<WebElement> list = getDriver().findElements(By.xpath("//small[1][@class='help-block']"));
//        list.forEach((each) -> {
//            assertTrue(each.getText().contains(" is required"));
//        });
//    }
//
//
//}
