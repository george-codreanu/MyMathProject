package tests;

import AutomationFramework.TestData;
import core.TestBase;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.ExchangesRatePage;
import pages.GeneralPage;
import utils.Log4Test;

/**
 * Created by azaharia on 03.07.2017.
 */
public class ExchangeRatesTest extends TestBase{

    @Test(groups = {TestData.CONTACT_GROUP, TestData.UI_GROUP}, description = "Verify the labels are correct on the Contact Screen for RO Profile")
    public void ExRate_01() {
        setUp("ExRate_01", "Verify the labels are correct on the Contact Screen for RO Profile");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.selectLanguageProfile(TestData.RO);
        gp.navigateTo(TestData.EXCHANGE_RATES_TAB);

        ExchangesRatePage erp = new ExchangesRatePage(appiumDriver);

        Log4Test.test("Assert Contact Tab Label");
        erp.getTextCurreny();

    }


}
