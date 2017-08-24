package pages;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Log4Test;

/**
 * Created by azaharia on 05.05.2017.
 */
public class LocatorPage extends GeneralPage{

    public LocatorPage(AppiumDriver driver) {
        super(driver);
    }



    // -------------------------------- Locators

    // -------------- Tab

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/largeLabel")
    private MobileElement locatorTabLabel;

    // -------------- Header

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_toolbar_title")
    private MobileElement locatorHeader;

    // --- WiFI/GPS Alerts

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/alertTitle")
    private MobileElement alertTitle;

    @FindBy(id = "android:id/message")
    private MobileElement alertMessage;

    @FindBy(id = "android:id/button2")
    private MobileElement cancelAlertButton;

    @FindBy(id = "android:id/button1")
    private MobileElement settingsAlerButton;


    // --- Main Page

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/search_box")
    private MobileElement searchBar;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/search_reset_btn")
    private MobileElement resetSearchBarButton;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/my_location_button")
    private MobileElement locateMeButton;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/rotate_button")
    private MobileElement rotateButton;

    // ---- Recent History and Close to you Page

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/recent_history_title")
    private MobileElement recentHistoryTitle;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/icon_recent_history")
    private MobileElement recentHistoryIcon;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/btn_recent_history")
    private MobileElement recentHistoryButton;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/suggestions_title")
    private MobileElement suggestionsTitle;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/ic_location_off")
    private MobileElement locationOffIcon;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_location_off_message")
    private MobileElement locationOffMessageSuggestion;

    // ---- Detailed view Page

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_chosen")
    private MobileElement youHaveChosenLabel;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_poi_name")
    private MobileElement poiName;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/btn_navigation")
    private MobileElement navigationButton;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_walking_distance")
    private MobileElement walkingDistance;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/call_button")
    private MobileElement callButton;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/share_button")
    private MobileElement shareButton;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_status_icon")
    private MobileElement status;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_status_text")
    private MobileElement statusTime;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/ic_location")
    private MobileElement locationIcon;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/ic_call")
    private MobileElement phoneIcon;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/ic_operation_hours")
    private MobileElement workingHoursIcon;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_adress")
    private MobileElement poiAddress;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_phone")
    private MobileElement poiPhoneNumber;






    // -------------------------------- Methods

    public void tapCancelButtonForAlert(){

    }

    public void tapSettingsButtonForAlert(){

    }


    // ---------- Tap elements
    public void tapElement(String elementName){
        switch (elementName) {
            default:
                Assert.fail(Log4Test.error("Chosen param for 'tapElement' element is not correct : " + elementName));
                break;
            case TestData.SEARCH_BAR:
                CommonTask.tapButton(driver, searchBar, TestData.SEARCH_BAR);
                break;
            case TestData.RESET_SEARCH_BAR:
                CommonTask.tapButton(driver, resetSearchBarButton, TestData.RESET_SEARCH_BAR + TestData.BUTTON);
                break;
            case TestData.LOCATE_ME_BUTTON:
                CommonTask.tapButton(driver, locateMeButton, TestData.LOCATE_ME_BUTTON);
                break;
            case TestData.BEARING_RESET_BUTTON:
                CommonTask.tapButton(driver, rotateButton, TestData.BEARING_RESET_BUTTON);
                break;
        }
    }

    // ---------- Verify elements are enabled
    public boolean isElementEnabledAndDisplayed(String elementName) {
        boolean value = false;
        switch (elementName) {
            default: Assert.fail(Log4Test.error("Chosen param for 'isDisplayed' element is not correct : " + elementName));
                break;
            case TestData.LOCATE_ME_BUTTON: value = CommonTask.isElementEnabledAndDisplayed(driver, locateMeButton, TestData.LOCATE_ME_BUTTON);
                break;
            case TestData.BEARING_RESET_BUTTON: value= CommonTask.isElementEnabledAndDisplayed(driver, rotateButton, TestData.BEARING_RESET_BUTTON);
                break;
            case TestData.NAVIGATION_BUTTON: value = CommonTask.isElementEnabledAndDisplayed(driver, navigationButton, TestData.NAVIGATION_BUTTON);
                break;
            case TestData.LOCATION_ICON: value = CommonTask.isElementEnabledAndDisplayed(driver, locationIcon, TestData.LOCATION_ICON);
                break;
            case TestData.PHONE_ICON: value = CommonTask.isElementEnabledAndDisplayed(driver, phoneIcon, TestData.PHONE_ICON);
                break;
            case TestData.WORKING_HOURS_ICON: value = CommonTask.isElementEnabledAndDisplayed(driver, workingHoursIcon, TestData.WORKING_HOURS_ICON);
                break;
        }
        return value;
    }

