package tests;

import AutomationFramework.TestData;
import core.TestBase;
import org.junit.internal.matchers.StringContains;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.ExchangesRatePage;
import pages.GeneralPage;
import sun.rmi.runtime.Log;
import utils.Log4Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by azaharia on 03.07.2017.
 */
public class ExchangeRatesTest extends TestBase{

    @Test(groups = {TestData.EXCHANGE_RATES_GROUPS, TestData.UI_GROUP}, description = "Verify that label are correct on the Exchange Rates Converter sub-tab for RO profile")
    public void ExRate_01() {
        setUp("ExRate_01", "Verify the labels are correct on the Exchange Rates Screen for RO Profile");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.selectLanguageProfile(TestData.RO);
        gp.navigateTo(TestData.EXCHANGE_RATES_TAB);

        ExchangesRatePage erp = new ExchangesRatePage(appiumDriver);

        Log4Test.test("Assert Exchange Rates Tab label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_TAB), TestData.RO_EXCHANGE_RATES_TAB, TestData.EXCHANGE_RATES_TAB + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Exchange Rates Header label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_HEADER), TestData.RO_EXCHANGE_RATES_HEADER, TestData.EXCHANGE_RATES_HEADER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert first Exchange rates sub-tab label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_FIRST_SUBTAB), TestData.RO_EXCHANGE_RATES_FIRST_SUBTAB,TestData.EXCHANGE_RATES_FIRST_SUBTAB + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert second Exchange rates sub-tab label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_SECOND_SUBTAB), TestData.RO_EXCHANGE_RATES_SECOND_SUBTAB,TestData.EXCHANGE_RATES_SECOND_SUBTAB + TestData.LABEL_IS_NOT_CORRECT);

        //Exchange rates subtab
        Log4Test.test("Assert Exchange rates sub-tab labels");
        erp.tapExchangeRatesSubtab(TestData.EXCHANGE_RATES_FIRST_SUBTAB);

        Log4Test.test("Assert NBR Rates evolution label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_EVOLUTION), TestData.RO_EXCHANGE_RATES_EVOLUTION,TestData.EXCHANGE_RATES_EVOLUTION + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert currency label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_CURRENCY), TestData.RO_EXCHANGE_RATES_CURRENCY,TestData.EXCHANGE_RATES_CURRENCY + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert 'RF buys' label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_RF_BUYS), TestData.RO_EXCHANGE_RATES_RF_BUYS, TestData.EXCHANGE_RATES_RF_BUYS + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert 'RF sells' label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_RF_SELLS), TestData.RO_EXCHANGE_RATES_RF_SELLS, TestData.EXCHANGE_RATES_RF_SELLS + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert NBR rate label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_NBR_RATE), TestData.RO_EXCHANGE_RATES_NBR_RATE, TestData.EXCHANGE_RATES_NBR_RATE + TestData.LABEL_IS_NOT_CORRECT);

        //Convertor subtab
        Log4Test.test("Assert Convertor sub-tab labels");
        erp.tapExchangeRatesSubtab(TestData.EXCHANGE_RATES_SECOND_SUBTAB);

        Log4Test.test("Assert first input field label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_FIRST_INPUT_FIELD),TestData.RO_EXCHANGE_RATES_FIRST_INPUT_FIELD,TestData.EXCHANGE_RATES_FIRST_INPUT_FIELD + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert second input field label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_SECOND_INPUT_FIELD),TestData.RO_EXCHANGE_RATES_SECOND_INPUT_FIELD, TestData.EXCHANGE_RATES_SECOND_INPUT_FIELD + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert perform exchange button label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_PERFORM_EXCHANGE_BTN), TestData.RO_EXCHANGE_RATES_PERFORM_EXCHANGE_BTN, TestData.EXCHANGE_RATES_PERFORM_EXCHANGE_BTN + TestData.LABEL_IS_NOT_CORRECT);

        softAssert.assertAll();
    }

    @Test(groups = {TestData.EXCHANGE_RATES_GROUPS, TestData.UI_GROUP}, description = "Verify the labels are correct on the Exchange Rates Screen for EN Profile")
    public void ExRate_02() {
        setUp("ExRate_02", "Verify the labels are correct on the Exchange Rates Screen for EN Profile");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.selectLanguageProfile(TestData.EN);
        gp.navigateTo(TestData.EXCHANGE_RATES_TAB);

        ExchangesRatePage erp = new ExchangesRatePage(appiumDriver);

        Log4Test.test("Assert Exchange Rates Tab label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_TAB), TestData.EN_EXCHANGE_RATES_TAB, TestData.EXCHANGE_RATES_TAB + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert Exchange Rates Header label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_HEADER), TestData.EN_EXCHANGE_RATES_HEADER, TestData.EXCHANGE_RATES_HEADER + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert first Exchange rates sub-tab label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_FIRST_SUBTAB), TestData.EN_EXCHANGE_RATES_FIRST_SUBTAB,TestData.EXCHANGE_RATES_FIRST_SUBTAB + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert second Exchange rates sub-tab label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_SECOND_SUBTAB), TestData.EN_EXCHANGE_RATES_SECOND_SUBTAB,TestData.EXCHANGE_RATES_SECOND_SUBTAB + TestData.LABEL_IS_NOT_CORRECT);

        //Exchange rates subtab
        Log4Test.test("Assert Exchange rates sub-tab labels");
        erp.tapExchangeRatesSubtab(TestData.EXCHANGE_RATES_FIRST_SUBTAB);

        Log4Test.test("Assert NBR Rates evolution label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_EVOLUTION), TestData.EN_EXCHANGE_RATES_EVOLUTION,TestData.EXCHANGE_RATES_EVOLUTION + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert currency label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_CURRENCY), TestData.EN_EXCHANGE_RATES_CURRENCY,TestData.EXCHANGE_RATES_CURRENCY + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert 'RF buys' label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_RF_BUYS), TestData.EN_EXCHANGE_RATES_RF_BUYS, TestData.EXCHANGE_RATES_RF_BUYS + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert 'RF sells' label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_RF_SELLS), TestData.EN_EXCHANGE_RATES_RF_SELLS, TestData.EXCHANGE_RATES_RF_SELLS + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert NBR rate label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_NBR_RATE), TestData.EN_EXCHANGE_RATES_NBR_RATE, TestData.EXCHANGE_RATES_NBR_RATE + TestData.LABEL_IS_NOT_CORRECT);

        //Convertor subtab
        Log4Test.test("Assert Convertor sub-tab labels");
        erp.tapExchangeRatesSubtab(TestData.EXCHANGE_RATES_SECOND_SUBTAB);

        Log4Test.test("Assert first input field label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_FIRST_INPUT_FIELD),TestData.EN_EXCHANGE_RATES_FIRST_INPUT_FIELD,TestData.EXCHANGE_RATES_FIRST_INPUT_FIELD + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert second input field label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_SECOND_INPUT_FIELD),TestData.EN_EXCHANGE_RATES_SECOND_INPUT_FIELD, TestData.EXCHANGE_RATES_SECOND_INPUT_FIELD + TestData.LABEL_IS_NOT_CORRECT);

        Log4Test.test("Assert perform exchange button label");
        softAssert.assertEquals(erp.getTextFor(TestData.EXCHANGE_RATES_PERFORM_EXCHANGE_BTN), TestData.EN_EXCHANGE_RATES_PERFORM_EXCHANGE_BTN, TestData.EXCHANGE_RATES_PERFORM_EXCHANGE_BTN + TestData.LABEL_IS_NOT_CORRECT);

        softAssert.assertAll();
    }

    @Test(groups = {TestData.EXCHANGE_RATES_GROUPS,TestData.UI_GROUP}, description = "Verify that all elements are present and visible")
    public void ExRate_03(){

        setUp("ExRate_03", "Verify that all elements are present and visible");

        GeneralPage gp = new GeneralPage(appiumDriver);
        gp.navigateTo(TestData.EXCHANGE_RATES_TAB);

        ExchangesRatePage erp = new ExchangesRatePage(appiumDriver);

        /*Log4Test.test("Assert that NBR rate for selected currency is displayed and enabled");
        softAssert.assertTrue(erp.isElementEnabledAndDisplayed(TestData.EXCHANGE_RATES_SELECTED_NBR_RATE),TestData.EXCHANGE_RATES_SELECTED_NBR_RATE + TestData.IS_ENABLED_AND_DISPLAYED);

        Log4Test.test("Assert that NBR chart is displayed and enabled");
        softAssert.assertTrue(erp.isElementEnabledAndDisplayed(TestData.EXCHANGE_RATES_NBR_CHART),TestData.EXCHANGE_RATES_NBR_CHART);

        Log4Test.test("Assert that 'Last updated' field is displayed, enabled and not empty");
        softAssert.assertTrue(erp.isElementEnabledAndDisplayed(TestData.EXCHANGE_RATES_LAST_UPDATED),TestData.EXCHANGE_RATES_LAST_UPDATED);
        softAssert.assertNotSame(erp.getTextFor(TestData.EXCHANGE_RATES_LAST_UPDATED),null,TestData.EXCHANGE_RATES_LAST_UPDATED);

*/
        Log4Test.test("Assert that rows are enabled, displayed and have the correct currency");
        erp.areCurrencyRowsEnabledAndDisplayed();

        softAssert.assertAll();
    }


}
