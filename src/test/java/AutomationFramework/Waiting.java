package AutomationFramework;

import core.TestBase;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Log4Test;

public class Waiting extends TestBase{

	// --------------------------------------- Explicit Waits

	public static void elementToBeClickable(MobileDriver driver, MobileElement element, String elementName){
		try {
            Log4Test.info("- waiting for element : " + elementName + " : to be clickable");
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Element is not clickable within : " + TestData.SHORT_WAIT + " seconds"));
		}

	}
	public static void elementToBeClickable(MobileDriver driver, MobileElement element, int seconds, String elementName){
		try {
            Log4Test.info("- waiting for element : " + elementName + " : to be clickable");
			new WebDriverWait(driver, seconds).until(ExpectedConditions.elementToBeClickable(element));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Element is not clickable within : " + seconds +  " seconds"));
		}
	}
	
	public static void elementToBeSelected(MobileDriver driver, MobileElement element, String elementName){
		try {
            Log4Test.info("- waiting for element : " + elementName + " : to be selected");
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.elementToBeSelected(element));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Element is not selected within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void elementToBeSelected(MobileDriver driver, MobileElement element, int seconds, String elementName){
		try {
            Log4Test.info("- waiting for element : " + elementName + " : to be selected");
			new WebDriverWait(driver, seconds).until(ExpectedConditions.elementToBeSelected(element));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Element is not selected within : " + seconds + " seconds"));
		}
	}
	
	public static void textToBePresentInElement(MobileDriver driver, MobileElement element, String text, String elementName){
		try {
            Log4Test.info("- waiting for text : " + text +  " : to be present in " +  elementName );
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.textToBePresentInElement(element, text));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Text is not present in element within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void textToBePresentInElement(MobileDriver driver, MobileElement element, String text, int seconds, String elementName){
		try {
            Log4Test.info("- waiting for text : " + text +  " : to be present in " +  elementName );
			new WebDriverWait(driver, seconds).until(ExpectedConditions.textToBePresentInElement(element, text));
		} catch (TimeoutException toe){
            Assert.fail(Log4Test.error("Text is not present in element within : " +seconds + " seconds"));
		}
	}
	
	public static void titleContains(MobileDriver driver, MobileElement element, String title){
		try {
            Log4Test.info("- waiting for title to contain : " + title );
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.titleContains(title));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Title does not contain expected text within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void titleContains(MobileDriver driver, MobileElement element, String title, int seconds){
		try {
            Log4Test.info("- waiting for title to contain : " + title );
			new WebDriverWait(driver, seconds).until(ExpectedConditions.titleContains(title));
		} catch (TimeoutException toe){
            Assert.fail(Log4Test.error("Title does not contain expected text within : " + seconds + " seconds"));
		}
	}
	
	public static void titleIs(MobileDriver driver, MobileElement element, String title){
		try {
            Log4Test.info("- waiting for title to be : " + title );
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.titleIs(title));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Title is not what expected within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void titleIs(MobileDriver driver, MobileElement element, String title, int seconds){
		try {
            Log4Test.info("- waiting for title to be : " + title );
			new WebDriverWait(driver, seconds).until(ExpectedConditions.titleIs(title));
		} catch (TimeoutException toe){
            Assert.fail(Log4Test.error("Title is not what expected within : " + seconds + " seconds"));
		}
	}
	
	public static void visibilityOfElement(MobileDriver driver, MobileElement element, String elementName){
		try {
            Log4Test.info("- waiting for element : " + elementName + " : to be visible");
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Element is not visible within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void visibilityOfElement(MobileDriver driver, MobileElement element, int seconds, String elementName){
		try {
            Log4Test.info("- waiting for element : " + elementName + " : to be visible");
			new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Element is not visible within : " + seconds + " seconds"));
		}
	}

	public static void invisibilityOfElement(MobileDriver driver, MobileElement element, String elementName){
		try {
            Log4Test.info("- waiting for element : " + elementName + " : to be invisible");
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Element is not invisible within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void invisibilityOfElement(MobileDriver driver, MobileElement element, int seconds, String elementName){
		try {
            Log4Test.info("- waiting for element : " + elementName + " : to be invisible");
			new WebDriverWait(driver, seconds).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Element is not invisible within : " + seconds + " seconds"));
		}
	}

	public static void selectionStateToBe(MobileDriver driver, MobileElement element, boolean selected, String elementName){
		try {
            Log4Test.info("- waiting for selection state to be : " + selected + " : for element : " + elementName);
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.elementSelectionStateToBe(element, selected));
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("State of element is not : " + selected + " within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void selectionStateToBe(MobileDriver driver, MobileElement element, int seconds, boolean selected, String elementName){
		try {
            Log4Test.info("- waiting for selection state to be : " + selected + " : for element : " + elementName);
			new WebDriverWait(driver, seconds).until(ExpectedConditions.elementSelectionStateToBe(element, selected));
		} catch (TimeoutException toe){
            Assert.fail(Log4Test.error("State of element is not : " + selected + " within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void forAlert(MobileDriver driver){
		try {
            Log4Test.info("- waiting for alert to be present");
			new WebDriverWait(driver, TestData.SHORT_WAIT).until(ExpectedConditions.alertIsPresent());
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Alert is not present within : " + TestData.SHORT_WAIT + " seconds"));
		}
	}

	public static void forAlert(MobileDriver driver, int seconds){
		try {
            Log4Test.info("- waiting for alert to be present");
			new WebDriverWait(driver,seconds).until(ExpectedConditions.alertIsPresent());
		} catch (TimeoutException toe){
			Assert.fail(Log4Test.error("Alert is not present within : " + seconds + " seconds"));
		}
	}
}
