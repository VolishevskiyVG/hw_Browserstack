//package tests.android.selenide;
//import java.net.URL;
//import java.util.List;
//import java.net.MalformedURLException;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import io.appium.java_client.MobileBy;
//import static io.appium.java_client.AppiumBy.accessibilityId;
//
//import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.ios.IOSElement;
//public class IosTest extends IosTestBase{
//
//
//        // Test case for the BrowserStack sample iOS app.
//        // If you have uploaded your app, update the test case here.
//        IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
//        textButton.click();
//        IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
//        textInput.sendKeys("hello@browserstack.com");
//        Thread.sleep(5000);
//        IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));
//        if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
//            assert(true);
//        else
//            assert(false);
//
//        // Invoke driver.quit() after the test is done to indicate that the test is completed.
//        driver.quit();
//    }
//}