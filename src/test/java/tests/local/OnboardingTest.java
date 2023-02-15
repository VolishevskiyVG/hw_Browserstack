package tests.local;

import drivers.LocalAndroidDriver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.id;

public class OnboardingTest extends LocalTestBase {
    @Test
    void onBoardingScreenTest() {
        step("Переход на главную страницу", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("The Free Encyclopedia\n" +
                    "…in over 300 languages"));
        });
        step("Перейти на New ways to explore", () -> {
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            assertEquals("New ways to explore", $(id("org.wikipedia.alpha:id/primaryTextView")).text());

        });
        step("Перейти на Reading lists with sync", () -> {
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            assertEquals("Reading lists with sync", $(id("org.wikipedia.alpha:id/primaryTextView")).text());
        });
        step("Перейти на Send anonymous data", () -> {
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
            assertEquals("Send anonymous data", $(id("org.wikipedia.alpha:id/primaryTextView")).text());
        });
        step("Ending onBoarding", () -> {
            $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
            $(id("org.wikipedia.alpha:id/main_toolbar_wordmark")).shouldBe(visible);
        });
    }
}
