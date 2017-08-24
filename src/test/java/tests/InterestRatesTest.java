package tests;

import AutomationFramework.TestData;
import core.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.GeneralPage;
import pages.InterestRatesPage;
import pages.LoginPage;
import utils.Log4Test;

/**
 * Created by azaharia on 22.05.2017.
 */
public class InterestRatesTest extends TestBase{

    @Test(groups = {TestData.INTEREST_RATES_GROUP, TestData.UI_GROUP}, description = "Verify the labels are correct on the Interest Rate Screen for RO Profile")
    public void IntRate_01() {
        setUp("IntRate_01", "Verify the labels are correct on the Interest Rates Screen for RO Profile");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.selectLanguageProfile(TestData.RO);
        gp.navigateTo(TestData.INTEREST_RATES_TAB);

        InterestRatesPage irp = new InterestRatesPage(appiumDriver);

        Log4Test.test("Assert Contact Tab Label");
        softAssert.assertEquals(irp.getTextInterestRatesTab(), "Rate dobândă", "Interest Rate Tab  label is correct");

        Log4Test.test("Assert Contact Tab Label");
        softAssert.assertEquals(irp.getTextHeaderInterestRates(), "Rate dobândă", "Interest Rate Header  label is correct");

        irp.oneMonthLabelTest();
        System.out.println();

  /*      Log4Test.test("Assert ROBOR SubTab Label");
        softAssert.assertEquals(irp.getTextSubTab(TestData.ROBOR), TestData.ROBOR, "ROBOR SubTab Label  label is correct");

        Log4Test.test("Assert EUROBOR SubTab Label");
        softAssert.assertEquals(irp.getTextSubTab(TestData.EURIBOR), TestData.EURIBOR, "EURIBOR SubTab Label  label is correct");

        Log4Test.test("Assert LIBOR SubTab Label");
        softAssert.assertEquals(irp.getTextSubTab(TestData.LIBOR), TestData.LIBOR, "LIBOR SubTab Label  label is correct");*/


        softAssert.assertAll();
    }



}