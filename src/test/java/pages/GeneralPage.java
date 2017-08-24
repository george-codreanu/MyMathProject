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

    @AndroidFindBy(id = "com.google.android.gm:id/welcome_tour_title")
    public MobileElement googleMailWelcomeMessage;


    //Language options
    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rb_language_ro")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[1]")
    private MobileElement languageROButton;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rb_language_en")
    @iOSFindBy(xpath = "//*[@name=\"EN\"]")
    private MobileElement languageENButton;


    // Tabs and headers
    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_login")
    private MobileElement loginTab;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_locator")
    private MobileElement locatorTab;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_interest_rates")
    private MobileElement interestRatesTab;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_contact")
    private MobileElement contactTab;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/navigation_exchange")
    private MobileElement exchangeRatesTab;


    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_toolbar_title")
    private MobileElement header;


    // -------------------------------- Methods

    public void switchToRaiffApp() {
        CommonTask.tapButton(driver, Key.APP_SWITCH_BUTTON);
        CommonTask.tapButton(driver, applicationSwitch, TestData.RAIFF_APP);
    }

    public void selectLanguageProfile(String language) {

        Log4Test.info("- selecting " + language + " language");

        switch (CommonTask.getOS()) {
            case "iOS":
                if (language == TestData.EN) {
                    CommonTask.clickElement(driver, languageENButton, TestData.EN_LANGUAGE + TestData.BUTTON);}
                if (language == TestData.RO) {
                    CommonTask.clickElement(driver, languageROButton, TestData.RO_LANGUAGE + TestData.BUTTON);}
                break;
            case "Android":
                if (language == TestData.EN) {
                    CommonTask.tapButton(driver, languageENButton, TestData.EN_LANGUAGE + TestData.BUTTON);}
                if (language == TestData.RO) {
                    CommonTask.tapButton(driver, languageROButton, TestData.RO_LANGUAGE + TestData.BUTTON);}
                break;

            default:
                Assert.fail(Log4Test.error("Selected Language Profile is not correct : " + language));
                break;
        }
    }



//                    if (language.equals(TestData.RO))
//                        CommonTask.tapButton(driver, languageROButton, TestData.RO_LANGUAGE + TestData.BUTTON);
//                    else if (language.equals(TestData.EN))
//                        CommonTask.tapButton(driver, languageENButton, TestData.EN_LANGUAGE + TestData.BUTTON);
//                    else Assert.fail(Log4Test.error("Selected Language Profile is not correct : " + language));



    //USE ENGLISH NAMING VAR
    public void navigateTo(String tabName) {
        if (tabName.equals(TestData.LOGIN_TAB))
            CommonTask.tapButton(driver, loginTab, TestData.LOGIN_TAB);
        else if (tabName.equals(TestData.LOCATOR_TAB))
            CommonTask.tapButton(driver, locatorTab, TestData.LOCATOR_TAB);
        else if (tabName.equals(TestData.INTEREST_RATES_TAB))
            CommonTask.tapButton(driver, interestRatesTab, TestData.INTEREST_RATES_TAB);
        else if (tabName.equals(TestData.CONTACT_TAB))
            CommonTask.tapButton(driver, contactTab, TestData.CONTACT_TAB);
        else if (tabName.equals(TestData.EXCHANGE_RATES_TAB))
            CommonTask.tapButton(driver, exchangeRatesTab, TestData.EXCHANGE_RATES_TAB);

        else Assert.fail(Log4Test.error("Navigation Tab is not correct : " + tabName));
        Log4Test.info("------------- User is on " + tabName.toUpperCase());
    }


    public void tapAllowButton() {
        CommonTask.tapButton(driver, allowButton, "allow button");
    }

    public void tapDenyButton() {
        CommonTask.tapButton(driver, denyButon, "deny button");
    }
}


