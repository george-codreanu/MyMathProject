package pages;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.testng.Assert;
import utils.Log4Test;


/**
 * Created by azaharia on 16.05.2017.
 */
public class ContactPage extends GeneralPage {

    public ContactPage(AppiumDriver driver) {
        super(driver);
    }


    // -------------------------------- Locators

    // -------------- Header

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_toolbar_title")
    private MobileElement contactHeader;

    // --------------

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_question_title")
    private MobileElement questionlabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_suggestions")
    private MobileElement suggestionLabel;

    // -------------- Phone

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rl_call_us")
    public MobileElement callAction;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_phone_details")
    private MobileElement phoneIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_phone_details")
    private MobileElement phoneDetailsLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_phone_number")
    private MobileElement phoneNumber;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_arrow_phone")
    private MobileElement phoneArrow;

    // -------------- Email

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rl_mail_us")
    private MobileElement mailAction;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_email")
    private MobileElement emailIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_email")
    private MobileElement emailLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_email_address")
    private MobileElement emailAddress;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_arrow_mail")
    private MobileElement emailArrow;

    // -------------- Website

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rl_website")
    private MobileElement websiteAction;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_visit_us")
    private MobileElement websiteIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_website")
    private MobileElement websiteLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_website_address")
    private MobileElement websiteAddress;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_arrow_website")
    private MobileElement websiteArrow;


    // -------------- Social

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_social_media")
    private MobileElement followUsLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_facebook")
    private MobileElement facebookIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_linkedin")
    private MobileElement linkedinIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_youtube")
    private MobileElement youtubeIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_instagram")
    private MobileElement instagramIcon;



    // -------------------------------- Methods

    // ---------- Tap elements
    public void tapElement(String elementName) {
        switch (elementName) {
            default:
                Assert.fail(Log4Test.error("Chosen param for 'tapElement' element is not correct : " + elementName));
                break;
            case TestData.FACEBOOK_ICON:
                CommonTask.tapButton(driver, facebookIcon, TestData.FACEBOOK_ICON);
                break;
            case TestData.PHONE_ARROW:
                CommonTask.tapButton(driver, phoneArrow, TestData.PHONE_ARROW);
                break;
            case TestData.PHONE_ICON:
                CommonTask.tapButton(driver, phoneIcon, TestData.PHONE_ICON);
                break;
            case TestData.EMAIL_ARROW:
                CommonTask.tapButton(driver, emailArrow, TestData.EMAIL_ARROW);
                break;
            case TestData.EMAIL_ICON:
                CommonTask.tapButton(driver, emailIcon, TestData.EMAIL_ICON);
                break;
            case TestData.WEBSITE_ARROW:
                CommonTask.tapButton(driver, websiteArrow, TestData.WEBSITE_ARROW);
                break;
            case TestData.WEBSITE_ICON:
                CommonTask.tapButton(driver, websiteIcon, TestData.WEBSITE_ICON);
                break;
        }
    }


    // ---------- Verify elements are enabled
    public boolean isElementEnabledAndDisplayed(String elementName) {
        boolean value = false;
        switch (elementName) {
            default: Assert.fail(Log4Test.error("Chosen param for 'isDisplayed' element is not correct : " + elementName));
                break;
            case TestData.PHONE_ICON:
                value = CommonTask.isElementEnabledAndDisplayed(phoneIcon, TestData.PHONE_ICON);
                break;
            case TestData.PHONE_ARROW:
                value = CommonTask.isElementEnabledAndDisplayed(phoneArrow, TestData.PHONE_ARROW);
                break;
            case TestData.EMAIL_ICON:
                value = CommonTask.isElementEnabledAndDisplayed(emailIcon, TestData.EMAIL_ICON);
                break;
            case TestData.EMAIL_ARROW:
                value = CommonTask.isElementEnabledAndDisplayed(emailArrow, TestData.EMAIL_ARROW);
                break;
            case TestData.WEBSITE_ICON:
                value = CommonTask.isElementEnabledAndDisplayed(websiteIcon, TestData.WEBSITE_ICON);
                break;
            case TestData.WEBSITE_ARROW:
                value = CommonTask.isElementEnabledAndDisplayed(websiteArrow, TestData.WEBSITE_ARROW);
                break;
            case TestData.FACEBOOK_ICON:
                value = CommonTask.isElementEnabledAndDisplayed(facebookIcon, TestData.FACEBOOK_ICON);
                break;
            case TestData.LINKEDIN_ICON:
                value = CommonTask.isElementEnabledAndDisplayed(linkedinIcon, TestData.LINKEDIN_ICON);
                break;
            case TestData.YOUTUBE_ICON:
                value = CommonTask.isElementEnabledAndDisplayed(youtubeIcon, TestData.YOUTUBE_ICON);
                break;
            case TestData.INSTAGRAM_ICON:
                value = CommonTask.isElementEnabledAndDisplayed(instagramIcon, TestData.INSTAGRAM_ICON);
                break;
        }
        return value;
    }


    public Boolean isJustOnceButtonDisplayed(){
        return justOnceButton.isDisplayed();
    }


    // ---------- Get text labels methods
    public String getTextFor(String elementName) {
        String value = "";
        switch (elementName) {
            default:
                Assert.fail(Log4Test.error("Chosen param for 'getTextFor'  element is not correct : " + elementName));
                break;
            case TestData.CONTACT_TAB:
                value = CommonTask.getText(contactTab, TestData.CONTACT_TAB + TestData.LABEL);
                break;
            case TestData.CONTACT_HEADER:
                value = CommonTask.getText(header, TestData.CONTACT_HEADER + TestData.LABEL);
                break;
            case TestData.QUESTION:
                value = CommonTask.getText(questionlabel, TestData.QUESTION + TestData.LABEL);
                break;
            case TestData.SUGGESTION:
                value = CommonTask.getText(suggestionLabel, TestData.SUGGESTION + TestData.LABEL);
                break;
            case TestData.PHONE_DETAILS:
                value = CommonTask.getText(phoneDetailsLabel, TestData.PHONE_DETAILS + TestData.LABEL);
                break;
            case TestData.PHONE_NUMBER:
                value = CommonTask.getText(phoneNumber, TestData.PHONE_NUMBER + TestData.LABEL);
                break;
            case TestData.EMAIL:
                value = CommonTask.getText(emailLabel, TestData.EMAIL + TestData.LABEL);
                break;
            case TestData.EMAIL_ADDRESS:
                value = CommonTask.getText(emailAddress, TestData.EMAIL_ADDRESS + TestData.LABEL);
                break;
            case TestData.WEBSITE:
                value = CommonTask.getText(websiteLabel, TestData.WEBSITE + TestData.LABEL);
                break;
            case TestData.WEBSITE_ADDRESS:
                value = CommonTask.getText(websiteAddress, TestData.WEBSITE_ADDRESS + TestData.LABEL);
                break;
            case TestData.FOLLOW_US:
                value = CommonTask.getText(followUsLabel, TestData.FOLLOW_US + TestData.LABEL);
                break;
            case TestData.PHONE_CONTACT_DEVICE:
                value = CommonTask.getText(phoneContactAndroid, TestData.PHONE_CONTACT_DEVICE + TestData.LABEL);
                break;
            case TestData.GOOGLE_SCREEN:
                value = CommonTask.getText(googleScreen, TestData.GOOGLE_SCREEN + TestData.LABEL);
                break;
        }
        return value;
    }

}
