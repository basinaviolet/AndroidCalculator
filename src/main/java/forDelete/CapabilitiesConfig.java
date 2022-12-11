package forDelete;

import configuration.PropertiesReader;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesConfig {

    public static DesiredCapabilities getLocalCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", PropertiesReader.get().platformName());
        capabilities.setCapability("platformVersion", PropertiesReader.get().platformVersion());
       capabilities.setCapability("deviceName", PropertiesReader.get().localDeviceName());
        capabilities.setCapability("udid", PropertiesReader.get().udid());
        capabilities.setCapability("appPackage", PropertiesReader.get().appPackage());
        capabilities.setCapability("appActivity", PropertiesReader.get().appActivity());
        return  capabilities;
    }
}
