package core;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.*;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import utils.Log4Test;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;


public abstract class TestBase {

    protected AppiumDriver appiumDriver;
    public SoftAssert softAssert = new SoftAssert();


    @BeforeClass
    protected void setUp() throws MalformedURLException {
        URL remoteAddress = new URL("http://127.0.0.1:4723/wd/hub");


        switch(CommonTask.getOS()){
            case "Android":
                DesiredCapabilities capabilities = new DesiredCapabilities();
              /*  capabilities.setCapability("app", new File(
                        "app/latest.apk").getAbsolutePath());*/
                capabilities.setCapability("appPackage", TestData.APP_PACKAGE);
                capabilities.setCapability("appActivity", TestData.APP_ACTIVITY);
                capabilities.setCapability(CapabilityType.VERSION, 4.4);
                capabilities.setCapability("automationName", "Appium");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("deviceName", "emulator-5554");
                capabilities.setCapability("newCommandTimeout", 200);
                appiumDriver = new AndroidDriver<MobileElement>(remoteAddress, capabilities);
                break;
            case "iOS":
                DesiredCapabilities capabilities2 = new DesiredCapabilities();
                capabilities2.setCapability("app", new File("app/SmartMobile.app").getAbsolutePath());
                capabilities2.setCapability("appPackage", "ro.raiffeisen.smartmobile.development");
                capabilities2.setCapability("automationName", "XCUITest");
                capabilities2.setCapability("platformName", "iOS");
                capabilities2.setCapability("deviceName", "iPhone 6 Plus");
                capabilities2.setCapability("platformVersion","10.3");
                capabilities2.setCapability("newCommandTimeout", 200);
                appiumDriver = new IOSDriver<MobileElement>(remoteAddress, capabilities2);
                break;
        }
    }

    public void setUp(String testID, String testTitle) {
        Log4Test.info("                                                                                                    ");
        Log4Test.info("------------------- TEST ID : " + testID);
        Log4Test.info("------------------- TEST TITLE : " + testTitle);
        Log4Test.info("------------- User is on LOGIN PAGE");

    }

    public void setUp(String testID, String testTitle, String username, String password) {
        Log4Test.info("                                                                                                    ");
        Log4Test.info("------------------- Test ID: " + testID);
        Log4Test.info("------------------- Test Title: " + testTitle);
        Log4Test.info("-------------  User is on LOGIN PAGE");
        LoginPage loginPage = new LoginPage(appiumDriver);
        loginPage.loginWith(username, password);
        Log4Test.info("-------------  The user is on MAIN PAGE and he's logged in");
    }


    @BeforeMethod
    protected void resetApp(){
        Log4Test.info("                                                                                                    ");
        Log4Test.info("------------------- START TEST");
        appiumDriver.resetApp();

    }

    @AfterClass (alwaysRun = true)
    protected void tearDown(){
        appiumDriver.quit();
    }
}
