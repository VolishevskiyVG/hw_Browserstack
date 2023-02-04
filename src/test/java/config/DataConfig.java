package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

//@Config.Sources({"classpath:conf/browserstack.properties"})
@Config.LoadPolicy(MERGE)
@Config.Sources({"system:properties",
        "classpath:config/browserstack.properties"})
public interface DataConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("app")
    String app();

    @Key("url")
    String url();
}
