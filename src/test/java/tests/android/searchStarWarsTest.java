package tests.android;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.id;

public class searchStarWarsTest extends AndroidTestBase {

    @Test
    void searchTest() {
        step("Type search", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("starwars");
        });
        step("Verify content found", () ->
                $(id("org.wikipedia.alpha:id/view_card_header_title")).shouldHave(text("In the news")));

    }
}
