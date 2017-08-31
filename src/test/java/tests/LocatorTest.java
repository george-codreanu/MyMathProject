package tests;

import io.appium.java_client.android.Connection;
import org.testng.Assert;
import utils.ADB;
import AutomationFramework.TestData;
import core.TestBase;
import org.testng.annotations.Test;
import pages.GeneralPage;
import pages.LocatorPage;
import utils.Log4Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;


/**
 * Created by azaharia on 05.05.2017.
 */
public class LocatorTest extends TestBase {



    @Test(groups = {TestData.LOCATOR_GROUP, TestData.UI_GROUP}, description = "Verify the labels are correct on the Locator Screen for RO Profile")
    public void Locator_01() {
        setUp("Locator_01", "Verify the labels are correct on the Locator Screen for RO Profile");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.selectLanguageProfile(TestData.RO);
        gp.navigateTo(TestData.LOCATOR_TAB);

        LocatorPage lp = new LocatorPage(appiumDriver);
        System.out.println(appiumDriver.getPageSource());
        Log4Test.test("Assert Locator Tab Label");
        softAssert.assertEquals(lp.getTextFor(TestData.LOCATOR_TAB), TestData.BOTH_LOCATOR, TestData.LOCATOR_TAB + TestData.LABEL_IS_NOT_CORRECT);

        gp.tapAllowButton();

        Log4Test.test("Assert Locator Header Label");
        softAssert.assertEquals(lp.getTextFor(TestData.LOCATOR_HEADER), TestData.BOTH_LOCATOR, TestData.LOCATOR_HEADER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert locate me icon is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.LOCATE_ME_BUTTON), TestData.LOCATE_ME_BUTTON  + TestData.IS_ENABLED_AND_DISPLAYED);

        lp.tapElement(TestData.SEARCH_BAR);

