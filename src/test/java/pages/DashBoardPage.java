package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by azaharia on 24.08.2017.
 */
public class DashBoardPage extends GeneralPage {

    public DashBoardPage(AppiumDriver driver) {
        super(driver);
    }


    // -------------- Header

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/tv_toolbar_title")
    private MobileElement dashboardHeader;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/iv_toolbar_icon")
    private MobileElement raiffLogo;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/item_search")
    private MobileElement itemSearch;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/item_notif")
    private MobileElement itemNotification;

    @AndroidFindBy(id = "ro.raiffeisen.smartmobile.development:id/text_open_another_account")
    private MobileElement addNewProductButton;

}
