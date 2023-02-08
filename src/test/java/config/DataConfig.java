package config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:remote.properties"})
public interface DataConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("appAndroid")
    String appAndroid();

    @Key("appIos")
    String appIos();

    @Key("url")
    String url();
    @Key("deviceAndroid")
    String deviceAndroid();
    @Key("deviceIos")
    String deviceIos();
    @Key("os_versionAndroid")
    String os_versionAndroid();
    @Key("os_versionIos")
    String os_versionIos();
}
