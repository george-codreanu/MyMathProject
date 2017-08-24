package tests;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Log4Test;


/**
 * Created by azaharia on 28.04.2017.
 */
public class LoginTest extends TestBase{

    @Test(groups = {TestData.ANDROID_GROUP,  TestData.LOGIN_GROUP, TestData.UI_GROUP}, description = "Verify the labels are correct on the Login Screen for RO Profile")
    public void Login_01() {

        setUp("Login_01", "Verify the labels are correct on the Login Screen for RO Profile");

        LoginPage lp = new LoginPage(appiumDriver);
        lp.selectLanguageProfile(TestData.RO);

        if(CommonTask.getOS()=="Android"){
            Log4Test.test("Assert login tab label");
            softAssert.assertEquals(lp.getTextFor(TestData.LOGIN_TAB), TestData.LOGIN_TAB_LABEL, TestData.LOGIN_TAB + TestData.LABEL + TestData.IS_NOT_CORRECT);

            Log4Test.test("Assert Username label");
            softAssert.assertEquals(lp.getTextFor(TestData.USERNAME_FIELD), TestData.RO_USERNAME_FIELD, TestData.USERNAME_FIELD + TestData.LABEL + TestData.IS_NOT_CORRECT);

            Log4Test.test("Assert Password label");
            softAssert.assertEquals(lp.getTextFor(TestData.PASSWORD_FIELD),  TestData.RO_PASSWORD_FIELD, TestData.PASSWORD_FIELD + TestData.LABEL + TestData.IS_NOT_CORRECT);
        }

        if(CommonTask.getOS()=="iOS"){
            Log4Test.test("Assert login tab label");
            softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.LOGIN_TAB),TestData.LOGIN_TAB + TestData.LABEL + TestData.IS_NOT_CORRECT);

            Log4Test.test("Assert Username label");
            softAssert.assertEquals(lp.getAttributeFor(TestData.USERNAME_FIELD), TestData.RO_USERNAME_FIELD, TestData.USERNAME_FIELD + TestData.LABEL + TestData.IS_NOT_CORRECT);