        Log4Test.test("Assert SearchBar Placeholder");
        softAssert.assertEquals(lp.getTextFor(TestData.SEARCH_BAR), TestData.RO_SEARCH_BAR_PLACEHOLDER, TestData.LOCATOR_HEADER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Recent history title");
        softAssert.assertEquals(lp.getTextFor(TestData.RECENT_HISTORY_TITLE), TestData.RO_RECENT_HISTORY_TITLE, TestData.RECENT_HISTORY_TITLE + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Recent history button placeholder");
        softAssert.assertEquals(lp.getTextFor(TestData.RECENT_HISTORY_BUTTON), TestData.RO_RECENT_HISTORY_BUTTON, TestData.RECENT_HISTORY_BUTTON+ TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Suggestion title");
        softAssert.assertEquals(lp.getTextFor(TestData.SUGGESTIONS_TITLE), TestData.RO_SUGGESTION_TITLE, TestData.SUGGESTIONS_TITLE + TestData.LABEL_IS_NOT_CORRECT);

        lp.searchForPOIAndSelectSearchResultRow(TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[0], TestData.SECOND_OPTION);

        Log4Test.test("Assert choice label");
        softAssert.assertEquals(lp.getTextFor(TestData.YOU_HAVE_CHOSEN_LABEL), TestData.RO_CHOICE_LABEL, TestData.YOU_HAVE_CHOSEN_LABEL + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert poi name from detailed view page");
        softAssert.assertEquals(lp.getTextFor(TestData.POI_NAME), TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[0], TestData.POI_NAME + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert walking distance from detailed view page");
        softAssert.assertEquals(lp.getTextFor(TestData.WALKING_DISTANCE), TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[1], TestData.WALKING_DISTANCE + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert call button label");
        softAssert.assertEquals(lp.getTextFor(TestData.CALL_BUTTON), TestData.CALL, TestData.CALL_BUTTON + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert share button button label");
        softAssert.assertEquals(lp.getTextFor(TestData.SHARE_BUTTON), TestData.SHARE, TestData.SHARE_BUTTON + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert poi address from detailed view page");
        softAssert.assertEquals(lp.getTextFor(TestData.POI_ADDRESS), TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[2], TestData.POI_ADDRESS + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert poi phone number from detailed view page");
        softAssert.assertEquals(lp.getTextFor(TestData.POI_PHONE_NUMBER), TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[3], TestData.POI_PHONE_NUMBER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert navigation icon is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.NAVIGATION_BUTTON), TestData.NAVIGATION_BUTTON  + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert location icon is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.LOCATION_ICON), TestData.LOCATION_ICON  + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert phone icon  is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.PHONE_ICON), TestData.PHONE_ICON  + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert working hours icon is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.WORKING_HOURS_ICON), TestData.WORKING_HOURS_ICON  + TestData.IS_ENABLED_AND_DISPLAYED);

        softAssert.assertAll();

    }


    @Test(groups = {TestData.LOCATOR_GROUP, TestData.UI_GROUP}, description = "Verify the labels are correct on the Locator Screen for EN Profile")
    public void Locator_02() {
        setUp("Locator_02", "Verify the labels are correct on the Locator Screen for EN Profile");

        GeneralPage gp = new GeneralPage(appiumDriver);
        //gp.selectLanguageProfile(TestData.EN);
        gp.navigateTo(TestData.LOCATOR_TAB);

        LocatorPage lp = new LocatorPage(appiumDriver);

        Log4Test.test("Assert Locator Tab Label");
        softAssert.assertEquals(lp.getTextFor(TestData.LOCATOR_TAB), TestData.BOTH_LOCATOR, TestData.LOCATOR_TAB + TestData.LABEL_IS_NOT_CORRECT);

        gp.tapAllowButton();

        Log4Test.test("Assert Locator Header Label");
        softAssert.assertEquals(lp.getTextFor(TestData.LOCATOR_HEADER), TestData.BOTH_LOCATOR, TestData.LOCATOR_HEADER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert locate me icon is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.LOCATE_ME_BUTTON), TestData.LOCATE_ME_BUTTON  + TestData.IS_ENABLED_AND_DISPLAYED);

        lp.tapElement(TestData.SEARCH_BAR);

        Log4Test.test("Assert SearchBar Placeholder");
        softAssert.assertEquals(lp.getTextFor(TestData.SEARCH_BAR), TestData.EN_SEARCH_BAR_PLACEHOLDER, TestData.LOCATOR_HEADER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Recent history title");
        softAssert.assertEquals(lp.getTextFor(TestData.RECENT_HISTORY_TITLE), TestData.EN_RECENT_HISTORY_TITLE, TestData.RECENT_HISTORY_TITLE + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Recent history button placeholder");
        softAssert.assertEquals(lp.getTextFor(TestData.RECENT_HISTORY_BUTTON), TestData.EN_RECENT_HISTORY_BUTTON, TestData.RECENT_HISTORY_BUTTON+ TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Suggestion title");
        softAssert.assertEquals(lp.getTextFor(TestData.SUGGESTIONS_TITLE), TestData.EN_SUGGESTION_TITLE, TestData.SUGGESTIONS_TITLE + TestData.LABEL_IS_NOT_CORRECT);

        lp.searchForPOIAndSelectSearchResultRow(TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[0], TestData.SECOND_OPTION);

        Log4Test.test("Assert choice label");
        softAssert.assertEquals(lp.getTextFor(TestData.YOU_HAVE_CHOSEN_LABEL), TestData.EN_CHOICE_LABEL, TestData.YOU_HAVE_CHOSEN_LABEL + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert poi name from detailed view page");
        softAssert.assertEquals(lp.getTextFor(TestData.POI_NAME), TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[0], TestData.POI_NAME + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert walking distance from detailed view page");
        softAssert.assertEquals(lp.getTextFor(TestData.WALKING_DISTANCE), TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[1], TestData.WALKING_DISTANCE + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert call button label");
        softAssert.assertEquals(lp.getTextFor(TestData.CALL_BUTTON), TestData.CALL, TestData.CALL_BUTTON + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert share button button label");
        softAssert.assertEquals(lp.getTextFor(TestData.SHARE_BUTTON), TestData.SHARE, TestData.SHARE_BUTTON + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert poi address from detailed view page");
        softAssert.assertEquals(lp.getTextFor(TestData.POI_ADDRESS), TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[2], TestData.POI_ADDRESS + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert poi phone number from detailed view page");
        softAssert.assertEquals(lp.getTextFor(TestData.POI_PHONE_NUMBER), TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[3], TestData.POI_PHONE_NUMBER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert navigation is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.NAVIGATION_BUTTON), TestData.NAVIGATION_BUTTON  + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert location is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.LOCATION_ICON), TestData.LOCATION_ICON  + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert phone icon is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.PHONE_ICON), TestData.PHONE_ICON  + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert working hours icon is displayed");
        softAssert.assertTrue(lp.isElementEnabledAndDisplayed(TestData.WORKING_HOURS_ICON), TestData.WORKING_HOURS_ICON  + TestData.IS_ENABLED_AND_DISPLAYED);

        softAssert.assertAll();
    }

    @Test(groups = {TestData.LOCATOR_GROUP, TestData.UI_GROUP}, description = "Verify working hour statuses and time left")
    public void Locator_03() {
        setUp("Locator_03", "Verify working hour statuses and time left");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.selectLanguageProfile(TestData.EN);
        gp.navigateTo(TestData.LOCATOR_TAB);

        LocatorPage lp = new LocatorPage(appiumDriver);

        ADB.setDeviceTime(TestData.TIME_WITHIN_WORKING_HOURS);
        gp.tapAllowButton();
        lp.searchForPOIAndSelectSearchResultRow(TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[0], TestData.SECOND_OPTION);
        Log4Test.test("Assert poi status for working hours");
        softAssert.assertEquals(lp.getTextFor(TestData.STATUS), TestData.EN_OPEN, TestData.STATUS + TestData.LABEL_IS_NOT_CORRECT);
        Log4Test.test("Assert poi remaining time left for time withing working hours");
        softAssert.assertEquals(lp.getTextFor(TestData.STATUS_TIME_LEFT), TestData.EN_OPEN, TestData.STATUS_TIME_LEFT + TestData.LABEL_IS_NOT_CORRECT);


        ADB.setDeviceTime(TestData.TIME_WITHIN_LUNCH_BREAK);
        lp.searchForPOIAndSelectSearchResultRow(TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[0], TestData.SECOND_OPTION);
        Log4Test.test("Assert poi status for lunch break");
        softAssert.assertEquals(lp.getTextFor(TestData.STATUS), TestData.EN_LUNCH, TestData.STATUS + TestData.LABEL_IS_NOT_CORRECT);
        Log4Test.test("Assert poi remaining time left for time in lunch break");
        softAssert.assertEquals(lp.getTextFor(TestData.STATUS_TIME_LEFT), TestData.EN_OPEN, TestData.STATUS_TIME_LEFT + TestData.LABEL_IS_NOT_CORRECT);


        ADB.setDeviceTime(TestData.TIME_WITHIN_CLOSING_HOURS);
        lp.searchForPOIAndSelectSearchResultRow(TestData.AGENTIA_FLOREASCA_CITY_CENTER_DATA[0], TestData.SECOND_OPTION);
        Log4Test.test("Assert poi status for  not working hours");
        softAssert.assertEquals(lp.getTextFor(TestData.STATUS), TestData.EN_CLOSED, TestData.STATUS + TestData.LABEL_IS_NOT_CORRECT);
        Log4Test.test("Assert poi remaining time left for time outside working hours");
        softAssert.assertEquals(lp.getTextFor(TestData.STATUS_TIME_LEFT), TestData.EN_OPEN, TestData.STATUS_TIME_LEFT + TestData.LABEL_IS_NOT_CORRECT);
    }

}
