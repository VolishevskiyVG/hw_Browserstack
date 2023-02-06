package tests.ios;

import org.junit.jupiter.api.Test;
import tests.ios.IosTestBase;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.openqa.selenium.By.id;


public class IosTest extends IosTestBase {


    // Test case for the BrowserStack sample iOS app.
    // If you have uploaded your app, update the test case here.
    @Test
    void testText() {
        $(accessibilityId("Text Button")).click();
        $(id("Text Input")).sendKeys("hello@browserstack.com");
        $(accessibilityId("Text Output")).shouldHave(text("hello@browserstack.com"));
    }

    ;
    //   IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
    //               ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
    //       textButton.click();
    //       IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
    //               ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
    //       textInput.sendKeys("hello@browserstack.com");
    //       Thread.sleep(5000);
    //       IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
    //               ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));
    //       if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
    //           assert(true);
    //       else
    //           assert(false);
//
    //       // Invoke driver.quit() after the test is done to indicate that the test is completed.
    //       driver.quit();
    //   }
}