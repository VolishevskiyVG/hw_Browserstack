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
}
