package pages;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import AutomationFramework.Waiting;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Log4Test;

/**
 * Created by azaharia on 03.07.2017.
 */
public class ExchangesRatePage extends GeneralPage{

    public ExchangesRatePage(AppiumDriver driver) {
        super(driver);
    }

    // -------------------------------- Locators

    // -------------- Header

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_toolbar_title")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeStaticText[1]")
    private MobileElement exchangeRateHeader;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[1]")
    private MobileElement exchangeRateFirstSubtab;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSegmentedControl[1]/XCUIElementTypeButton[2]")
    private MobileElement exchangeRateSecondSubTab;



    // -------------- Exchange Rates subtab

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/exchangeRateBtn")
    private MobileElement exchangeRatesSubTab;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/selectedValueExRate")
    private MobileElement selectValueExRate;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/evolutieCursBnr")
    private MobileElement evolutionExRate;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement euroRowCurrency;

    private String exchangeRowCurrency = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]/XCUIElementTypeStaticText";
    // the xpath must have an index added [i] at the end to be valid

    private String exchangeRow = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell";
    // the xpath must have an index added [i] at the end to be valid

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
    private MobileElement evolutionBNR;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    private MobileElement currency;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
    private MobileElement rfBuys;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")
    private MobileElement rfSells;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeStaticText[1]")
    private MobileElement nbrRate;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    private MobileElement converterFirstInput;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")
    private MobileElement converterSecondInput;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeStaticText[1]")
    private MobileElement performExchange;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    private MobileElement nbrRateSelectedCurrency;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    private MobileElement nbrChart;

    @iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    private MobileElement lastUpdated;


    // -------------- Converter subtab

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/converterBtn")
    private MobileElement converterSubTab;





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
        }
    }

    public void verifyCurrenyNames(){
        for (int i = 0 ; i < 7; i++){
            MobileElement currencyName = (MobileElement) driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[" + i +"]/android.widget.LinearLayout/android.widget.TextView"));
            System.out.println(currencyName.getText());
        }
    }

    public void getTextCurreny(){
        MobileElement currencyName = (MobileElement) driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));

        System.out.println(currencyName.getText());
    }

    public String getTextFor(String elementName) {
        String value = "";
        switch (elementName) {
            default:
                Assert.fail(Log4Test.error("Chosen param for 'getTextFor'  element is not correct : " + elementName));
                break;
            case TestData.EXCHANGE_RATES_TAB:
                value = CommonTask.getText(exchangeRatesTab, TestData.EXCHANGE_RATES_TAB + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_HEADER:
                value = CommonTask.getText(exchangeRateHeader,TestData.EXCHANGE_RATES_HEADER + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_FIRST_SUBTAB:
                value = CommonTask.getText(exchangeRateFirstSubtab, TestData.EXCHANGE_RATES_FIRST_SUBTAB + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_SECOND_SUBTAB:
                value = CommonTask.getText(exchangeRateSecondSubTab,TestData.EXCHANGE_RATES_SECOND_SUBTAB + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_EVOLUTION:
                value = CommonTask.getText(evolutionBNR, TestData.EXCHANGE_RATES_EVOLUTION + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_CURRENCY:
                value = CommonTask.getText(currency, TestData.EXCHANGE_RATES_CURRENCY + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_RF_BUYS:
                value = CommonTask.getText(rfBuys, TestData.EXCHANGE_RATES_RF_BUYS + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_RF_SELLS:
                value = CommonTask.getText(rfSells, TestData.EXCHANGE_RATES_RF_SELLS + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_NBR_RATE:
                value = CommonTask.getText(nbrRate, TestData.EXCHANGE_RATES_NBR_RATE + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_FIRST_INPUT_FIELD:
                value = CommonTask.getAttributeAsText(converterFirstInput, TestData.VALUE,TestData.EXCHANGE_RATES_FIRST_INPUT_FIELD + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_SECOND_INPUT_FIELD:
                value = CommonTask.getAttributeAsText(converterSecondInput, TestData.VALUE, TestData.EXCHANGE_RATES_SECOND_INPUT_FIELD + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_PERFORM_EXCHANGE_BTN:
                value = CommonTask.getText(performExchange, TestData.EXCHANGE_RATES_PERFORM_EXCHANGE_BTN + TestData.LABEL);
                break;
            case TestData.EXCHANGE_RATES_LAST_UPDATED:
                value = CommonTask.getText(lastUpdated,TestData.EXCHANGE_RATES_LAST_UPDATED + TestData.LABEL);
        }
        return value;
    }

    public boolean isElementEnabledAndDisplayed(String elementName) {
        boolean value = false;
        switch (elementName) {
            default: Assert.fail(Log4Test.error("Chosen param for 'isDisplayed' element is not correct : " + elementName));
                break;
            case TestData.EXCHANGE_RATES_SELECTED_NBR_RATE:
                value = CommonTask.isElementEnabledAndDisplayed(nbrRateSelectedCurrency, TestData.EXCHANGE_RATES_SELECTED_NBR_RATE);
                break;
            case TestData.EXCHANGE_RATES_NBR_CHART:
                value = CommonTask.isElementEnabledAndDisplayed(nbrChart, TestData.EXCHANGE_RATES_NBR_CHART);
                break;
            case TestData.EXCHANGE_RATES_LAST_UPDATED:
                value = CommonTask.isElementEnabledAndDisplayed(lastUpdated, TestData.EXCHANGE_RATES_LAST_UPDATED);
        }
        return value;
    }


    public void tapExchangeRatesSubtab(String element){
        switch (element){
            case TestData.EXCHANGE_RATES_FIRST_SUBTAB:
                CommonTask.tapButton(driver,exchangeRateFirstSubtab,TestData.EXCHANGE_RATES_FIRST_SUBTAB);
                break;
            case TestData.EXCHANGE_RATES_SECOND_SUBTAB:
                CommonTask.tapButton(driver,exchangeRateSecondSubTab,TestData.EXCHANGE_RATES_SECOND_SUBTAB);
                break;
        }


    }


    public void areCurrencyRowsEnabledAndDisplayed(){

        for(int i = 1; i<=10 ; i++) {
            MobileElement element = (MobileElement) driver.findElementByXPath((getxpath(i)));
            String elementName = TestData.EXCHANGE_RATES_CURRENCIES[i-1] + " row";

            Log4Test.test("Row " + TestData.EXCHANGE_RATES_CURRENCIES[i-1] + " under test");
            Assert.assertTrue(CommonTask.isElementEnabledAndDisplayed(element,elementName), elementName);

        }
    }



    public String getxpath(int row){

        String value="";

        switch (CommonTask.getOS()){
            case "iOS":
            value = exchangeRow + "[" + row + "]";
            break;
        }

        return value;
    }



}



