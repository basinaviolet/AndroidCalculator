package configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesReader {

    private static final Properties properties = new Properties();
    private static PropertiesReader instance;

    public static PropertiesReader get() {
        if (instance == null) {
            instance = new PropertiesReader();
            try {
                properties.load(Files.newInputStream(Paths.get("src/main/resources/test.properties")));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public String appPackage() {
        return properties.getProperty("app.package");
    }
    public String appActivity() {
        return properties.getProperty("app.activity");
    }
    public String platformName() {
        return properties.getProperty("platform.name");
    }
    public String platformVersion() {
        return properties.getProperty("platform.version");
    }
    public String automationName() {
        return properties.getProperty("automationName");
    }
    public String localDeviceName() {
        return properties.getProperty("local.device.name");
    }
    public String udid() {
        return properties.getProperty("udid");
    }
    public String appiumAddress() {
        return properties.getProperty("appium.address");
    }
    public int appiumPort() {
        return Integer.parseInt(properties.getProperty("appium.port"));
    }
}
