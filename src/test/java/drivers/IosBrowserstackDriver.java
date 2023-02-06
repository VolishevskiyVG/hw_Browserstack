package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.DataConfig;
import lombok.SneakyThrows;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

import static drivers.BrowserstackDriver.CONFIG;

public class IosBrowserstackDriver implements WebDriverProvider {


    @SneakyThrows
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        DataConfig config = ConfigFactory.create(DataConfig.class, System.getProperties());

        mutableCapabilities.setCapability("browserstack.user", config.username());
        mutableCapabilities.setCapability("browserstack.key", config.password());

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", config.app());

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", "iPhone XS");
        mutableCapabilities.setCapability("os_version", "12");


        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", "First Java Project");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "first_test");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        return new RemoteWebDriver(getRemoteWebDriverUrl(), mutableCapabilities);
    }
        private URL getRemoteWebDriverUrl() {
            try {
                return new URL(CONFIG.url());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
}


