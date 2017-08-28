package pages;

import AutomationFramework.CommonTask;
import AutomationFramework.Key;
import AutomationFramework.TestData;
import AutomationFramework.Waiting;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log4Test;


public class GeneralPage {

    public AppiumDriver driver;

    public GeneralPage(AppiumDriver appiumDriver) {
        this.driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    //
    @AndroidFindBy(id = "SmartMobile (development)")
    public MobileElement applicationSwitch;


    // Android Locators

    @AndroidFindBy(id = "android:id/progress")
    public MobileElement loader;

    @AndroidFindBy(id = "com.android.dialer:id/digits")
    public MobileElement phoneContactAndroid;

    @AndroidFindBy(id = "android:id/button_once")
    public MobileElement justOnceButton;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    public MobileElement denyButon;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement allowButton;


    // Gmail Locators

    @AndroidFindBy(xpath = ("//*[@content-desc='Gmail']"))
    public MobileElement googleScreen;


    //Language options
    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rb_language_ro")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[1]")
    private MobileElement languageROButton;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rb_language_en")
    @iOSFindBy(xpath = "//*[@name=\"EN\"]")
    private MobileElement languageENButton;


    // Tabs and headers
    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_login")
    public MobileElement loginTab;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_contact")
    @iOSFindBy(xpath= "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[2]")
    public MobileElement contactTab;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_locator")
    public MobileElement locatorTab;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_exchange")
    public MobileElement exchangeRatesTab;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_interest_rates")
    public MobileElement interestRatesTab;


    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_dashboard")
    public MobileElement dashboardTab;



    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_toolbar_title")
    public MobileElement header;


    // -------------------------------- Methods

    public void switchToRaiffApp() {
        CommonTask.tapButton(driver, Key.APP_SWITCH_BUTTON);
        CommonTask.tapButton(driver, applicationSwitch, TestData.RAIFF_APP);
    }

    public void selectLanguageProfile(String language) {

        Log4Test.info("- selecting " + language + " language");

        switch (language) {
            case "EN":
                CommonTask.tapButton(driver, languageENButton, TestData.EN_LANGUAGE + TestData.BUTTON);
                break;
            case "RO":
                CommonTask.tapButton(driver, languageROButton, TestData.RO_LANGUAGE + TestData.BUTTON);
                break;
            default:
                Assert.fail(Log4Test.error("Selected Language Profile is not correct : " + language));
                break;
        }
    }



    //USE ENGLISH NAMING VAR
    public void navigateTo(String tabName) {

        switch (tabName) {
            case TestData.LOGIN_TAB:
                CommonTask.tapButton(driver, loginTab, TestData.LOGIN_TAB);
                break;
            case TestData.CONTACT_TAB:
                CommonTask.tapButton(driver, contactTab, TestData.CONTACT_TAB);
                break;
            case TestData.LOCATOR_TAB:
                CommonTask.tapButton(driver, locatorTab, TestData.LOCATOR_TAB);
                break;
            case TestData.EXCHANGE_RATES_TAB:
                CommonTask.tapButton(driver, exchangeRatesTab, TestData.EXCHANGE_RATES_TAB);
                break;
            case TestData.INTEREST_RATES_TAB:
                CommonTask.tapButton(driver, interestRatesTab, TestData.INTEREST_RATES_TAB);
                break;
            default:
                Assert.fail(Log4Test.error("Navigation Tab is not correct : " + tabName));
                break;
        }
        Log4Test.info("------------- User is on " + tabName.toUpperCase());
    }


    public void tapAllowButton() {
        CommonTask.tapButton(driver, allowButton, "allow button");
    }

    public void tapDenyButton() {
        CommonTask.tapButton(driver, denyButon, "deny button");
    }
}