    // ---------- Get text labels methods
    public String getTextFor(String elementName) {
        String value = "";
        switch (elementName) {
            default:
                Assert.fail(Log4Test.error("Chosen param for 'getTextFor'  element is not correct : " + elementName));
                break;
            case TestData.LOCATOR_TAB:
                value = CommonTask.getText(driver, locatorTabLabel, TestData.LOCATOR_TAB + TestData.LABEL);
                break;
            case TestData.LOCATOR_HEADER:
                value = CommonTask.getText(driver, locatorHeader, TestData.LOCATOR_HEADER + TestData.LABEL);
                break;
            case TestData.SEARCH_BAR:
                value = CommonTask.getText(driver, searchBar, TestData.SEARCH_BAR + TestData.PLACEHOLDER);
                break;
            case TestData.RECENT_HISTORY_TITLE:
                value = CommonTask.getText(driver, recentHistoryTitle, TestData.RECENT_HISTORY_TITLE + TestData.LABEL);
                break;
            case TestData.RECENT_HISTORY_BUTTON:
                value = CommonTask.getText(driver, recentHistoryButton, TestData.EN_RECENT_HISTORY_BUTTON + TestData.PLACEHOLDER);
                break;
            case TestData.SUGGESTIONS_TITLE:
                value = CommonTask.getText(driver, suggestionsTitle, TestData.SUGGESTIONS_TITLE + TestData.LABEL);
                break;
            case TestData.YOU_HAVE_CHOSEN_LABEL:
                value = CommonTask.getText(driver, youHaveChosenLabel, TestData.YOU_HAVE_CHOSEN_LABEL);
                break;
            case TestData.CALL_BUTTON:
                value = CommonTask.getText(driver, callButton, TestData.CALL_BUTTON);
                break;
            case TestData.SHARE_BUTTON:
                value = CommonTask.getText(driver, shareButton, TestData.SHARE_BUTTON);
                break;
            case TestData.POI_NAME:
                value = CommonTask.getText(driver, poiName, TestData.POI_NAME);
                break;
            case TestData.WALKING_DISTANCE:
                value = CommonTask.getText(driver, walkingDistance, TestData.WALKING_DISTANCE);
                break;
            case TestData.STATUS:
                value = CommonTask.getText(driver, status, TestData.STATUS);
                break;
            case TestData.STATUS_TIME_LEFT:
                value = CommonTask.getText(driver, statusTime, TestData.STATUS_TIME_LEFT);
                break;
            case TestData.POI_ADDRESS:
                value =CommonTask.getText(driver, poiAddress, TestData.POI_ADDRESS);
                break;
            case TestData.POI_PHONE_NUMBER:
                value = CommonTask.getText(driver, poiPhoneNumber, TestData.POI_PHONE_NUMBER);
                break;
        }
        return value;
    }

    /**
     *
     * @param day - (exammple, monday, tuesday), TestData.MONDAY
     * @return - returns working hours for specific day
     */
    public String getTextWorkingHoursForDay(String day){
        MobileElement weekDay = (MobileElement)driver.findElementsById("ro.raiffeisen.smartmobile.development:id/tv_" + day);
        return CommonTask.getText(driver, weekDay, "day of week : " + day);
    }

    public String getTextAlertTitle(String type){
        return CommonTask.getText(driver, alertTitle, "alert title " + type);
    }

    public String getTextAlerMessage(String type){
        return CommonTask.getText(driver, alertMessage, "alert message " + type);
    }

    public void searchForPOI(String poiName){
        CommonTask.setTextField(driver, searchBar, poiName, TestData.SEARCH_BAR);
    }

    /**
     *
     * @param row - what row to click from POI search results (ex. TestData.FIRST_OPTION, TEstData.SECOND_OPTION)
     */
    public void tapOptionFromSuggestionList(String row){
        MobileElement selectionFromList = (MobileElement)driver.findElements((By.id("ro.raiffeisen.smartmobile.development:id/search_item"))).get(Integer.parseInt(row));
        CommonTask.tapButton(driver, selectionFromList, "row : " + (Integer.parseInt(row) + 1));
    }

    public void searchForPOIAndSelectSearchResultRow(String poiName, String rowNumberFromSuggestionsResults){
        searchForPOI(poiName);
        tapOptionFromSuggestionList(rowNumberFromSuggestionsResults);
    }




}
