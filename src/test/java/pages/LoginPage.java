package pages;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import AutomationFramework.Waiting;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.MobileElement;
import org.testng.Assert;
import utils.Log4Test;



/**
 * Created by azaharia on 28.04.2017.
 */
public class LoginPage extends GeneralPage{

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    // -------------------------------- Locators

    // -------------- Tab

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/largeLabel")
    @iOSFindBy(xpath = "//*[@name=\"SmartMobile\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTabBar[1]/XCUIElementTypeButton[1]")
    private MobileElement loginTabLabel;


    // --------------

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_login_welcome_label")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement welcomeLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rb_language_ro")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[1]")
    public MobileElement languageROButton;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rb_language_en")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[2]")
    private MobileElement languageENButton;
    
    @AndroidFindBy(id = "ro.raiffeisen.cxp.raiffeisenbankromania:id/ivLoginBankLogo")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]")
    private MobileElement loginBankLogo;
    
    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_forgot_password")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
    public MobileElement forgotPasswordLink;


    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/til_login_username")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
    public MobileElement usernameField;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/et_login_username")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
    public MobileElement usernameTextField;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/til_login_password")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField[1]")
    public MobileElement passwordField;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/et_login_password")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField[1]")
    public MobileElement passwordTextField;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/btn_authenticate")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
    public MobileElement authenticationButton;
    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_login_error_message")
    private MobileElement authenticationErrorMessage;

    @AndroidFindBy(id = "ro.raiffeisen.cxp.raiffeisenbankromania:id/progressBarIndeterminateLoader")
    private MobileElement loader;


    // -------------------------------- Methods


    public void loginWith(String username, String password){
        CommonTask.setTextField(driver, usernameTextField, username, "username field");
        CommonTask.sendKeys(passwordField, password, "password field");
        driver.hideKeyboard();
        CommonTask.tapButton(driver, authenticationButton, TestData.AUTH + TestData.BUTTON);
        Waiting.invisibilityOfElement(driver, loader, "loader");
    }

    public void loginWithIncorrect(String username, String password){
        CommonTask.setTextField(driver, usernameTextField, username, "username field");
        CommonTask.sendKeys(passwordField, password, "password field");
        driver.hideKeyboard();
        CommonTask.tapButton(driver, authenticationButton, TestData.AUTH + TestData.BUTTON);
    }

    public void fillCredentialsUsernameAndPassword(String username, String password){
        CommonTask.setTextField(driver, usernameTextField, username, "username field");
        CommonTask.sendKeys(passwordField, password, "password field");
        driver.hideKeyboard();
    }




    // ---------- Tap elements
    public void tapElement(String elementName){
        switch (elementName) {
            default:
                Assert.fail(Log4Test.error("Chosen param for 'tapElement' element is not correct : " + elementName));
                break;
            case TestData.AUTH_BUTTON:
                CommonTask.tapButton(driver, authenticationButton, TestData.AUTH_BUTTON);
                break;
        }
    }


    // ---------- Get text labels methods
    public String getTextFor(String elementName) {
        String value = "";
        switch (elementName) {
            default:
                Assert.fail(Log4Test.error("Chosen param for 'getTextFor'  element is not correct : " + elementName));
                break;
            case TestData.LOGIN_TAB:
                value = CommonTask.getText(loginTabLabel, TestData.LOGIN_TAB + TestData.LABEL);
                break;
            case TestData.WELCOME_MESSAGE_LABEL:
                value = CommonTask.getText(welcomeLabel, TestData.WELCOME_MESSAGE_LABEL);
                break;
            case TestData.RO_LANGUAGE_BUTTON:
                value = CommonTask.getText(languageROButton, TestData.RO_LANGUAGE_BUTTON);
                break;
            case TestData.EN_LANGUAGE_BUTTON:
                value = CommonTask.getText(languageENButton, TestData.EN_LANGUAGE_BUTTON);
                break;
            case TestData.USERNAME_FIELD:
                value = CommonTask.getText(usernameField, TestData.USERNAME_FIELD);
                break;
            case TestData.PASSWORD_FIELD:
                value = CommonTask.getText(passwordField, TestData.PASSWORD_FIELD);
                break;
            case TestData.FORGOT_PASSWORD_LINK:
                value = CommonTask.getText(forgotPasswordLink, TestData.PASSWORD_FIELD);
                break;
            case TestData.AUTH_BUTTON:
                value = CommonTask.getText(authenticationButton, TestData.PASSWORD_FIELD);
                break;
            case TestData.AUTH_ERROR:
                Waiting.visibilityOfElement(driver, authenticationErrorMessage, TestData.AUTH_ERROR);
                value = CommonTask.getText(authenticationErrorMessage, TestData.AUTH_ERROR);
                break;
        }
        return value;
    }

    public String getAttributeFor(String elementName){
        String value = "";

        switch (elementName){
            default:
                Assert.fail(Log4Test.error("Chosen param for 'getAttributeFor' element is not correct: " + elementName));
                break;
            case TestData.USERNAME_FIELD:
                value = CommonTask.getAttributeAsText(usernameField,"value",elementName);
                break;
            case TestData.PASSWORD_FIELD:
                value = CommonTask.getAttributeAsText(passwordField,"value",elementName);
                break;
        }
        return value;
    }

            //---------- Verify elements are enabled
    public boolean isElementEnabledAndDisplayed(String elementName) {
        boolean value = false;
        switch (elementName) {
            default: Assert.fail(Log4Test.error("Chosen param for 'isDisplayed' element is not correct : " + elementName));
                break;
            case TestData.LOGIN_TAB: value = CommonTask.isElementEnabledAndDisplayed(loginTabLabel, TestData.LOGIN_TAB + TestData.LABEL);
                break;
        }
        return value;
    }



    public boolean isAuthButtonEnabled(){
        return CommonTask.isEnabled(authenticationButton, "authentification button");
    }

}
