package pages;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAccessibilityId;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.internal.FindsByName;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log4Test;


/**
 * Created by azaharia on 16.05.2017.
 */
public class ContactPage extends GeneralPage {

    public ContactPage(AppiumDriver driver) {
        super(driver);
    }


    // -------------------------------- Locators

    // -------------- Tab

    @AndroidFindBy (id = "ro.raiffeisen.smartmobile.development:id/largeLabel")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
    private MobileElement contactTabLabel;

    // -------------- Header

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_toolbar_title")
    @iOSFindBy (xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
    private MobileElement contactHeader;

    // --------------

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_question_title")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private MobileElement questionlabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_suggestions")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
    private MobileElement suggestionLabel;

    // -------------- Phone

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rl_call_us")
    public MobileElement callAction;

    //@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+40 (21) 306 55 55\"]")
    //private MobileElement calledPhoneNumber= (MobileElement) driver.findElement(By.name("+40 (21) 306 55 55"));

    @iOSFindBy(id = "No SIM Card Installed")
    private MobileElement simAlert;

    @iOSFindBy( id = "OK")
    private MobileElement simAlertButton;

    @iOSFindBy(id = "Cancel")
    private MobileElement cancelCall;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_phone_details")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage")
    private MobileElement phoneIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_phone_details")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText")
    private MobileElement phoneDetailsLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_phone_number")
    @iOSFindBy(id = "\u202A\u202D+40 (21) 306 55 55\u202C\u202C")
    private MobileElement phoneNumber;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_arrow_phone")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]")
    private MobileElement phoneArrow;

    // -------------- Email

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rl_mail_us")
    private MobileElement mailAction;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_email")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeImage")
    private MobileElement emailIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_email")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeStaticText")
    private MobileElement emailLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_email_address")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[2]")
    private MobileElement emailAddress;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_arrow_mail")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeImage[2]")
    private MobileElement emailArrow;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"toField\"]")
    private MobileElement mailToField;

    // -------------- Website

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/rl_website")
    private MobileElement websiteAction;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_visit_us")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeImage")
    private MobileElement websiteIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_website")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeStaticText")
    private MobileElement websiteLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_website_address")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeStaticText[2]")
    private MobileElement websiteAddress;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_arrow_website")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[6]/XCUIElementTypeImage[2]")
    private MobileElement websiteArrow;


    // -------------- Social

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_social_media")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText")
    private MobileElement followUsLabel;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_facebook")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]")
    private MobileElement facebookIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_linkedin")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[3]")
    private MobileElement linkedinIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_youtube")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[4]")
    private MobileElement youtubeIcon;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/image_instagram")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[5]")
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
                value = CommonTask.getText(contactTabLabel, TestData.CONTACT_TAB + TestData.LABEL);
                break;
            case TestData.CONTACT_HEADER:
                value = CommonTask.getText(contactHeader, TestData.CONTACT_HEADER + TestData.LABEL);
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
            case TestData.CALLED_NUMBER:
                value = CommonTask.getText(phoneNumber, TestData.CALLED_NUMBER + TestData.LABEL);
                break;
            case TestData.iOS_MAIL_TO_FIELD:
                value = mailToField.getAttribute("value");
        }
        return value;
    }

    public void cancelCall(){

        CommonTask.tapButton(driver,cancelCall,TestData.CANCEL_CALL_BUTTON);
    }

    public boolean isSimAlertDisplayed() {
        driver.getPageSource();
        if (simAlertButton.getSize() != null) {
            return true;
        }
        return false;
    }

    public void closeSimAlert(){
        CommonTask.tapButton(driver, simAlertButton,TestData.SIM_OK_BUTTON);
    }
}
