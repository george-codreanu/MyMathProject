package pages;

import AutomationFramework.CommonTask;
import AutomationFramework.TestData;
import AutomationFramework.Waiting;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import utils.Log4Test;

import java.util.List;

/**
 * Created by azaharia on 22.05.2017.
 */
public class InterestRatesPage extends GeneralPage{

    public InterestRatesPage(AppiumDriver driver) {
        super(driver);
    }

    // -------------------------------- Locators

    // -------------- Header

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_toolbar_title")
    private MobileElement interestRatesHeader;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/item_share")
    private MobileElement shareButton;


    // -------------- SubTabs

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]")
    private MobileElement roborSubTab;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]")
    private MobileElement euriborSubTab;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]")
    private MobileElement liborSubTab;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_interest_rate_description")
    private MobileElement subTabDescription;

    @FindBy(xpath = "//android.widget.TextView[@index='1']")
    private MobileElement descriptionLabel;



    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[2]")
    private MobileElement oneMonthSlide;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div/div[31]/div")
    private MobileElement oneMonthLabel;

    public String oneMonthLabelTest(){
        return oneMonthLabel.getText();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/div/ul/li/ul/li[1]/ul/li/ul/li/ul/li/ul/li/ul/li[1]/ul/li/ul/li[3]/ul/li/ul/li[2]/ul/li[2]/span[2]/span/span/span")
    private MobileElement oneMonthPercent;


    @FindBy(xpath = "//android.widget.RelativeLayout[@index='2']")
    private MobileElement twoMonthPeriod;

    @FindBy(xpath = "//android.widget.RelativeLayout[@index='3']")
    private MobileElement sixMonthPeriod;

    @FindBy(xpath = "//android.widget.RelativeLayout[@index='4']")
    private MobileElement twelveMonthPeriod;


    // -------------- Sub Page
    @FindBy(id = "Navigate up")
    private MobileElement backButton;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_interest_rate_description_part_1")
    private MobileElement descriptionPart1Label;

    @FindBy(xpath = "//android.widget.TextView[@index='1']")
    private MobileElement descriptionLabelSubpage;

    @FindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_interest_rate_duration")
    private MobileElement interestRateDuration;

    @FindBy(className = "//android.widget.ListView")
    private List<MobileElement> numberOfLayoutsThatAreDisplayed;


    // -------------------------------- Methods


    public void tabSubTab(String subTab){
        if (subTab.equals(TestData.ROBOR)) CommonTask.tapButton(driver, roborSubTab, "robor subtab");
        else if (subTab.equals(TestData.EURIBOR)) CommonTask.tapButton(driver, euriborSubTab,"euribor subtab");
        else if (subTab.equals(TestData.LIBOR)) CommonTask.tapButton(driver, liborSubTab, "libor subtab");
        else Assert.fail(Log4Test.error("Invalid subTab selection : " + subTab));
    }

    // ---------- Get text labels methods

    public String getTextInterestRatesTab(){
        return interestRatesTab.getText();
    }

    public String getTextHeaderInterestRates(){
        return interestRatesHeader.getText();
    }

    public String getTextSubTab(String subTab){
        String textSubTab = "";

        if (subTab.equals(TestData.ROBOR)) textSubTab = roborSubTab.getText();
        else if (subTab.equals(TestData.EURIBOR)) textSubTab = euriborSubTab.getText();
        else if (subTab.equals(TestData.LIBOR)) textSubTab = liborSubTab.getText();
        else Assert.fail(Log4Test.error("Invalid subTab selection : " + subTab));

        return textSubTab;
    }

    public String getTextSubTabDescription(){
        return subTabDescription.getText();
    }

    public String getTextInterestRateDuration(){
        return interestRateDuration.getText();
    }



}