            Log4Test.test("Assert Password label");
            softAssert.assertEquals(lp.getAttributeFor(TestData.PASSWORD_FIELD),  TestData.RO_PASSWORD_FIELD, TestData.PASSWORD_FIELD + TestData.LABEL + TestData.IS_NOT_CORRECT);

        }

        Log4Test.test("Assert RO Button label");
        softAssert.assertEquals(lp.getTextFor(TestData.RO_LANGUAGE_BUTTON), TestData.RO, TestData.RO_LANGUAGE_BUTTON + TestData.LABEL + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Welcome Message label");
        softAssert.assertEquals(lp.getTextFor(TestData.WELCOME_MESSAGE_LABEL), TestData.RO_WELCOME_MESSAGE, TestData.WELCOME_MESSAGE_LABEL + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Forgot Password label");
        softAssert.assertEquals(lp.getTextFor(TestData.FORGOT_PASSWORD_LINK), TestData.RO_FORGOT_PASSWORD_LINL, TestData.FORGOT_PASSWORD_LINK + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Authentication button label");
        softAssert.assertEquals(lp.getTextFor(TestData.AUTH_BUTTON), TestData.RO_AUTH_BUTTON, TestData.AUTH_BUTTON + TestData.LABEL + TestData.IS_NOT_CORRECT);

        softAssert.assertAll();
    }

    @Test(groups = {TestData.ANDROID_GROUP, TestData.LOGIN_GROUP, TestData.UI_GROUP}, description = "Verify the labels are correct on the Login Screen for EN Profile")
    public void Login_02() {

        setUp("Login_02", "Verify the labels are correct on the Login Screen for EN Profile");

        LoginPage lp = new LoginPage(appiumDriver);
        lp.selectLanguageProfile(TestData.EN);

        if(CommonTask.getOS()=="Android"){
            Log4Test.test("Assert login tab label");
            softAssert.assertEquals(lp.getTextFor(TestData.LOGIN_TAB), TestData.LOGIN_TAB_LABEL, TestData.LOGIN_TAB + TestData.LABEL + TestData.IS_NOT_CORRECT);

            Log4Test.test("Assert Username label");
            softAssert.assertEquals(lp.getTextFor(TestData.USERNAME_FIELD), TestData.EN_USERNAME_FIELD, TestData.USERNAME_FIELD + TestData.LABEL + TestData.IS_NOT_CORRECT);

            Log4Test.test("Assert Password label");
            softAssert.assertEquals(lp.getTextFor(TestData.PASSWORD_FIELD),  TestData.EN_PASSWORD_FIELD, TestData.PASSWORD_FIELD + TestData.LABEL + TestData.IS_NOT_CORRECT);
        }

        if(CommonTask.getOS()=="iOS"){
            Log4Test.test("Assert login tab label");
            softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.LOGIN_TAB),TestData.LOGIN_TAB + TestData.LABEL + TestData.IS_NOT_CORRECT);

            Log4Test.test("Assert Username label");
            softAssert.assertEquals(lp.getAttributeFor(TestData.USERNAME_FIELD), TestData.EN_USERNAME_FIELD, TestData.USERNAME_FIELD + TestData.LABEL + TestData.IS_NOT_CORRECT);

            Log4Test.test("Assert Password label");
            softAssert.assertEquals(lp.getAttributeFor(TestData.PASSWORD_FIELD),  TestData.EN_PASSWORD_FIELD, TestData.PASSWORD_FIELD + TestData.LABEL + TestData.IS_NOT_CORRECT);

        }

        Log4Test.test("Assert RO Button label");
        softAssert.assertEquals(lp.getTextFor(TestData.EN_LANGUAGE_BUTTON), TestData.EN, TestData.EN_LANGUAGE_BUTTON + TestData.LABEL + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Welcome Message label");
        softAssert.assertEquals(lp.getTextFor(TestData.WELCOME_MESSAGE_LABEL), TestData.EN_WELCOME_MESSAGE, TestData.WELCOME_MESSAGE_LABEL + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Forgot Password label");
        softAssert.assertEquals(lp.getTextFor(TestData.FORGOT_PASSWORD_LINK), TestData.EN_FORGOT_PASSWORD_LINL, TestData.FORGOT_PASSWORD_LINK + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Authentication button label");
        softAssert.assertEquals(lp.getTextFor(TestData.AUTH_BUTTON), TestData.EN_AUTH_BUTTON, TestData.AUTH_BUTTON + TestData.LABEL + TestData.IS_NOT_CORRECT);

        softAssert.assertAll();
    }

    @Test(groups = {TestData.ANDROID_GROUP, TestData.LOGIN_GROUP, TestData.FNCT_GROUP}, description = "Verify the labels are correct for invalid auth, auth button is enabled after and that placeholder change after user input")
    public void Login_03() {
        setUp("Login_03", "Verify the labels are correct for invalid auth, auth button is enabled after password and username inputs and that placeholder change after user input");

        LoginPage lp = new LoginPage(appiumDriver);
        lp.selectLanguageProfile(TestData.RO);

        Log4Test.test("Assert Auth Button is disabled");
        softAssert.assertFalse(lp.isAuthButtonEnabled(), TestData.AUTH_BUTTON + TestData.IS_ENABLED);

        lp.loginWithIncorrect("username", "password");
        Log4Test.test("Assert Auth Error Message RO");
        softAssert.assertEquals(lp.getTextFor(TestData.AUTH_ERROR), TestData.RO_AUTHENTICATION_ERROR_MESSAGE,  TestData.AUTH_ERROR + TestData.IS_NOT_CORRECT);

        lp.selectLanguageProfile(TestData.EN);
        lp.loginWithIncorrect("username", "password");
        Log4Test.test("Assert Auth Error Message EN");
        softAssert.assertEquals(lp.getTextFor(TestData.AUTH_ERROR), TestData.EN_AUTHENTICATION_ERROR_MESSAGE, TestData.AUTH_ERROR + TestData.IS_NOT_CORRECT);

        lp.fillCredentialsUsernameAndPassword("username", "password");
        Log4Test.test("Assert Auth Button is enabled");
        softAssert.assertTrue(lp.isAuthButtonEnabled(), TestData.AUTH_BUTTON + TestData.IS_ENABLED);

        softAssert.assertAll();
    }

    @DataProvider(name ="usernameAndPassword")
    public Object[][] getData() {
        Object[][] usernameAndPassword = new Object[3][2];

        usernameAndPassword[0][0] = TestData.TEST_PF_01_USERNAME;
        usernameAndPassword[0][1] = "password";
        usernameAndPassword[0][2] = "Correct username and wrong password";

        usernameAndPassword[1][0] = "username";
        usernameAndPassword[1][1] = TestData.TEST_PF_01_PASSWORD;
        usernameAndPassword[1][2] = "Wrong username and correct password";

        return usernameAndPassword;
    }

    @Test(groups = {TestData.ANDROID_GROUP, TestData.LOGIN_GROUP, TestData.FNCT_GROUP}, description = "Verify login functionality ", dataProvider = "usernameAndPassword")
    public void Login_04(String username, String password, String type) {

        setUp("Login_04", "Verify login is possible without valid credentials and assert authentication error message");

        LoginPage lp = new LoginPage(appiumDriver);
        lp.selectLanguageProfile(TestData.RO);
        Log4Test.test("Verify login with : " + type);
        lp.loginWithIncorrect(username, password);
        Assert.assertEquals(lp.getTextFor(TestData.AUTH_ERROR), TestData.RO_AUTHENTICATION_ERROR_MESSAGE, "Login is not possible with invalid credentials");

    }




}
