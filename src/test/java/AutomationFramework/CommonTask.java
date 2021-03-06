package AutomationFramework;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import utils.Log4Test;

import java.util.*;


/**
 * Created by azaharia on 28.04.2017.
 */
public class CommonTask {

    public static String getOS(){
        String clientOS = System.getProperty("clientOS");
        return "iOS";
        //return clientOS;
    }

    public static void switchToRaiffApp(MobileDriver driver){
        CommonTask.tapButton(driver, Key.APP_SWITCH_BUTTON);
        MobileElement raiffeiseinApp = (MobileElement) driver.findElement(By.xpath("//*[@content-desc='SmartMobile (development)']"));
        CommonTask.tapButton(driver, raiffeiseinApp, TestData.RAIFF_APP);
    }

    public static void moveToElement(MobileDriver driver, MobileElement element, String elementName){
        try {
            Actions action = new Actions(driver);
            Log4Test.info("- moving to element : " + elementName);
            action.moveToElement(element).build().perform();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }
    }


    public static void clearElement(MobileElement element, String elementName) {
        try {
            Log4Test.info("- clearing element : " + elementName);
            element.clear();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }
    }

    public static void sendKeys(MobileElement element, String text, String elementName){
        try {
            Log4Test.info("- sending keys : " + text + " : to " + elementName);
            element.sendKeys(text);
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }
    }

    public static void tapButton(MobileDriver driver, MobileElement element, String elementName){

        switch (CommonTask.getOS()) {

            case "Android":
                try {
                    //Wait for the element to be available
                    //Waiting.elementToBeClickable(driver, element, elementName);
                    //Tap element
                    Log4Test.info("- tapping element : " + elementName);
                    new TouchAction(driver).tap(element).perform();
                } catch (NoSuchElementException e) {
                    Assert.fail(Log4Test.error("Element is not found"));
                }
                break;
            case "iOS":
                try{
                    //Wait for the element to be available
                    //Waiting.elementToBeClickable(driver, element, elementName);
                    //Tap element
                    Log4Test.info("- clicking element:" + elementName);
                    element.click();
                }catch (NoSuchElementException e){
                    Assert.fail(Log4Test.error("Element is not found : " + elementName));
                }
        }

    }

    public static void tapButton(MobileDriver driver, Key key) {
        try {
            Log4Test.info("- tapping " + key);
            ((AndroidDriver) driver).pressKeyCode(key.getValue());
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Key is not found : " + key));
        }
    }


    public static void setTextField(MobileDriver driver, MobileElement element, String text, String elementName) {
        //Wait for the field to be available
        Waiting.elementToBeClickable(driver, element, elementName);
        //Enter "item" into the field
        sendKeys(element, text, elementName);
        //Waiting text to be present
        Waiting.textToBePresentInElement(driver, element, text, elementName);
    }

    public static void setInputField(MobileDriver driver, MobileElement element, String text, String elementName) {
        //Wait for the field to be available
        Waiting.elementToBeClickable(driver, element, elementName);
        //Enter "item" into the field
        sendKeys(element, text, elementName);
    }

    public static String getText(MobileElement element, String elementName) {
        String text = "";

        switch (CommonTask.getOS()) {

            case "Android":
                try {
                    //Get element Attribute
                    Log4Test.info("- getting text for: " + elementName);
                    text = element.getText();
                } catch (NoSuchElementException e) {
                  Log4Test.error("Element is not found : " + elementName);
                }
                break;
            case "iOS":
                try {
                    Log4Test.info("- getting text for: " + elementName);
                    text = element.getAttribute("name");
                }catch (NoSuchElementException e) {
                    Assert.fail(Log4Test.error("Element is not found : " + elementName));
                }
        }
        return text;
    }


    public static String getAttributeAsText(MobileElement element, String attribute, String elementName) {
        String stringValueOfAttribute = "";
        try {
            //Get element Attribute
            Log4Test.info("- getting attribute as String for : " + elementName);
            stringValueOfAttribute = element.getAttribute(attribute);
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
        }

        return stringValueOfAttribute;
    }


    public static Boolean isElementEnabledAndDisplayed(MobileElement element, String elementName){
        try {
            return isDisplayed(element, elementName) && isEnabled(element, elementName);
        } catch (NoSuchElementException e) {
            Log4Test.error("Element is not found : " + elementName);
            return false;
        }
    }

    public static Boolean isEnabled(MobileElement element, String elementName){
        try {
            Log4Test.info("- verifying if " + elementName + " is enabled");
            return element.isEnabled();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
            return false;
        }
    }

    public static Boolean isDisplayed(MobileElement element, String elementName){
        try {
            Log4Test.info("- verifying if " + elementName + " is displayed");
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            Assert.fail(Log4Test.error("Element is not found : " + elementName));
            return false;
        }
    }




    public static void switchToWebView(MobileDriver driver, String x) {
        Set<String> contextNames = driver.getContextHandles();
        String lastestContextView = (String) contextNames.toArray()[contextNames.size() - 1];

        System.out.println(lastestContextView);
        if (lastestContextView.contains("WEBVIEW_")) {
            driver.context(lastestContextView);
        }
    }





    protected void tapButtonJs(AndroidDriver driver, MobileElement element){
        HashMap<String, Integer> coords = new HashMap<String, Integer>();
        coords.put("x", element.getLocation().getX());
        coords.put("y", element.getLocation().getY());
        driver.executeScript("mobile: tap", coords);
    }

    /**
     * Set slider value, 0 - min value
     */
    protected void setSliderValue(MobileDriver driver, MobileElement slider, int value){
        int startX = slider.getLocation().getX();
        int yAxis = slider.getLocation().getY();

        int moveToXDirection = value + startX;
        new TouchAction(driver)
                .longPress(startX, yAxis)
                .moveTo(moveToXDirection, yAxis)
                .release()
                .perform();
    }


    public static void scrollToElement(AndroidDriver driver, String elementName, boolean scrollDown) {
        String listID = ((RemoteWebElement) driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.ListView\")")).getId();
        String direction;
        if (scrollDown) {
            direction = "down";
        } else {
            direction = "up";
        }
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", direction);
        scrollObject.put("element", listID);
        scrollObject.put("text", elementName);
        driver.executeScript("mobile: scrollTo", scrollObject);
    }

    public MobileElement scrollToElementByName(AndroidDriver driver, String elementName, String listId) {
        MobileElement element = (MobileElement) ((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" +
                ".resourceId(\"" + listId + "\"))" +
                ".scrollIntoView(new UiSelector().text(\"" + elementName + "\"));");
        return element;
    }



}
