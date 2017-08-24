package tests;


import AutomationFramework.CommonTask;
import AutomationFramework.Key;
import AutomationFramework.TestData;
import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ContactPage;
import pages.GeneralPage;
import pages.LoginPage;
import utils.Log4Test;

/**
 * Created by azaharia on 16.05.2017.
 */
public class ContactTest extends TestBase {

    @Test(groups = {TestData.CONTACT_GROUP, TestData.UI_GROUP}, description = "Verify the labels are correct on the Contact Screen for RO Profile")
    public void Contact_01() {
        setUp("Contact_01", "Verify the labels are correct on the Contact Screen for RO Profile");

        GeneralPage gp = new GeneralPage(appiumDriver);
       // gp.selectLanguageProfile(TestData.RO);
        gp.navigateTo(TestData.CONTACT_TAB);

        ContactPage cp = new ContactPage(appiumDriver);

        Log4Test.test("Assert Contact Tab Label");
        softAssert.assertEquals(cp.getTextFor(TestData.CONTACT_TAB), TestData.BOTH_CONTACT, TestData.CONTACT_TAB + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Contact Header Label");
        softAssert.assertEquals(cp.getTextFor(TestData.CONTACT_HEADER), TestData.RO_CONTACT_DETAILS, TestData.CONTACT_HEADER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Question Label");
        softAssert.assertEquals(cp.getTextFor(TestData.QUESTION), TestData.RO_QUESTION, TestData.QUESTION + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Suggestion Label");
        softAssert.assertEquals(cp.getTextFor(TestData.SUGGESTION), TestData.RO_SUGGESTION, TestData.SUGGESTION + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Phone number description label");
        softAssert.assertEquals(cp.getTextFor(TestData.PHONE_DETAILS), TestData.RO_PHONE_DETAILS, TestData.PHONE_DETAILS + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Phone number");
        softAssert.assertEquals(cp.getTextFor(TestData.PHONE_NUMBER), TestData.BOTH_PHONE_NUMBER,  TestData.PHONE_NUMBER + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Email Address Label");
        softAssert.assertEquals(cp.getTextFor(TestData.EMAIL), TestData.RO_EMAIL_LABEL, TestData.EMAIL + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Email Address");
        softAssert.assertEquals(cp.getTextFor(TestData.EMAIL_ADDRESS), TestData.BOTH_EMAIL_ADDRESS, TestData.EMAIL_ADDRESS + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Website Label");
        softAssert.assertEquals(cp.getTextFor(TestData.WEBSITE), TestData.RO_WEBSITE_LABEL, TestData.WEBSITE + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Website Address");
        softAssert.assertEquals(cp.getTextFor(TestData.WEBSITE_ADDRESS), TestData.BOTH_WEBSITE_ADDRESS, TestData.WEBSITE_ADDRESS  + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Follow us Label");
        softAssert.assertEquals(cp.getTextFor(TestData.FOLLOW_US), TestData.RO_FOLLOW_US, TestData.FOLLOW_US + TestData.LABEL_IS_NOT_CORRECT);

        softAssert.assertAll();
    }

    @Test(groups = {TestData.CONTACT_GROUP, TestData.UI_GROUP}, description = "Verify the labels are correct on the Contact Screen for EN Profile")
    public void Contact_02() {
        setUp("Contact_02", "Verify the labels are correct on the Contact Screen for EN Profile");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.selectLanguageProfile(TestData.EN);
        gp.navigateTo(TestData.CONTACT_TAB);


        ContactPage cp = new ContactPage(appiumDriver);

        Log4Test.test("Assert Contact Tab Label");
        softAssert.assertEquals(cp.getTextFor(TestData.CONTACT_TAB), TestData.BOTH_CONTACT, TestData.CONTACT_TAB + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Contact Header Label");
        softAssert.assertEquals(cp.getTextFor(TestData.CONTACT_HEADER), TestData.EN_CONTACT_DETAILS, TestData.CONTACT_HEADER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Question Label");
        softAssert.assertEquals(cp.getTextFor(TestData.QUESTION), TestData.EN_QUESTION, TestData.QUESTION + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Suggestion Label");
        softAssert.assertEquals(cp.getTextFor(TestData.SUGGESTION), TestData.EN_SUGGESTION, TestData.SUGGESTION + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Phone number description label");
        softAssert.assertEquals(cp.getTextFor(TestData.PHONE_DETAILS), TestData.EN_PHONE_DETAILS, TestData.PHONE_DETAILS + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Phone number");
        softAssert.assertEquals(cp.getTextFor(TestData.PHONE_NUMBER), TestData.BOTH_PHONE_NUMBER,  TestData.PHONE_NUMBER + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Email Address Label");
        softAssert.assertEquals(cp.getTextFor(TestData.EMAIL), TestData.EN_EMAIL_LABEL, TestData.EMAIL + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Email Address");
        softAssert.assertEquals(cp.getTextFor(TestData.EMAIL_ADDRESS), TestData.BOTH_EMAIL_ADDRESS, TestData.EMAIL_ADDRESS + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Website Label");
        softAssert.assertEquals(cp.getTextFor(TestData.WEBSITE), TestData.EN_WEBSITE_LABEL, TestData.WEBSITE + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Website Address");
        softAssert.assertEquals(cp.getTextFor(TestData.WEBSITE_ADDRESS), TestData.BOTH_WEBSITE_ADDRESS, TestData.WEBSITE_ADDRESS  + TestData.IS_NOT_CORRECT);

        Log4Test.test("Assert Follow us Label");
        softAssert.assertEquals(cp.getTextFor(TestData.FOLLOW_US), TestData.EN_FOLLOW_US, TestData.FOLLOW_US + TestData.LABEL_IS_NOT_CORRECT);

        softAssert.assertAll();
    }

    @Test(groups = {TestData.CONTACT_GROUP, TestData.UI_GROUP}, description = "Verify that elements on Contact Page are present and displayed")
    public void Contact_03() {
        setUp("Contact_03", "Verify that elements on Contact Page are present and displayed");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.navigateTo(TestData.CONTACT_TAB);

        ContactPage cp = new ContactPage(appiumDriver);

        Log4Test.test("Assert that Phone Icon is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.PHONE_ICON), TestData.PHONE_ICON + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Phone Arrow is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.PHONE_ARROW), TestData.PHONE_ARROW + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Email Icon is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.EMAIL_ICON), TestData.EMAIL_ICON + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Email Arrow is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.EMAIL_ARROW), TestData.EMAIL_ARROW + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Website Icon is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.WEBSITE_ICON), TestData.WEBSITE_ICON + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Website Arrow is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.WEBSITE_ARROW), TestData.WEBSITE_ARROW + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Facebook Icon is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.FACEBOOK_ICON), TestData.FACEBOOK_ICON + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Linkedin Icon is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.LINKEDIN_ICON), TestData.LINKEDIN_ICON + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Youtube Icon is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.YOUTUBE_ICON), TestData.YOUTUBE_ICON + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that Instagram Icon is enabled and displayed");
        softAssert.assertTrue(cp.isElementEnabledAndDisplayed(TestData.INSTAGRAM_ICON), TestData.INSTAGRAM_ICON + TestData.IS_ENABLED_AND_DISPLAYED);

        softAssert.assertAll();


    }

    @Test(groups = {TestData.CONTACT_GROUP, TestData.FNCT_GROUP}, description = "Verify call action")
    public void Contact_04() {

        setUp("Contact_04", "Verify call action");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.navigateTo(TestData.CONTACT_TAB);

        ContactPage cp = new ContactPage(appiumDriver);

        cp.tapElement(TestData.PHONE_ARROW);
        Log4Test.test("Assert Correct number is displayed when pressing phone arrow");
        Assert.assertEquals(cp.getTextFor(TestData.PHONE_CONTACT_DEVICE), TestData.BOTH_PHONE_NUMBER, "Correct number is displayed");

        CommonTask.switchToRaiffApp(appiumDriver);

        cp.tapElement(TestData.PHONE_ICON);
        Log4Test.test("Assert Correct number is displayed when pressing phone icon");
        Assert.assertEquals(cp.getTextFor(TestData.PHONE_CONTACT_DEVICE), TestData.BOTH_PHONE_NUMBER, "Correct number is displayed");
    }

    @Test(groups = {TestData.CONTACT_GROUP, TestData.FNCT_GROUP}, description = "Verify email action")
    public void Contact_05() {

        setUp("Contact_05", "Verify email action");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.navigateTo(TestData.CONTACT_TAB);

        ContactPage cp = new ContactPage(appiumDriver);

        cp.tapElement(TestData.EMAIL_ARROW);
        Log4Test.test("Assert GMail is opening when pressing email arrow");
        Assert.assertEquals(cp.getTextFor(TestData.GOOGLE_MAIL_WELCOME_MESSAGE), "Welcome to Gmail", "Welcome message for GMail is correct");

        CommonTask.switchToRaiffApp(appiumDriver);

        cp.tapElement(TestData.EMAIL_ICON);
        Log4Test.test("Assert GMail is opening when pressing email icon");
        Assert.assertEquals(cp.getTextFor(TestData.GOOGLE_MAIL_WELCOME_MESSAGE), "Welcome to Gmail", "Welcome message for GMail is correct");

    }

    @Test(groups = {TestData.CONTACT_GROUP, TestData.FNCT_GROUP}, description = "Verify website action")
    public void Contact_06() {

        setUp("Contact_06", "Verify website action");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.navigateTo(TestData.CONTACT_TAB);

        ContactPage cp = new ContactPage(appiumDriver);

        cp.tapElement(TestData.WEBSITE_ARROW);
        Log4Test.test("Assert Browser chooser is opening when pressing website arrow");
        Assert.assertTrue(cp.isJustOnceButtonDisplayed(), "Browser chooser is present");

        CommonTask.tapButton(appiumDriver, Key.BACK_BUTTON);
        CommonTask.switchToRaiffApp(appiumDriver);

        cp.tapElement(TestData.WEBSITE_ICON);
        Log4Test.test("Assert Browser chooser is opening when pressing website icon");
        Assert.assertTrue(cp.isJustOnceButtonDisplayed(), "Browser chooser is present");
    }


}
