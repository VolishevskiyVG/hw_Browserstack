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

//import static config.Config.CONFIG;

public class IosBrowserstackDriver implements WebDriverProvider {
    static DataConfig config = ConfigFactory.create(DataConfig.class);


    @SneakyThrows
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        DataConfig config = ConfigFactory.create(DataConfig.class, System.getProperties());

        mutableCapabilities.setCapability("browserstack.user", config.username());
        mutableCapabilities.setCapability("browserstack.key", config.password());


        mutableCapabilities.setCapability("app", config.appIos());


        mutableCapabilities.setCapability("device", config.deviceIos());
        mutableCapabilities.setCapability("os_version", config.os_versionIos());


        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", "First Java Project");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "first_test");


        return new RemoteWebDriver(getRemoteWebDriverUrl(), mutableCapabilities);
    }

    private URL getRemoteWebDriverUrl() {
        try {
            return new URL(config.url());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}


