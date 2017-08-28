package pages;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
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
    private MobileElement exchangeRatesHeader;



    // -------------- Exchange Rates subtab

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/exchangeRateBtn")
    private MobileElement exchangeRatesSubTab;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/selectedValueExRate")
    private MobileElement selectValueExRate;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/evolutieCursBnr")
    private MobileElement evolutionExRate;



    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    private MobileElement euroRowCurreny;



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






}



