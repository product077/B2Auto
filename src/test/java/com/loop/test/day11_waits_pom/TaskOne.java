//package com.loop.test.day11_waits_pom;
//
//import com.google.gson.internal.bind.util.ISO8601Utils;
//import com.loop.pages.LoopPracticeDynamicLoading1;
//import com.loop.test.utilities.BrowserUtils;
//import com.loop.test.utilities.ConfigurationReader;
//import com.loop.test.utilities.Driver;
//import org.checkerframework.checker.units.qual.C;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import java.util.List;
//import static org.testng.Assert.assertTrue;
//
//public class TaskOne {
//
//    LoopTaskOne loopTaskOne;
//    @BeforeMethod
//    public void setupMethod(){
//        loopTaskOne = new LoopTaskOne();
//        Driver.getDriver().get(ConfigurationReader.getProperty("taskOne.url"));
//
//    }
//    @Test
//    public void setLoopTaskOne(){
//        loopTaskOne.username.sendKeys("Tester");
//        loopTaskOne.password.sendKeys("test");
//        loopTaskOne.loginButton.click();
//        System.out.println(loopTaskOne.myList.size());
//        BrowserUtils.printList(loopTaskOne.myList);
//
//    }
//}
